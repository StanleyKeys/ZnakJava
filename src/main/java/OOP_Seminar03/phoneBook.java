package OOP_Seminar03;

import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Создать телефонный справочник с возможностью импорта и экспорта данных в нескольких форматах.
 *
*/

 public class phoneBook {
    public static void main(String[] args) throws IOException {
        new AddressBook();
        System.out.println("+");
    }
}

class AddressBook {

    public AddressBook() throws IOException {
        Map<String, String> pb = new HashMap<>();
        pb.put("Ivanov", "89234325464");
        pb.put("Petrov", "89990001010");
        pb.put("Sidorov", "89001005030");
        pb.put("Spirtov", "89101905050");

        String fileName_txt = "PhoneBook.txt";
        String fileName_xml = "PB.xml";
        Record rec = new Record();
        rec.recordTxt(fileName_txt, pb);
        rec.recordXML(fileName_xml, pb);

    }
}

interface recParams {
    void recordTxt(String fileName, Map<String, String> map) throws IOException;

    void recordXML(String fileName, Map<String, String> map) throws IOException;
}
class Record implements recParams{
    private String phone;
    private String name;
    private String address;

    Record() {
        // ? ? ?
    }

    @Override
    public String toString() {
        return name + ": " + phone + ", " + address;
    }


    @Override
    public void recordTxt(String fileName, Map<String, String> map) throws IOException {
        Map<String, String> pb = new HashMap<>();
        pb = map;
        FileWriter phoneBookTxt = new FileWriter("PhoneBook_TXT.txt", true);
        for (Map.Entry<String, String> item : pb.entrySet()) {
            phoneBookTxt.write(item.getKey() + " " + item.getValue() + "\n");
        }
        phoneBookTxt.flush();
    }

    @Override
    public void recordXML(String fileName, Map<String, String> map) throws IOException {
        Map<String, String> pb = new HashMap<>();
        pb = map;
        FileWriter phoneBookTxt = new FileWriter("PhoneBook_XML.xml", true);
        for (Map.Entry<String, String> item : pb.entrySet()) {
            phoneBookTxt.write(item.getKey() + " " + item.getValue() + "\n");
        }
        phoneBookTxt.flush();
    }


}