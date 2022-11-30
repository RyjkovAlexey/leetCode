package arrays101;

import java.util.Arrays;

public class DuplicateZeros {
    public void duplicateZeros(int[] arr) {
        int countZeros = 0;

        for (int item : arr) {
            if (item == 0) countZeros++;
        }

        for (int i = arr.length - 1, j = arr.length - 1 + countZeros; i >= 0; --i, --j) {
            if (j < arr.length) arr[j] = arr[i];
            if (arr[i] == 0 && --j < arr.length) arr[j] = 0;
        }
    }

    public static void main(String[] args) {
        DuplicateZeros duplicateZeros = new DuplicateZeros();
        int[] arr = new int[]{1, 0, 2, 3, 0, 4, 5, 0};
        System.out.println(Arrays.toString(arr));
        duplicateZeros.duplicateZeros(arr);
        System.out.println(Arrays.toString(arr));
    }
}
