// 1 - Find pivot - largest element in array
//   - pivot condition mid > mid + 1

package searching;

public class SearchInRotatedArray {
    public static void main(String[] args) {
        int[] arr = {2,4,5,2,2,2,2,2,2};
        int target = 3;
        int ans = search(arr, target);
        System.out.println(ans);
    }

    private static int search(int[] arr, int target) {
        int pivot = findPivot(arr);
        System.out.println("pivot : " + pivot);
        if (pivot == -1) {
            return(binarySearch(arr, target, 0, arr.length - 1));
        }
        if (arr[pivot] == target) {
            return pivot;
        }
        if (target < arr[0]) {
            return(binarySearch(arr, target, pivot + 1, arr.length - 1));
        } else {
            return(binarySearch(arr, target, 0, pivot - 1));
        }
    }

    private static int binarySearch(int[] arr, int target, int start, int end) {
        while ( start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target)
                return mid;
            if (arr[mid] < target)
                start = mid + 1;
            else
                end = mid - 1;
        }
        return -1;
    }

    private static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while ( start <= end) {
            int mid = start + (end - start) / 2;
            if (mid < end  && arr[mid] > arr[mid + 1])
                return mid;
            if (mid > start && arr[mid] < arr[mid - 1])
                return mid -1;
            if (arr[start] >= arr[mid])
                end = mid - 1;
            else
                start = mid + 1;
        }
        return -1;
    }
}
