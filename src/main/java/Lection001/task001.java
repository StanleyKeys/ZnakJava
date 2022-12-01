package Lection001;

import java.util.*;

public class task001 {
    public static void main(String[] args) {
        //scan();
        //getChar();
        //HashMapExample();
        LinkedHashMapExample();
    }
    public static void LinkedHashMapExample() {
        Map<Integer, String> linkedMap = new LinkedHashMap<>();
        linkedMap.put(1, "один");
        linkedMap.put(2, "два");                           //метод 'linkedMap.put' кладет данные с ключом в коллекцию.
        linkedMap.put(null, "!!null");
        linkedMap.remove(1, "один");
        for (var item: linkedMap.entrySet()) {
            System.out.printf("[%d: %s]\n", item.getKey(), item.getValue());
        }
        System.out.println(linkedMap);
    }

    public static void HashMapExample() {
        Map<Integer, String> db = new HashMap<>();
        db.put(1, "один");
        db.put(2, "два");                           //метод 'db.put' кладет данные с ключом в коллекцию.
        db.put(null, "!!null");
        db.remove(1, "one");
        for (var item: db.entrySet()) {
            System.out.printf("[%d: %s]\n", item.getKey(), item.getValue());
        }
        System.out.println(db);
    }
    public static void getChar() {
        String[] test = {"a", "r", "o", "w", "b", "c", "p"};
        List<String> tester = new ArrayList(List.of(test));
        Collections.sort(tester);
        System.out.println(tester);
    }
    public static void scan() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        int n = scanner.nextInt();
        boolean checkSimple = true;
        for (int i = 2; i < n; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    checkSimple = false;
                    break;
                }
            }
            if (checkSimple) System.out.println(i);
            else checkSimple = true;
        }
    }
}


