package arrays101;

import java.util.Arrays;

public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        if (nums.length <= 1) return nums.length;

        int j = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[j] != nums[i]) {
                j++;
                nums[j] = nums[i];
            }
        }

        return j + 1;
    }

    public static void main(String[] args) {
        RemoveDuplicates removeDuplicates = new RemoveDuplicates();
        int[] arr = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println(Arrays.toString(arr));
        removeDuplicates.removeDuplicates(arr);
        System.out.println(Arrays.toString(arr));
    }
}
