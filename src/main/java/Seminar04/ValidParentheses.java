package Seminar04;

import java.util.*;             //for Stack class
public class ValidParentheses {
    public static void main(String[] args) {
        String s = "()";
        System.out.println(isValid(s));
    }
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') stack.push(s.charAt(i));
            else {
                if (stack.size() == 0) return false;
                else {
                    char c = stack.pop();
                    if (s.charAt(i) == ')' && c != '(') return false;
                    else if (s.charAt(i) == ']' && c != '[') return false;
                    else if (s.charAt(i) == '}' && c != '{') return false;
                }
            }
        }
        return stack.size() == 0;
    }
}
