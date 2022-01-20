package functions;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = sc.nextInt();
        boolean ans = isPalindrome(num);
        System.out.println(ans);

    }

    private static boolean isPalindrome(int n) {
        int og,a;
        og = n;
        int rev=0;
        while(n>0){
            a = n%10;
            rev=rev*10+a;
            n=n/10;
        }
        return rev==og;
    }
}
