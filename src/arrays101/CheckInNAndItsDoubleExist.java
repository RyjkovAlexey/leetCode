package arrays101;

import java.util.ArrayList;
import java.util.List;

public class CheckInNAndItsDoubleExist {
    public boolean checkIfExist(int[] arr) {
        List<Integer> list = new ArrayList<>();

        for (int value : arr) {
            if (list.contains(value * 2) || (value%2==0 && list.contains(value / 2))) return true;
            list.add(value);
        }

        return false;
    }

    public static void main(String[] args) {
        CheckInNAndItsDoubleExist main = new CheckInNAndItsDoubleExist();
        System.out.println(main.checkIfExist(new int[]{3,1,7,11}));
    }
}
