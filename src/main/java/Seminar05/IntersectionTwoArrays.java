package Seminar05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntersectionTwoArrays {
    public static void main(String[] args) {
    int[] nums1 = {1, 2, 2, 1};
    int[] nums2 = {2, 2};
    int[] result;
    result = intersect(nums1,nums2);
    System.out.println(Arrays.toString(result));
    }

    public static int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> resultArray = new ArrayList<>();
        for(int i = 0, j = 0; i < nums1.length && j < nums2.length; ++i, ++j) {
            if (nums1[i] == nums2[j]) resultArray.add(nums1[i]);
            else if (nums1[i] > nums2[j]) i--;
            else j--;
        }
        int[] resemblance = new int[resultArray.size()];
        for(int i = 0; i < resultArray.size(); ++i) resemblance[i] = resultArray.get(i);
        return resemblance;
    }
}