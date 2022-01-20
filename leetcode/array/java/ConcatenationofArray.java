package array;

import java.util.Arrays;

public class ConcatenationofArray {

    public static void main(String[] args) {
        int[] nums = {0,2,1,5,3,4};
        int[] ans = getConcatenation(nums);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n*2];
        for(int i=0;i<n*2;i++){
            if(i<n){
                ans[i] = nums[i];
            } else {
                ans[i] = nums[i-n];
            }
        }
        return ans;
    }
}
