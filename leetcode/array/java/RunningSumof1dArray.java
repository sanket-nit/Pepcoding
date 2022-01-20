package array;

import java.util.Arrays;

public class RunningSumof1dArray {
    public static void main(String[] args) {
        int[] nums = {0,2,1,5,3,4};
        int[] ans = runningSum(nums);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] runningSum(int[] nums) {
        for(int i=1; i<nums.length;i++){
            nums[i]=nums[i]+nums[i-1];
        }
        return nums;
    }
}
