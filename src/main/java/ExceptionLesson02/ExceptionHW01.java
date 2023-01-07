package ExceptionLesson02;

import java.util.Scanner;

/*

Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
и возвращает введенное значение.

Ввод текста вместо числа не должно приводить к падению приложения, вместо этого,
необходимо повторно запросить у пользователя ввод данных.

 */
public class ExceptionHW01 {
    public static void main(String[] args) {
        inputFloat();
        System.out.println();
    }

    public static void inputFloat() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите дробное число: ");
        if (sc.hasNextFloat()) {
            System.out.println(sc.nextFloat());
            ;
        } else {
            System.out.println("Неверный ввод. Попробуйте еще раз\n");
            inputFloat();
        }
    }
}
