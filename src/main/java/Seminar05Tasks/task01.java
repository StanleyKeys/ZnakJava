package Seminar05Tasks;

import java.util.*;
import java.util.function.Function;

import static java.util.stream.Collectors.*;

public class task01 {
    public static void main(String[] args) {
        //hashMapIteration();
        //containsDuplicate();
        //containsDuplicateTwo();
        //containsDuplicateThree();
        containsDuplicateFour();
    }

    public static void hashMapIteration() {
        String text = " dfdsgf dfgdfg dfg dfgdsfwet g";
        Map<Character, Integer> hmap = new HashMap<>();
        for (int i = 0; i < text.length(); i++) {
            char curChar = text.charAt(i);
            hmap.putIfAbsent(curChar, 0);
            hmap.put(curChar, hmap.get(curChar) + 1);
        }
        for (var entry : hmap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

    public static void containsDuplicate() {
        int[] nums = new int[]{1, 2, 3, 4};
        Map<Integer, Integer> hmap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int curNumber = nums[i];
            hmap.putIfAbsent(curNumber, 0);
            hmap.put(curNumber, hmap.get(curNumber) + 1);
        }
        boolean result = false;
        for (var entry : hmap.entrySet()) {
            if (entry.getValue() >= 2) result = true;
        }
        System.out.println(result);
    }

    public static void containsDuplicateTwo() {
        int[] nums = new int[]{1, 2, 3, 1};
        int count = 0;
        boolean result = false;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count += 1;
                }
            }
            if (count >= 2) result = true;
            count = 0;
        }
        System.out.println(result);
    }

    public static void containsDuplicateThree() {
        int[] nums = new int[] {1, 2, 3, 1};
        Arrays.sort(nums);
        boolean result = false;
        int i, j = 0;
        for (i = 0; i < (nums.length - 1); i++) {
            if (nums[i] == nums[i + 1]) {
                j = 1;
                break;
            }
        }
        if (j == 1) {
            result =  true;
        }
        System.out.println(result);
    }

    public static void containsDuplicateFour() {
        int[] nums = new int[] {1, 2, 3, 1};
        boolean result = false;
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                result = true;
            }
            set.add(num);
        }
        System.out.println(result);
    }
}
