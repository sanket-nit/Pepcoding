package array;

import java.util.Arrays;

public class ShuffleTheArray {

    // Driver code
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4,3,2,1};
        int n = arr.length / 2;
        System.out.println(Arrays.toString(shuffle(arr, n)));
    }

    // Main code
    private static int[] shuffle(int[] arr, int n) {
        int[] ans = new int[arr.length];
        int m=0;
        for(int i=0; i<arr.length;i++){
            if (i%2 ==0){
                ans[i] = arr[m];
                m++;
            }
            else{
                ans[i] = arr[n];
                n++;
            }
        }
        return ans;
    }

    // Optimised
    static int[] shuffleOptimised(int[] nums, int n) {
        int[] res = new int[2 * n];
        for (int i = 0, j = n, idx = 0; idx < res.length; i++, j++) {
            res[idx++] = nums[i];
            res[idx++] = nums[j];
        }
        return res;
    }
}



