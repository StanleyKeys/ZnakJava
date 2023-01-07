package ExceptionLesson01;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class ExceptionHW02 {
    public static void main(String[] args) {
        System.out.println("Input 1 Array length: ");
        int[] firstArray = new int[getLength()];
        System.out.println("Input 2 Array length: ");
        int[] secondArray = new int[getLength()];
        if (firstArray.length != secondArray.length) {
            throw new RuntimeException("Размеры массивов не соответствуют.");
        }

        chooseResult(firstArray, secondArray);
        int[] thirdArray = divideArrays(firstArray, secondArray);

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
                throw new NegativeArraySizeException("Величина массива не может быть отрицательным.");
            }
        } catch (RuntimeException e) {
            System.out.println(e);
        }
        return result;
    }

    public static void fillArray(int[] array) {                                         // Заполнение массива.
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (1 + Math.random() * 10);
        }
    }

    public static int[] divideArrays(int[] firstArray, int[] secondArray) {           // Вычитание элементов двух массивов.
        int[] thirdArray = new int[firstArray.length];
        for (int i = 0; i < thirdArray.length; i++) {
            thirdArray[i] = firstArray[i] / secondArray[i];
        }
        return thirdArray;
    }

    public static void fillManualArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = inputtingNumbers();
        }
    }

    public static void chooseResult(int[] firstArray, int[] secondArray) {
        System.out.println("Что вы хотите сделать: \n1. Заполнить массивы случайными числами. \n2. Заполнить массивы в ручную.");
        Scanner sc = new Scanner(System.in);
        String userEnter = sc.nextLine();
        if (Objects.equals(userEnter, "1")) {
            fillArray(firstArray);
            fillArray(secondArray);
        } else if (Objects.equals(userEnter, "2")) {
            fillManualArray(firstArray);
            fillManualArray(secondArray);
        } else {
            System.out.println("Нужно ввести номер пункта меню.");
            System.out.println();
            chooseResult(firstArray, secondArray);
        }
    }

    public static int inputtingNumbers() {
        System.out.println("Input number: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number == 0) {
            throw new RuntimeException("Делить на ноль нельзя");
        }
        return number;
    }
}
