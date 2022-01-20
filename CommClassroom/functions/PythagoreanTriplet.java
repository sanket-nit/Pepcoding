package functions;

import java.util.Scanner;

public class PythagoreanTriplet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a,b,c : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        boolean ans = isTriplet(a,b,c);
        System.out.println(ans);
    }

    static boolean isTriplet(int a, int b, int c) {
        return (a*a + b*b)==c*c;
    }
}
