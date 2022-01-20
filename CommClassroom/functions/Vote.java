package functions;

import java.util.Scanner;

public class Vote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age : ");
        int age = sc.nextInt();
        System.out.println(isEligible(age));
    }

    static String isEligible(int age) {
        return age>=18?"Eligible":"Not Eligible";
    }
}
