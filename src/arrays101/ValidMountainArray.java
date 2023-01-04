package arrays101;

public class ValidMountainArray {
    public boolean validMountainArray(int[] arr) {
        if (arr.length <= 2) return false;

        boolean maximumPointFound = false;

        for (int i = 0; i < arr.length - 1; i++) {
            int current = arr[i];
            int next = arr[i + 1];

            if (current == next) return false;

            if (maximumPointFound) {
                if (current <= next) return false;
            } else {
                if (current > next && i == 0) return false;
                if (current > next) maximumPointFound = true;
            }
        }

        return maximumPointFound;
    }

    public static void main(String[] args) {
        ValidMountainArray validMountainArray = new ValidMountainArray();
        System.out.println(validMountainArray.validMountainArray(new int[]{0, 3, 2, 1}));
    }
}
