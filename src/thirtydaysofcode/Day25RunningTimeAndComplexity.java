package thirtydaysofcode;

import java.util.*;

public class Day25RunningTimeAndComplexity {

    static boolean isItPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String result = isItPrime(sc.nextInt()) ? "Prime" : "Not prime";
            System.out.println(result);
        }
        sc.close();
    }
}
