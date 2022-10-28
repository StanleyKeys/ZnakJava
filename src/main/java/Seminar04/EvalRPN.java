package Seminar04;

import java.util.*;             //for Stack class
public class EvalRPN {
    public static void main(String[] args) {
        String[] tokens = new String[]{"2","1","+","3","*"};
        System.out.println(evalRPN(tokens));
    }
    public static int evalRPN(String[] tokens) {
        if(tokens.length == 0) return 0;
        Stack<Integer> stack = new Stack<>();
        for (String s : tokens) {
            if (s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")) {
                int b = stack.pop();
                int a = stack.pop();
                switch (s) {
                    case "+" -> stack.push(a + b);
                    case "-" -> stack.push(a - b);
                    case "*" -> stack.push(a * b);
                    case "/" -> stack.push(a / b);
                }
            } else stack.push(Integer.valueOf(s));
        }
        return stack.pop();
    }
}
