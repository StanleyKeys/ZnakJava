package Seminar02;
import java.util.*; // подгружает необходимые пакеты
public class Combinations {
    public static void main(String[] args) {
        int n = 4;
        int k = 2;
        System.out.println(combine(n, k));
    }
    public static List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        helper(result, temp, n, k, 1);
        return result;
    }

    private static void helper(List<List<Integer>> result, List<Integer> temp, int n, int k, int i) {
        if (temp.size() == k) {
            result.add(new ArrayList<>(temp));
            return;
        }
        for (int j = i; j <= n; j++) {
            temp.add(j);
            helper(result, temp, n, k, j + 1);
            temp.remove(temp.size() - 1);
        }
    }
}
