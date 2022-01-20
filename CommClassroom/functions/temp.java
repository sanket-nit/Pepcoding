package functions;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class temp {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter no : ");
        int n = scn.nextInt();
        int t = n;
        int rev=0,d;
        while (n>0){
            d = n%10;
            rev = rev*10+d;
            n/=10;
        }
        while (rev > 0) {
            d=rev%10;
            System.out.println(d);
            rev/=10;
        }
    }
}
