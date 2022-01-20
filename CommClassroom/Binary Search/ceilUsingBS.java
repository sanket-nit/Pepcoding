package binarySearch;

public class ceilUsingBS {
    public static void main(String[] args) {
        int[] arr = {1, 4, 7, 8, 10 ,15, 17, 19};
        int target = 9;
        int ans = ceil(arr, target);
        System.out.println(ans);
    }

    static int ceil(int[] arr, int target) {
        if (target > arr[arr.length - 1]) return -1;
        int start = 0;
        int end = arr.length - 1;
        while(start<=end){
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) return mid;
            if ( target < arr[mid]) {
                end = mid -1;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }
}
