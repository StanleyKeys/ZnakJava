package ExceptionLesson02;

import java.util.Random;

/*

2. Если необходимо, исправьте данный код:
(задание 2 https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)

try {
   int d = 0;
   double catchedRes1 = intArray[8] / d;                    //Массив не обьявлен. Массив не заполнен.
   System.out.println("catchedRes1 = " + catchedRes1);      //Ловим Exception, что "Число на ноль делить нельзя"
} catch (ArithmeticException e) {
   System.out.println("Catching exception: " + e);
}

 */

public class ExceptionHW02 {
    public static void main(String[] args) {
        int[] intArray = new int[9];
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = (int) (1 + Math.random() * 10);
        }
        try {
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }

    }
}
