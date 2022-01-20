package array;

import java.util.ArrayList;
import java.util.Arrays;

public class CreateTargetArrayInGivenOrder {
    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};
        int[] ans = createTargetArray(nums, index);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            arr.add(index[i], nums[i]);
        }
        System.out.println(arr);
        int[] target = new int[nums.length];
        for (int i = 0; i < nums.length - 1; i++) {
            target[i] = arr.get(i);
        }
        return target;
    }
}
