package functions;

import java.util.Scanner;

public class SumOfN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        System.out.println(sum(n));
    }

    private static int sum(int n) {
        int sum=0;
        while (n>0){
            sum+=n;
            n--;
        }
        return sum;
    }
}
