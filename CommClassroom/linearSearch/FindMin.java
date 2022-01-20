package linearSearch;

public class FindMin {
    public static void main(String[] args) {
        int[] arr = {4,-43,43,34,232,-678};
        System.out.println(min(arr));
    }
    static int min(int[] arr){
        int min = arr[0];
        for(int j: arr){
            if (j<min){
                min=j;
            }
        }
        return min;
    }
}


