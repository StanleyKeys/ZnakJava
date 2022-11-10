package Seminar03;


import java.util.Scanner;

public class ReplaceCharSummary {
    public static void main(String[] args) {
        //String userEnter = "2? + ?5 = 68";
        System.out.print("Введите уравнение: ");
        Scanner scanner = new Scanner(System.in);
        String userEnter = scanner.nextLine();
        String tempString = "";
        String equalChar = "=";
        String plusChar = "+";
        String userEnter2 = userEnter.replaceAll("\\s","");
        String strArr[] = userEnter2.split("");
        for (int i = strArr.length - 1; i >= 0; i--) {
            String str = strArr[i];
            if (str.equals(equalChar) == true) {
                break;
            }
            tempString += str;
        }
        String summString = new StringBuffer(tempString).reverse().toString();
        tempString = "";

        for (int i = 0; i < strArr.length; i++) {
            String str = strArr[i];
            if (str.equals(plusChar) == true) {
                break;
            }
            tempString += str;
        }
        String firstNumberString = tempString;
        tempString = "";
        for (int i = 0; i < strArr.length; i++) {
            String str = strArr[i];
            if (str.equals(equalChar) == true) {
                break;
            }
            tempString += str;
        }
        String tempArray[] = tempString.split("");
        tempString = "";
        for (int i = tempArray.length - 1; i >= 0; i--) {
            String str = tempArray[i];
            if (str.equals(plusChar) == true) {
                break;
            }
            tempString += str;
        }
        String secondNumberString = new StringBuffer(tempString).reverse().toString();
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
