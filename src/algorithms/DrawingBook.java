package algorithms;

import java.util.*;

public class DrawingBook {

    static int solve(int n, int p) {
        // Complete this function
        if (p == 1) {
            return 0;
        }
        if (n % 2 == 0) {
            if (p == n) {
                return 0;
            }
        } else {
            if ((p == n) || (p == n - 1)) {
                return 0;
            }
        }

        int fromBeginning = 0;
        int fromEnd = 0;
        for (int i = 1; i < n; i++) {
            if (i == p) {
                break;
            }
            if (i % 2 != 0) {
                fromBeginning++;
            }
        }
        for (int i = n; i > 1; i--) {
            if (i == p) {
                break;
            }
            if (i % 2 == 0) {
                fromEnd++;
            }
        }

        return (fromBeginning < fromEnd ? fromBeginning : fromEnd);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p = in.nextInt();
        int result = solve(n, p);
        System.out.println(result);
    }
}