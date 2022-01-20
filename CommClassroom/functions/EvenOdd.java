package functions;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        System.out.println(evenOdd(n));
    }

    private static String evenOdd(int n) {
        return n%2==0?"Even":"Odd";
    }
}
