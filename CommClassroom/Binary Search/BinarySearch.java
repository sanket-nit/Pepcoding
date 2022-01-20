package binarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {10, 14, 23, 72, 91, 104, 856};
        int target = 71;
        System.out.println(search(arr, target));
    }

    // Returns index of target if found
    // Else return -1 if target is not found
    static int search(int[] arr, int target){
        // Initialise start and end
        int start=0;
        int end = arr.length - 1;

        while(start <= end){
            // Calculate index of initial middle element
            //-------------------------------------//
            // int mid = (start + end) / 2;
            // In above calculation it might happen that (start + end) exceeds the +ve range of integer i.e 0 to 2,147,483,647
            // Hence we need new formula for calculating middle element
            //-------------------------------------//
            // New formula for calculating index of initial middle element
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid-1;
            }
            else if (target > arr[mid]){
                start = mid+1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}
