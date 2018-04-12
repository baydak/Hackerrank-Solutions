package algorithms;

import java.util.*;

public class Staircase {

    static void staircase(int n) {
        /*
         * Write your code here.
         */
        for (int i = 1; i <= n; i++) {
            for (int k = 0; k < n; k++) {
                if (k < (n - i)) {
                    System.out.print(" ");
                } else {
                    System.out.print("#");
                }
            }
            System.out.println();
        }
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine().trim());

        staircase(n);
    }
}
