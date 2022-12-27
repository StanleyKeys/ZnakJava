package OOP_Seminar07;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class Movie {
    String name;
    int year;
    String genre;
    String country;
    int duration;
    String studio;
    String downloadLink;
    String filePath = "MovieDB.txt";

    public void addMovie() {
        getMovieInfo();
        String movieInfo = String.format(name + "\n" + year + "\n" + genre + "\n" + country + "\n" + duration + "\n" + studio  + downloadLink + "\n\n");

        try {
            FileWriter writer = new FileWriter(filePath, true);
            BufferedWriter bufferWriter = new BufferedWriter(writer);
            bufferWriter.write(movieInfo);
            bufferWriter.close();
            System.out.println("Record is Successful!");
        }
        catch (IOException e) {
            System.out.println(e);
        }
    }

    public void getName() {
        System.out.print("Название фильма: ");
        this.name = readUserInput();
    }

    public void getYear() {
        System.out.print("Год выпуска: ");
        try {
            this.year = Integer.parseInt(readUserInput());
        }
        catch (NumberFormatException e){
            System.out.println("Неверный формат. Попробуйте снова");
            getYear();
        }
    }

    public void getGenre() {
        System.out.print("Жанр: ");
        this.genre = readUserInput();
    }

    public void getCountry() {
        System.out.print("Страна: ");
        this.country = readUserInput();
    }

    public void getDuration() {
        System.out.print("Длительность: ");
        try {
            this.duration = Integer.parseInt(readUserInput());
        }
        catch (NumberFormatException e){
            System.out.println("Неверный формат. Попробуйте снова");
            getDuration();
        }
    }

    public void getStudio() {
        System.out.print("Студия: ");
        this.studio = readUserInput();
    }

    public void getDownloadLink() {
        System.out.print("Название фильма: ");
        this.downloadLink = readUserInput();
    }
    public void getMovieInfo() {
        getName();
        getYear();
        getGenre();
        getCountry();
        getDuration();
        getStudio();
        getDownloadLink();
    }

    public String readUserInput() {
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }

}
