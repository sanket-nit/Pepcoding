package functions;

import java.util.Scanner;

public class SumOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a+"+"+b+"="+sum(a,b));
    }

    static int sum(int a, int b) {
        return a+b;
    }
}
