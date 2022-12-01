package Seminar05Tasks;

import java.util.*;

public class task02 {
    public static void main(String[] args) {
        //intersectionTwo();
        //twoSum();
        countWords();
    }

    public static void intersectionTwo() {
        int[] nums1 = new int[] {1,2,2,1};
        int[] nums2 = new int[] {2,2};
        if (nums1.length == 0 || nums2.length == 0) System.out.println(Arrays.toString(new int[0]));
        int [] result = new int [nums1.length];
        BitSet set = new BitSet();
        for (int i = 0; i < nums1.length; i++) {
            set.set(nums1[i]);
        }
        int count = 0;
        for (int i = 0; i < nums2.length; i++) {
            if (set.get(nums2[i])){
                result[count++] = nums2[i];
                set.set(nums2[i], false);
            }
        }
        //return Arrays.copyOfRange(result, 0, count);
        System.out.println(Arrays.toString(Arrays.copyOfRange(result, 0, count)));
    }
    public static void twoSum() {
        int[] nums2 = new int[] {2, 7, 11, 15};
        int[] nums1 = new int[] {2, 4, 11, 3};
        int[] nums = new int[] {11, 15, 8, 3, 2, 17, 7};
        int target = 9;
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int req = target - nums[i];
            if (map.containsKey(req)) {
                result[0] = map.get(req);
                result[1] = i;
                //int[] result = new int[] {map.get(req), i};
            }
            map.put(nums[i], i);
        }
        System.out.println(Arrays.toString(result));
    }

    public static void countWords() {
        String[] words3 = new String[] {"leetcode","is","amazing","as","is"};
        String[] words4 = new String[] {"amazing","leetcode","is"};
        String[] words1 = new String[] {"a","ab"};
        String[] words2 = new String[] {"a","a","a","ab"};
        Map<String, Integer> map = new HashMap<>();
        for (String i : words1) {
            map.put(i, map.getOrDefault(i, 0) + 1);         // Добавляет каждый элемент массива в мапу, и считает его количество.
        }
        int counter = 0;
        //System.out.println(map);                // выводит мапу из первой строчки: "слово" = "количество раз в 1 строке"
        //System.out.println();
        for (String i : words2) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) - 1);
                //System.out.println(map2);        // Выводит мапу
            }
        }
        for (String i : map.keySet()) {
            if (map.get(i) == 0) {
                counter++;
            }
        }
        System.out.println(map);
        System.out.println(counter);
    }
}
