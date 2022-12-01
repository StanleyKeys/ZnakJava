package Seminar06Tasks;

import java.util.Arrays;
import java.util.HashSet;

public class task01 {
    public static void main(String[] args) {
        //example01();
        //example02();
        Worker w1 = new Worker();
        w1.firstName = "Миша";
        w1.lastName ="Фамилия_1";
        w1.salary = 100;
        w1.id = 1000;

        Worker w4 = new Worker();
        w4.firstName = "Вася";
        w4.lastName ="Фамилия_4";
        w4.salary = 150;
        w4.id = 1500;

        Worker w3 = new Worker();
        w3.firstName = "Миша";
        w3.lastName ="Фамилия_1";
        w3.salary = 100;
        w3.id = 1000;

        System.out.println(w1.toString());
        System.out.println(w3.toString());
        boolean result = w3==w1;
        System.out.println("== : " + result);
        System.out.println("equals: " + w3.equals(w1));
        var workers = new HashSet<Worker>(Arrays.asList(w1, w4, w3));
        System.out.println("contains: " + workers.contains(w4));

    }

    public static void example01() {
        var a = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
        var b = new HashSet<>(Arrays.asList(2, 3, 5, 7, 11, 13, 17));
        var u = new HashSet<Integer>(a); u.addAll(b);
        var r = new HashSet<Integer>(a); r.retainAll(b);            // показать в массиве "r" все схожие элементы с массивом "b"
        var s = new HashSet<Integer>(a); s.removeAll(b);            // удалить из массива "s" все схожие элементы массива "b"

        System.out.println(a);
        System.out.println(b);
        System.out.println(u);
        System.out.println(r);
        System.out.println(s);
    }

    public static void example02() {

    }
}
