package arrays101;

public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int countZero = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]!=0){
                nums[countZero++] = nums[i];
            }
        }

        for (int i = countZero; i < nums.length; i++) {
            nums[i] = 0;
        }
    }

    public static void main(String[] args) {
        
    }
}
