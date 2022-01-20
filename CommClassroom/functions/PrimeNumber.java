package functions;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        boolean isPrime = prime(n);
        if (isPrime)
            System.out.println("Prime");
        else
            System.out.println("Not Prime");

    }

     static boolean prime(int n) {
        if(n<=1)
            return false;
        int c=2;
        while (c*c <= n){
            if (n%c==0)
                return false;
            c++;
        }
        return true;
    }
}
