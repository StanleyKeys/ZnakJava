package VeterinaryClinicSystem;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class CatInfo {

    String nickname;                // кличка.
    String color;                   // цвет (расцветка).
    String breed;                   // порода.
    int age;                        // возраст.
    int weight;                     // вес.
    int height;                     // рост.
    int id;                         // Id номер животного в базе.
    String masterName;              // uмя хозяина.
    String masterSurname;           // Фамилия хозяина.
    String masterEmail;             // Электронная почта.
    int masterPhoneNumber;          // Номер телефона.


    @Override
    public String toString() {
        return String.format("\nid: %d\nкличка: %s\nцвет: %s\nпорода: %s\nВозраст: %d", id, nickname, color, breed, age);
    }

    public String getMasterInfo() {
        return String.format("Хозяин:\nФамилия: %s\nName: %s\nПочта: %s\nТелефон: %d\n", masterSurname, masterName, masterEmail, masterPhoneNumber);
    }

    /* "Создайте метод public boolean equals(Object o)
        Пропишите в нём логику сравнения котов по параметрам, хранимым в полях. То есть, метод должен возвращать true,
        только если значения во всех полях сравниваемых объектов равны."
    */
    @Override
    public boolean equals(Object obj) {
        CatInfo cI = (CatInfo) obj;
        return id == cI.id && breed == cI.breed && color == cI.color && masterPhoneNumber == cI.masterPhoneNumber;
    }

    // "Переопределите метод хэшкод, пусть возвращает айди животного."
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public static String getBreed(int idBreed) {
        Map<Integer, String> mapBreed = new HashMap<>();
        {
            mapBreed.put(1, "Сибирский");
            mapBreed.put(2, "Британский");
            mapBreed.put(3, "Норвежский");
            mapBreed.put(4, "Мейн-кун");
            mapBreed.put(5, "Сиамский");
        }
        ;
        String temp = null;
        for (var item : mapBreed.entrySet()) {
            if (item.getKey() == idBreed) {
                temp = item.getValue();
            }
        }
        return temp;
    }

    public static String getColor(int idColor) {
        Map<Integer, String> mapBreed = new HashMap<>();
        {
            mapBreed.put(1, "Серый");
            mapBreed.put(2, "Черный");
            mapBreed.put(3, "Белый");
            mapBreed.put(4, "Рыжий");
            mapBreed.put(5, "Черно-Белый");
        }
        ;
        String temp = null;
        for (var item : mapBreed.entrySet()) {
            if (item.getKey() == idColor) {
                temp = item.getValue();
            }
        }
        return temp;
    }

    public static void main(String[] args) {
        System.out.println(getBreed(4));
        System.out.println(getColor(5));
    }
}
