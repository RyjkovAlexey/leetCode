package arrays101;

public class SortedSquares {
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

    }
}
