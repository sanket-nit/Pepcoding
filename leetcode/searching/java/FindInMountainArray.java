// https://leetcode.com/problems/find-in-mountain-array/

package searching;

public class FindInMountainArray {
    public static void main(String[] args) {
        int[] arr = {1, 4, 6, 7, 6, 3, 2, 1};
        int ans = search(arr, 2);
        System.out.println(ans);
    }

    private static int search(int[] arr, int target){
        int peakIndex = peak(arr);
        int firstTry = orderAgnosticBS(arr, target, 0, peakIndex);
        // Search in first half
        if (firstTry != -1)
            return firstTry;
        int secondTry  = orderAgnosticBS(arr, target, peakIndex + 1, arr.length - 1);
        if (secondTry != -1)
            return secondTry;
        return -1;
    }

    private static int peak(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if(arr[mid] > arr[mid + 1])
                end = mid;
            else {
                start = mid + 1;
            }
        }
        return start; // Here you can return end also because condition collapses when end == start
    }

    static int orderAgnosticBS (int[] arr, int target, int start, int end){

        boolean isAscending = arr[start] < arr[end];

        while(start <= end){
            int mid = start + (end - start) / 2;
            if (arr[mid] == target)
                return mid;
            // For ascending array
            if (isAscending)
            {
                if (target < arr[mid])
                    end = mid-1;
                else
                    start = mid+1;
            }
            // For descending array
            else
            {
                if (target > arr[mid]) {
                    end = mid-1;
                }
                else {
                    start = mid+1;
                }
            }
        }
        return -1;

    }

}
