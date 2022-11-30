package arrays101;

import java.util.Arrays;

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int nums1Index = m - 1;
        int nums2Index = n - 1;
        int resultSize = m + n - 1;

        while (nums1Index >= 0 && nums2Index >= 0) {
            if (nums1[nums1Index] > nums2[nums2Index]) {
                nums1[resultSize--] = nums1[nums1Index--];
            } else {
                nums1[resultSize--] = nums2[nums2Index--];
            }
        }
        while (nums2Index >= 0) {
            nums1[resultSize--] = nums2[nums2Index--];
        }
    }

    public static void main(String[] args) {
        MergeSortedArray mergeSortedArray = new MergeSortedArray();
        int[] arr1 = new int[]{1, 2, 3, 0, 0, 0};
        int[] arr2 = new int[]{2, 5, 6};
        mergeSortedArray.merge(arr1, 3, arr2, 3);

        System.out.println(Arrays.toString(arr1));
    }
}
