package searching;

public class PeakInMountainArray {
    public static void main(String[] args) {
        int[] nums = {0, 1, 5, 4, 3, 2, 1};
        int ans = peak(nums);
        System.out.println(ans);
    }

    private static int peak(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if(arr[mid] > arr[mid + 1])
                end = mid;
            else {
                start = mid + 1; // Since arr[mid] < arrr[mid+1] we ignore mid and take mid + 1 s=as start
            }
        }
        return start;
    }
}