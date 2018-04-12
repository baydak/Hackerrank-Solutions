package algorithms;

import java.util.*;

public class Kangaroo {

    static String kangaroo(int x1, int v1, int x2, int v2) {
        // Complete this function
        //if(x1 + v1 > x2 + v2) return "NO";
        double sol = (double) (x2 - x1) / (v1 - v2);
        if (sol >= 1.0 && sol % 1 == 0) {
            return "YES";
        }
        //if((x1 + v1 < x2 + v2) && ((x1 - x2) % (v2 - v1) == 0)) return "YES";
        return "NO";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
        String result = kangaroo(x1, v1, x2, v2);
        System.out.println(result);
    }
}
