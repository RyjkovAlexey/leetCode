package arrays101;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ThirdMaximumNumber {
    public static int thirdMax(int[] nums) {
        Set<Integer> maxElements = new HashSet<>();
        for(int element : nums)
        {
            maxElements.add(element);
            if(maxElements.size() > 3)
                maxElements.remove(Collections.min(maxElements));
        }
        if(maxElements.size() == 3)
            return Collections.min(maxElements);
        return Collections.max(maxElements);
    }

    public static void main(String[] args) {
        System.out.println(thirdMax(new int[]{1,2}));
    }
}
