package OOP_Seminar07;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

class SearchSystem {
    ArrayList<String> list = new ArrayList<>();
    AppMenu am = new AppMenu();
    String line;
    File file = new File("MovieDB.txt");
    FileReader fr;

    {
        try {
            fr = new FileReader(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    BufferedReader reader = new BufferedReader(fr);

    public void showDB() throws IOException {
        line = reader.readLine();
        while (line != null) {
            System.out.println(line);
            line = reader.readLine();
        }

    }

    public void createList() throws IOException {
        while ((line = reader.readLine()) != null) {
            if (!line.isEmpty()) {
                list.add(line);

            }
        }
    }

    public String findByName() {
        String result = "";
        String[] stringDB = list.toArray(new String[0]);

        System.out.println("Введите название фильма: ");
        String userEnter = scanningMethod();

        for (int i = 0; i < stringDB.length; i++) {
            if (Objects.equals(stringDB[i], userEnter)) {
                result = String.format("\n Результаты поиска: \n Название: %s \n Год выпуска: %s \n Жанр: %s \n Страна: %s \n Длительность: %s минут \n " +
                        "Студия: %s \n Ссылка: %s", stringDB[i], stringDB[i + 1], stringDB[i + 2], stringDB[i + 3], stringDB[i + 4], stringDB[i + 5], stringDB[i + 6]);
                return result;
            }
            if (i == stringDB.length - 1) {
                result = "Поиск не дал результатов";
            }
        }
        //Set <String> keys = map.keySet();
        //System.out.println("Результаты поиска: " + keys);
        //System.out.println(map);
        return result;
    }

    public String findByYear() {
        String result = "";
        String[] stringDB = list.toArray(new String[0]);

        System.out.println("Введите год выпуска: ");
        String userEnter = scanningMethod();

        for (int i = 0; i < stringDB.length; i++) {
            if (Objects.equals(stringDB[i], userEnter)) {
                result = String.format("\n Результаты поиска: \n Название: %s \n Год выпуска: %s \n Жанр: %s \n Страна: %s \n Длительность: %s минут \n " +
                        "Студия: %s \n Ссылка: %s", stringDB[i - 1], stringDB[i], stringDB[i + 1], stringDB[i + 2], stringDB[i + 3], stringDB[i + 4], stringDB[i + 5]);
                return result;
            } else if (i == stringDB.length - 1 && !Objects.equals(stringDB[i], userEnter)) {
                result = "Поиск не дал результатов";
            }
        }
        return result;
    }

    public String findByGenre() {
        String result = "";
        String[] stringDB = list.toArray(new String[0]);

        System.out.println("Введите жанр: ");
        String userEnter = scanningMethod();

        for (int i = 0; i < stringDB.length; i++) {
            if (Objects.equals(stringDB[i], userEnter)) {
                result = String.format("\n Результаты поиска: \n Название: %s \n Год выпуска: %s \n Жанр: %s \n Страна: %s \n Длительность: %s минут \n " +
                        "Студия: %s \n Ссылка: %s", stringDB[i - 2], stringDB[i - 1], stringDB[i], stringDB[i + 1], stringDB[i + 2], stringDB[i + 3], stringDB[i + 4]);
                return result;
            }
            if (i == stringDB.length - 1) {
                result = "Поиск не дал результатов";
            }
        }
        return result;
    }


    public void searchMenu() throws IOException {
        createList();
        System.out.println("""
                Выберите условия поиска:\s
                1. Название
                2. Год Выпуска
                3. Жанр
                4. Страна
                5. Длительность
                6. Студия выпуска
                """);
        String userEnter = scanningMethod();
        String result = "";
        switch (userEnter) {
            case ("1") -> result = findByName();
            case ("2") -> result = findByYear();
            case ("3") -> result = findByGenre();
            case ("4") -> System.out.println("Функция в разработке");
            case ("5") -> System.out.println("Функция в разработке");
            case ("6") -> System.out.println("Функция в разработке");
        }
        System.out.println(result);
        System.out.println("\n1. Повторить поиск\n2. Главное меню\n3. Выход");
        String userInput = scanningMethod();

        switch (userInput) {
            case ("1"):
                searchMenu();
                break;
            case ("2"):
                am.createMainMenu();
                break;
            case ("3"):
                break;
        }
    }

    public String scanningMethod() {
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }
}
