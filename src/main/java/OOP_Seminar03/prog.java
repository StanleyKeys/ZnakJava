package OOP_Seminar03;

import org.w3c.dom.ranges.RangeException;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class prog {

    public static void main(String[] args) throws IOException, CloneNotSupportedException {
        PhoneBook pb = new PhoneBook();

        pb.addRecord("","","");
        final String FILE_NAME = "123.txt";

        /*Files.write(Paths.get(FILE_NAME),
                pb.entrySet().stream().map(k -> k.getKey() + "\r\n" + k.getValue()).collect(Collectors.toList()),
                StandardCharsets.UTF_8)   */
    }

}
class Records {
    private final long id;
    private String phone;
    private String name;
    private String address;

    Records(long id, String phone, String name, String address) {
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
}

class PhoneBook {
    private Map<Long, Record> pbRecords = new HashMap<Long, Record>();
    private long nextId;

    private long getNextId() {
        if (nextId < Long.MAX_VALUE && !pbRecords.containsKey(nextId))
            return nextId++;
        nextId = 0;
        while (nextId < Long.MAX_VALUE) {
            if (!pbRecords.containsKey(nextId))
                return nextId;
            ++nextId;
        }
        throw new RangeException((short) 111, "No more IDs availiable");
    }

    public Record addRecord(String phone, String name, String address) throws CloneNotSupportedException {
        long recordId = getNextId();
        //Record record = new Record(phone, name, address);
        //pbRecords.put(recordId, record);
        return null;
    }
}