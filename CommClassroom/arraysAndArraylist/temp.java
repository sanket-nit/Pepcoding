package arraysAndArraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class temp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Declaration
        ArrayList<Integer> list = new ArrayList<>(10);

        list.add(55);
        list.add(64);
        list.add(87);
        list.add(13);
        System.out.println(list);
        System.out.println(list.contains(55));
        list.remove(2);
        System.out.println(list);
        list.set(2,464);
        System.out.println(list);
        
        //input
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }
        
        // Get item at any index
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));
        }

    }
}
