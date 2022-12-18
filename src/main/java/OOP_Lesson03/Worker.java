package OOP_Lesson03;

import java.util.Iterator;
import java.util.function.Consumer;

import static java.lang.String.format;

public class Worker implements Iterator<String> {
    public String firstName;
    public String lastName;
    public int age;
    public int salary;


    public Worker(String firstName, String lastName, int age, int salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    int index;

    @Override
    public boolean hasNext() {
        return index++ < 4;
    }

    @Override
    public String next() {
        switch (index) {
            case 1:
                return format("%s", firstName);
            case 2:
                return format("%s", lastName);
            case 3:
                return format("%d years", age);
            case 4:
                return format("%d dollars", salary);
        };
        return null;
    }

    @Override
    public void remove() {
        Iterator.super.remove();
    }

    @Override
    public void forEachRemaining(Consumer<? super String> action) {
        Iterator.super.forEachRemaining(action);
    }
}
