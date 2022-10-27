package Seminar01;

public class RemoveElement {
    public static void main(String[] args) {
        int[] nums = new int[] {3,2,2,3};
        int val = 3;
        System.out.println(removeElement(nums, val));
    }
    public static int removeElement(int[] nums, int val) {
        int removeValue = 0;

        for(int i=0; i<nums.length; i++) {
            if(nums[i] != val) {
                nums[removeValue] = nums[i];
                removeValue++;
            }
        }
        return removeValue;
    }
}
