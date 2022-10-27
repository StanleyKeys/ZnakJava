package Seminar01;

public class ReverseWords {
    public static void main(String[] args) {
        String s = "the sky is blue";
        System.out.println(reverseWords(s));
    }
    public static String reverseWords(String s) {
        StringBuilder sBuilder = new StringBuilder("");
        int sLength = s.length();
        int i = 0, j = 0, k = 0;
        for (i = sLength - 1; i >= 0; i--) {
            while (i >= 0 && s.charAt(i) == ' ') {
                i--;
            }
            j = i;

            while (i >= 0 && s.charAt(i) != ' ') {
                i--;
            }
            k = i + 1;

            while (k <= j) {
                sBuilder.append(s.charAt(k));
                k++;
            }

            while (i >= 0 && s.charAt(i) == ' ') {
                i--;
            }
            if (i != -1) sBuilder.append(' ');
            i += 1;
        }
        return sBuilder.toString();
    }
}
