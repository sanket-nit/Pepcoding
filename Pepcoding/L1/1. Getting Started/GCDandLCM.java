import java.util.*;

public class Main {

  public static void main(String[] args) {
    // write your code here
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int oa = a;
    int ob = b;

    // Divisor Method : GCD
    while (a % b != 0) {
      int rem = a % b;
      a = b;
      b = rem;
    }

    int gcd = b;
    int lcm = (oa * ob) / gcd;

    System.out.println(gcd);
    System.out.println(lcm);

  }
}