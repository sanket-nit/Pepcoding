package linearSearch;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {32,46,78,3},
                {76,78,34,45,57,7,87},
                {80,54,47,74}
        };
        int target = 8747;
        int[]ans = search(arr,target);
        System.out.println("Index : "+ Arrays.toString(ans));
    }

    private static int[] search(int[][] arr,int target) {
        if (arr.length == 0){
            return new int[]{-1};
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1};
    }
}
