package searching;

import java.util.Arrays;

public class FirstAndLastPositionOfElement {
    public static void main(String[] args) {
        int[] nums = { -5, -5, -5, 0, 7, 7, 7, 8, 8, 11};
        int target = 0;
        System.out.println(Arrays.toString(occurence(nums,target)));
    }

    public static int[] occurence(int[] nums, int target) {
        int[] ans = {-1,-1};

        ans[0] = search(nums, target, true);
        ans[1] = search(nums, target, false);

        return ans;
    }

    public static int search(int[] nums, int target, boolean isStartIndex) {
        int start = 0;
        int end = nums.length - 1;
        int ans = -1;
        while (start <= end) {
            int mid = end + (start - end) / 2;
            if (nums[mid] == target){
                ans = mid;
                if (isStartIndex)
                    end = mid - 1;
                else
                    start = mid + 1;
            }
            else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }
 }
