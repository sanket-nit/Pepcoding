package functions;

import java.util.Scanner;

public class AllPrimes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a,b : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        for (int i = a; i < b; i++) {
            if (isPrime(i)){
                System.out.print(i+" ");
            }
        }
    }
    static boolean isPrime(int n) {
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
