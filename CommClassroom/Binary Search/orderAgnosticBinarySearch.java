package binarySearch;

public class orderAgnosticBinarySearch {
    public static void main(String[] args) {
        int[] arr = { 75, 54, 34, 31, 30, 12, 11, 8, 3, 2 };
        int target = 31;
        int ans = orderAgnosticBS(arr, target);
        System.out.println(ans);
    }

    static int orderAgnosticBS (int[] arr, int target){
        // Initialise start and end
        int start=0;
        int end = arr.length - 1;
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
