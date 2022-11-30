package arrays101;

import java.util.Arrays;

public class Test {
    //Given a binary array nums, return the maximum number of consecutive 1's in the array.
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxSum = 0;
        int currentSum = 0;

        for (int num : nums) {
            if (num == 1) {
                currentSum++;
            } else {
                if (currentSum > maxSum) maxSum = currentSum;
                currentSum = 0;
            }
        }

        return Math.max(currentSum, maxSum);
    }

    //find count evenNumbers
    public int findNumbers(int[] nums) {
        int evenCount = 0;

        for (int num : nums) {
            int numberCount = 1;
            while (num / 10 > 0) {
                numberCount++;
                num /= 10;
            }
            if (numberCount % 2 == 0) evenCount++;
        }

        return evenCount;
    }

    public int[] sortedSquares(int[] arr) {
        int n = arr.length, left = 0, right = n - 1;

        int result[] = new int[n];

        for(int index = n - 1; index >= 0; index--)
        {
            if (Math.abs(arr[left]) > arr[right])
            {
                result[index] = arr[left] * arr[left];
                left++;
            }
            else
            {
                result[index] = arr[right] * arr[right];
                right--;
            }
        }
        for(int i = 0; i < n; i++)
            arr[i] = result[i];

        return result;
    }

    public static void main(String[] args) {
        Test test = new Test();
        System.out.println(Arrays.toString(test.sortedSquares(new int[]{-4, -1, 0, 3, 10})));
    }
}
