package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KidsWiththeGreatestNumberofCandies {
    // Driver Code
    public static void main(String[] args) {
        int[] candies = {4,2,1,1,2};
        System.out.println(kidsWithCandies(candies, 1));
    }

    // Main Code
    static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result= new ArrayList<Boolean>(candies.length);
        int max = Arrays.stream(candies).max().getAsInt();
        for (int candy : candies) {
            if (candy + extraCandies >= max)
                result.add(true);
            else
                result.add(false);
        }
        return result;
    }
}
