package functions;

import java.util.Scanner;

public class CircumferenceAndArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius : ");
        float r = sc.nextFloat();
        System.out.println("Area = "+area(r));
        System.out.println("Circumference = "+circum(r));

    }

    private static double circum(float r) {
        return 2*3.14*r;
    }

    private static double area(float r) {
        return 3.14*r*r;
    }

}




