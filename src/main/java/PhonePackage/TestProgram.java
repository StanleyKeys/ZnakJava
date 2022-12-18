package PhonePackage;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.w3c.dom.ranges.RangeException;



class Record implements Serializable, Cloneable {
    private final long id;
    private String phone;
    private String name;
    private String address;
    Record(long id, String phone, String name, String address) {
        this.id = id;
        this.phone = phone;
        this.name = name;
        this.address = address;
    }
    @Override
    public String toString() {
        return name + ": " + phone + ", " + address;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Record other = (Record) obj;
        if ((this.phone == null) ? (other.phone != null) : !this.phone.equals(other.phone)) {
            return false;
        }
        if ((this.name == null) ? (other.name != null) : !this.name.equals(other.name)) {
            return false;
        }
        if ((this.address == null) ? (other.address != null) : !this.address.equals(other.address)) {
            return false;
        }
        return true;
    }
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + (int) (this.id ^ (this.id >>> 32));
        hash = 61 * hash + (this.phone != null ? this.phone.hashCode() : 0);
        hash = 61 * hash + (this.name != null ? this.name.hashCode() : 0);
        hash = 61 * hash + (this.address != null ? this.address.hashCode() : 0);
        return hash;
    }
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    public long getId() {
        return id;
    }
    public String getPhone() {
        return phone;
    }
    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
}

class AddressBook {
    private Map<Long, Record> records = new HashMap<Long, Record>();
    private long nextId;
    private long getNextId() {
        if (nextId < Long.MAX_VALUE && !records.containsKey(nextId))
            return nextId++;
        nextId = 0;
        while (nextId < Long.MAX_VALUE) {
            if (!records.containsKey(nextId))
                return nextId;
            ++nextId;
        }
        throw new RangeException((short)111, "No more IDs availiable");
    }
    public Record addRecord(String phone, String name, String address) throws CloneNotSupportedException {
        long recordId = getNextId();
        Record record = new Record(recordId, phone, name, address);
        records.put(recordId, record);
        return (Record)record.clone();
    }
    public Record getRecord(long id) throws CloneNotSupportedException {
        if (records.containsKey(id))
            return (Record)records.get(id).clone();
        return null;
    }
    public Record updateRecord(long id, String phone, String name, String address)
            throws CloneNotSupportedException {
        Record record = new Record(id, phone, name, address);
        records.put(id, record);
        return getRecord(id);
    }
    public void removeRecord(long id) {
        records.remove(id);
    }
    public List<Record> allRecords() {
        List<Record> result = new ArrayList<Record>();
        for (Record record : this.records.values())
            result.add(record);
        return result;
    }
}

public class TestProgram {
    public static void main(String[] args) throws IOException, CloneNotSupportedException {
        AddressBook addressBook = new AddressBook();
        //addressBook.addRecord("123-11-32", "ван ванов", "ул. Ленина, 3");
        addressBook.addRecord("883-47-21", "Петр Петров", "пр. Мира");
        addressBook.addRecord("919-41-85", "Николай Николаев", "пер. Славы");
        System.out.println(addressBook.allRecords());


        String FILE_NAME = "PhoneBook.txt";


        Map<String, String> hm = new HashMap<>();
        hm.put("k1", "v1");
        hm.put("k2", "v2");
        hm.put("k3", "v3");


        Files.write(Paths.get(FILE_NAME),
                hm.entrySet().stream().map(k->k.getKey()+"\r\n"+k.getValue()).collect(Collectors.toList()),
                StandardCharsets.UTF_8);
    }


}
