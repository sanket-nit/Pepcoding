package functions;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        int res = fact(n);
        System.out.println(res);
    }

    private static int fact(int n) {
        if (n==1||n==0){
            return 1;
        }
        int f=1;
        for (int i = n; i > 1; i--) {
            f=f*i;
        }
        return f;
    }
}
