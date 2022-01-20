package linearSearch;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = {1,2,3,4,5,6,67,34};
        System.out.print("Enter target : ");
        int target = sc.nextInt();
        int ans = linearSearch(num, target);
        System.out.println("Target at index : " + ans);
    }

    // Getting array and target
    // running a for loop and comparing each element with target
    // return index of target if found else return -1

    static int linearSearch(int[] arr, int target){
        if (arr.length == 0)
            return -1;
        for(int index = 0; index<arr.length; index++){
            if(arr[index]==target)
                return index;
        }
        // return -1 because index cannot be -1
        return -1;
    }

    // Return element itself
    static int linearSearch2(int[] arr, int target){
        if (arr.length == 0)
            return -1;
        for(int index = 0; index<arr.length; index++){
            if(arr[index]==target)
                return index;
        }
        // return Integer.MAX_VALUE because element can also be equal to -1
        return Integer.MAX_VALUE;
    }
}
