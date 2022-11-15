package Seminar05;

import java.util.HashMap;
import java.util.Map;

public class CountWords {
    public static void main(String[] args) {
        String[] words1 = {"leetcode","is","amazing","as","is"};
        String[] words2 = {"amazing","leetcode","is"};
        System.out.println(countWords(words1, words2));
    }

    public static int countWords(String[] words1, String[] words2) {
        Map<String, Integer> map = new HashMap<>();
        for (String i : words1) map.put(i, map.getOrDefault(i, 0) + 1);
        for (String i : words2) {
            if (map.containsKey(i)) {
                int temp = map.get(i);
                if (temp > 1) continue;
                map.put(i, map.get(i) - 1);
            }
        }
        int count = 0;
        for (String i : map.keySet()) {
            if (map.get(i) == 0) {
                count++;
            }
        }
        return count;
    }
}
