package arraysAndArraylist;

public class Max {
    public static void main(String[] args) {
        int[] arr = {5,3,6,4,8,2,54,6};
//        System.out.println(max(arr));
        System.out.println(maxRange(arr,1, 5));
    }

    static int maxRange(int[] arr,int start, int end){
        if (start>end){
            return -1;
        }
        if (arr==null){
            return -1;
        }
        int max = arr[start];
        for (int i = start; i < end; i++) {
            if (arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }

    private static int max(int[] arr) {
        int max = arr[0];
        for (int j : arr) {
            if (j > max) {
                max = j;
            }
        }
        return max;
    }
}
