package linearSearch;

public class EvenDigits {
    public static void main(String[] args) {
        int[] arr = {12,749,63,4,54,56,6,455,4545};
        System.out.println(findNumbers(arr));
        System.out.println(digits2(0));
    }

    static int findNumbers(int[] arr){
        int count=0;
        for(int num: arr){
            if (even(num)){
                count++;
            }
        }
        return count;
    }

    // Checks even or not
    static boolean even(int num) {
        int noOfDigits = digits(num);
        return noOfDigits % 2 == 0;
     }

    // Count number digits
    static int digits(int num) {
        if (num<0){
            num*=-1;
        }
        if (num==0){
            return 1;
        }
        int count = 0;
        while(num>0){
            num=num/10;
            count++;
        }
        return count;
    }

    // Shortcut for counting number of digits
    static int digits2(int num){
        if (num<0)
            num*=-1;
        if (num==0)
            return 1;
        return (int)(Math.log10(num)+1);
    }

//Brainstorming
//    static int temp(int[] arr){
//        int count = 0;
//        for (int j : arr) {
//            int c = 0;
//            while(j>0){
//                j=j/10;
//                c++;
//            }
//            if (c%2==0){
//                count++;
//            }
//
//        }
//        return count;
//    }
}
