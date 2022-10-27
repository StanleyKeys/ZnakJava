package Seminar02;

import java.util.Scanner;

public class ClimbingStairs {
    public static void main(String[] args) {
        Scanner userEnter = new Scanner(System.in);
        System.out.print("Input the number: ");
        int num = userEnter.nextInt();
        userEnter.close();
        System.out.println(recursion(0, num));
    }
    public static int recursion(int i, int n) {
        if (i > n) return 0;
        if (i == n) return 1;
        return recursion(i + 1, n) + recursion(i + 2, n);
    }
}
