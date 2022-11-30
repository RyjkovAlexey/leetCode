package arrays101;

import java.util.Arrays;

//Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The relative order of the elements may be changed.
public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int j = nums.length - 1;
        int i = 0;
        int count = 0;

        while (i < j) {
            if (nums[i] == val) {
                if (nums[j] == val) {
                    while (nums[j] == val && i < j) j--;
                }
                int jVal = nums[j];
                nums[j] = nums[i];
                nums[i] = jVal;
                j--;
            }
            i++;
        }

        for (int num : nums) {
            if (num!=val) count++;
        }

        return count;
    }

    public static void main(String[] args) {
        RemoveElement removeElement = new RemoveElement();

        int[] arr = new int[]{1};

        System.out.println(Arrays.toString(arr));

        System.out.println((removeElement.removeElement(arr, 1)));

        System.out.println(Arrays.toString(arr));
    }
}
