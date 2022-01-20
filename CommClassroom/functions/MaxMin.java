package functions;

import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int maxi = max(a,b,c);
        int mini = min(a,b,c);
        System.out.println("Max: "+maxi);
        System.out.println("Min: "+mini);
    }

    static int min(int a, int b, int c) {
        if (a<b){
            if( a<c){
                return a;
            }
            return c;
        } else if(b<c)
            return b;
        else
            return c;
    }

    static int max(int a, int b, int c) {
        if (a > b) {
            if (a > c) {
                return a;
            }
            return c;
        } else if (b > c) {
            return b;
        } else {
            return c;
        }
    }
}
