package ExceptionLesson02;

import java.util.InputMismatchException;
import java.util.Scanner;

/*

Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
Пользователю должно показаться сообщение, что пустые строки вводить нельзя.

 */
public class ExceptionHW04 {
    public static void main(String[] args) {
        System.out.println("Input the message: ");
        Scanner sc = new Scanner(System.in);
        String userEnter = sc.nextLine();
        if (userEnter.isEmpty()) {
            throw new InputMismatchException("Пустые строки вводить нельзя");
        }
        System.out.println(userEnter);
    }
}
