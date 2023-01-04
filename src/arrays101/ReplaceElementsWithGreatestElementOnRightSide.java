package arrays101;

import java.util.Arrays;

public class ReplaceElementsWithGreatestElementOnRightSide {
    public static int[] replaceElements(int[] arr) {
        for (int i = arr.length - 1, mx = -1; i >= 0; --i)
            mx = Math.max(arr[i], arr[i] = mx);
        return arr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(replaceElements(new int[]{400})));
    }
}
