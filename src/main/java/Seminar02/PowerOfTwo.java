package Seminar02;
import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        Scanner userEnter = new Scanner(System.in);
        System.out.print("Input the number: ");
        int num = userEnter.nextInt();
        userEnter.close();
        System.out.println(isPowerOfTwo(num));
    }
    public static boolean isPowerOfTwo(int n) {
        if(n == 1) return true;
        if(n == 0 || n % 2 != 0) return false;
        return isPowerOfTwo(n / 2);
    }
}
