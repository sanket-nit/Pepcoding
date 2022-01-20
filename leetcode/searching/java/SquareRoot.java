package searching;

public class SquareRoot {
    public static void main(String[] args) {
        int x = 2147395599;
        int ans = mySqrt(x);
        System.out.println(ans);
    }
    public static int mySqrt(int x) {
        if (x <= 0 )
            return 0;
        int start = 1;
        int end = x;
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid == x/mid) {
                return mid;
            }
            if(mid < x / mid) {
                start = mid + 1;
                ans = mid;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }
}
