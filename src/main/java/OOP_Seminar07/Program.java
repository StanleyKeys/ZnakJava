package OOP_Seminar07;

import java.io.*;
import java.util.*;

public class Program {
    public static void main(String[] args) throws IOException {
        //var m = new Movie();
        //m.addMovie();
        //var ss = new SearchSystem();
        //ss.createList();
        //ss.searchMenu();
        var am = new AppMenu();
        am.createMainMenu();

    }

}

class AppMenu {
    Movie m = new Movie();
    SearchSystem ss = new SearchSystem();

    public void createMainMenu() throws IOException {
        System.out.println("""
                Добро Пожаловать в Торрент-треккер 'Не скачаешь - Не сядешь!'\s
                Выберите нужный пункт меню:\s
                1. Добавить фильм
                2. Поиск фильма в БД
                3. Список фильмов
                """);
        Scanner in = new Scanner(System.in);
        String userEnter = in.nextLine();

        switch (userEnter) {
            case ("1") -> m.addMovie();
            case ("2") -> ss.searchMenu();
            case ("3") -> ss.showDB();
        }

    }
}





