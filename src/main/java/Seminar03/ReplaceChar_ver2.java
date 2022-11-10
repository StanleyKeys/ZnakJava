package Seminar03;

import java.util.Scanner;

public class ReplaceChar_ver2 {
    public static void main(String[] args) {
        //String userEnter = "2? + ?5 = 68";
        System.out.print("Введите уравнение: ");
        Scanner scanner = new Scanner(System.in);
        String userEnter = scanner.nextLine();
        StringBuilder tempString = new StringBuilder();
        String equalChar = "=";
        String plusChar = "+";
        String userEnter2 = userEnter.replaceAll("\\s","");
        String[] strArr = userEnter2.split("");
        for (int i = strArr.length - 1; i >= 0; i--) {
            String str = strArr[i];
            if (str.equals(equalChar)) {
                break;
            }
            tempString.append(str);                  // было tempString += str;
        }
        String summString = new StringBuffer(tempString.toString()).reverse().toString();
        tempString = new StringBuilder();

        for (String str : strArr) {       // было for (int i = 0; i < strArr.length; i++)
            if (str.equals(plusChar)) {
                break;
            }
            tempString.append(str);
        }
        String firstNumberString = tempString.toString();
        tempString = new StringBuilder();
        for (String str : strArr) {
            if (str.equals(equalChar)) {
                break;
            }
            tempString.append(str);
        }
        String[] tempArray = tempString.toString().split("");
        tempString = new StringBuilder();
        for (int i = tempArray.length - 1; i >= 0; i--) {
            String str = tempArray[i];
            if (str.equals(plusChar)) {
                break;
            }
            tempString.append(str);
        }
        String secondNumberString = new StringBuffer(tempString.toString()).reverse().toString();
        String tempString1 = firstNumberString;
        String tempString2 = secondNumberString;
        String result = "";
        for (int i = 0; i < 10; i++) {
            String str = Integer.toString(i);
            firstNumberString = firstNumberString.replace("?", str);
            int firstNumber = Integer.parseInt(firstNumberString);
            for (int j = 0; j < 10; j++) {
                String str2 = Integer.toString(j);
                secondNumberString = secondNumberString.replace("?", str2);
                int secondNumber = Integer.parseInt(secondNumberString);
                if (firstNumber + secondNumber == Integer.parseInt(summString)) {
                    result = firstNumberString + " + " + secondNumberString + " = " + summString;
                }
                secondNumberString = tempString2;
            }
            firstNumberString = tempString1;
        }
        System.out.println(" ");
        System.out.println("Ваше уравнение: " + result);
    }
}
