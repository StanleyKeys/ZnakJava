package Seminar05;

import java.util.HashMap;
import java.util.Map;

public class containsNearbyDuplicate {
    public static void main(String[] args) {
    int k = 3;
    int[] nums = {1, 2, 3, 1};
        System.out.println(containsDuplicate(nums, k));
    }

    public static boolean containsDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                if (i - map.get(nums[i]) <= k) return true;
            }
            map.put(nums[i], i);
        }
        return false;
    }
}
