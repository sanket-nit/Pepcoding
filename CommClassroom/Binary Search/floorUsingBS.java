package binarySearch;

public class floorUsingBS {
    public static void main(String[] args) {
        int[] arr = {2, 4, 7, 8, 10 ,15, 17, 19};
        int target = 1;
        int ans = floor(arr, target);
        System.out.println(ans);
    }

    static int floor(int[] arr, int target) {
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
        return end;

    }
}

