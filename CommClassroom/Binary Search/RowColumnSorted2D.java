package binarySearch;

import java.util.Arrays;

public class RowColumnSorted2D {
    public static void main(String args[]) {
        int[][] arr = {
            {10, 20, 30, 40},
            {12, 22, 35, 45},
            {18, 27, 37, 49},
            {20, 33, 39, 52},
        };

        int target = 27;
        int ans[] = search(arr, target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] search(int[][] arr, int target) {
        int r = 0;
        int c = arr.length - 1;

        while (r < arr.length && c >= 0) {
            if (arr[r][c] == target) {
                return new int[] {r, c};
            }
            if (arr[r][c] > target) {
                c--;
            } else {
                r++;
            }
        }
        return new int[] { -1, -1};
    }

}
