package linearSearch;

import java.util.Scanner;

public class SearchInRange {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = {1,2,3,4,5,6,67,34};
        System.out.print("Enter target : ");
        int target = sc.nextInt();

        System.out.print("Enter range : ");
        int start = sc.nextInt();
        int end = sc.nextInt();
        int ans = linearSearch(num, target, start, end);
        System.out.println("Target at index : " + ans);
    }

    static int linearSearch(int[] arr, int target, int start, int end){
        if (arr.length == 0 || start>end)
            return -1;
        for(int index = start; index<end; index++){
            if(arr[index]==target)
                return index;
        }
        // return -1 because index cannot be -1
        return -1;
    }
}
