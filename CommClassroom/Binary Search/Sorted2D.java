package binarySearch;

public class Sorted2D {
    public static void main(String[] args) {
        int arr[][] = {
            {1, 2, 3 , 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        };
        int target = 11;

        int n = arr.length;
        int m = arr[0].length;
        int s = 0;
        int e = (n * m) - 1;

        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (arr[mid / m][mid % m] == target) {
                System.out.println("Element at index [" + (mid / m) + ", " + (mid % m) + "]");
                break;
            }
            if (arr[mid / m][mid % m] > target) {
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
    }
}
