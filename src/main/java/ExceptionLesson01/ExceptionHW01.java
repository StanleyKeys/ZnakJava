package ExceptionLesson01;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ExceptionHW01 {
    public static void main(String[] args) {
        System.out.println("Input 1 Array length: ");
        int[] firstArray = new int[getLength()];
        System.out.println("Input 2 Array length: ");
        int[] secondArray = new int[getLength()];
        if (firstArray.length != secondArray.length) {
            throw new ArrayIndexOutOfBoundsException("Размеры массивов не соответствуют.");
        }
        fillArray(firstArray);
        fillArray(secondArray);
        int[] thirdArray = subtractArrays(firstArray, secondArray);

        System.out.println(Arrays.toString(firstArray));
        System.out.println(Arrays.toString(secondArray));
        System.out.println();
        System.out.println(Arrays.toString(thirdArray));
    }

    public static int getLength() {
        Scanner sc = new Scanner(System.in);
        int result = 0;
        try {
            result = sc.nextInt();
            if (result < 0) {
                //System.out.println("Величина массива не может быть отрицательным. Введите еще раз");
                throw new RuntimeException("Величина массива не может быть отрицательным.");
            }
        } catch (RuntimeException e) {
            System.out.println(e);
        }
        return result;
    }

    public static void fillArray(int[] array) {                                         // Заполнение массива.
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
        }
    }

    public static int[] subtractArrays(int[] firstArray, int[] secondArray) {           // Вычитание элементов двух массивов.
        int[] thirdArray = new int[firstArray.length];
        for (int i = 0; i < thirdArray.length; i++) {
            thirdArray[i] = firstArray[i] - secondArray[i];
        }
        return thirdArray;
    }
}
