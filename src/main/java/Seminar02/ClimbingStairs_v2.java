package Seminar02;

import java.util.Scanner;

public class ClimbingStairs_v2 {
    public static void main(String[] args) {
        Scanner userEnter = new Scanner(System.in);
        System.out.print("Input the number: ");
        int num = userEnter.nextInt();
        userEnter.close();
        System.out.println(climbStairs(num));
    }
    public static int climbStairs(int n) {
        if (n == 1) return 1;
        int numOne = 1;
        int numTwo = 2;
        for (int i = 3; i <= n; i ++) {
            int current = numOne + numTwo;
            numOne = numTwo;
            numTwo = current;
        }
        return numTwo;
    }
}
