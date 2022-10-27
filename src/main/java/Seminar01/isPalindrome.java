package Seminar01;

public class isPalindrome {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }
    public static boolean isPalindrome(String s) {
        int lo = 0;
        int hi = s.length() - 1;
        char loCh, hiCh;
        while (lo < hi) {
            loCh = s.charAt(lo);
            if (!Character.isLetterOrDigit(loCh)) {
                lo++;
                continue;
            }
            hiCh = s.charAt(hi);
            if (!Character.isLetterOrDigit(hiCh)) {
                hi--;
                continue;
            }
            if (Character.toLowerCase(loCh) != Character.toLowerCase(hiCh)) {
                return false;
            }
            lo++;
            hi--;
        }
        return true;
    }
}


