package ExceptionLesson02;

/*

Дан следующий код, исправьте его там, где требуется:
(задание 3 https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)

 */

public class ExceptionHW03 {
    public static void main(String[] args) throws Exception {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = {1, 2};                           // Длина массива = 2.
            abc[3] = 9;                                     //А мы пытаемся положить число в 3 ячейку.
        } catch (IndexOutOfBoundsException ex) {                                // Убрал два лишних исключения,
            System.out.println("Массив выходит за пределы своего размера!");    // которые здесь были бессмысленны.
        }
    }

    public static void printSum(Integer a, Integer b) {         // "throws FileNotFoundException" бесполезно здесь.
        System.out.println(a + b);
    }

}

