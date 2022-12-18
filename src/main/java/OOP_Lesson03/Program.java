package OOP_Lesson03;

import java.util.Iterator;

public class Program {


    public static void main(String[] args) {
        Worker worker = new Worker("Name", "lasName", 23, 1234);
        Iterator<String> components = worker;

        while (components.hasNext()) {
            System.out.println(worker.next());
        }

    }

}



