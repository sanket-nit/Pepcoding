//https://www.pepcoding.com/resources/online-java-foundation/getting-started/rotate-a-number-official/ojquestion

import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int nod = 0;
        int temp = n;

        while (temp > 0) {
            temp /= 10;
            nod++;
        }

        // If k > nod then we won't be doing repetitive rotations
        k = k % nod;

        // Converting -ve rotations into +ve
        if (k < 0) {
            k = k + nod;
        }

        int div = (int) Math.pow(10, k);
        int mult = (int) Math.pow(10, nod - k);

        int quotient = n / div;
        int remainder = n % div;

        int rot =  remainder * mult + quotient;

        System.out.println(rot);

    }
}

