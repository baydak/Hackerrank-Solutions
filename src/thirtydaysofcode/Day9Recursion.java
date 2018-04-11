package thirtydaysofcode;

import java.util.Scanner;

public class Day9Recursion {

    static int factorial(int n) {
        // Complete this function
        if (n == 1 || n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int result = factorial(n);
        System.out.println(result);
    }
}
