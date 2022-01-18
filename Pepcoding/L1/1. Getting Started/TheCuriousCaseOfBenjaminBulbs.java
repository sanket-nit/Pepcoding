// https://www.pepcoding.com/resources/online-java-foundation/getting-started/benjamin-bulbs-official/ojquestion#!

import java.util.*;

public class Main {

  public static void main(String[] args) {
    // write your code here
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    for (int i = 1; i * i <= n; i++) {
      System.out.println(i * i);
    }
  }
}

// Perfect Squares have odd number of factors