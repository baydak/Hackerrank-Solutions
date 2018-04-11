package thirtydaysofcode;

import java.util.Scanner;

public class Day10BinaryNumbers {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. P
        rint output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        in.close();
        int curCount = 0;
        int maxCount = 0;

        while (num > 0) {
            if (num % 2 == 1) {
                curCount++;
                if (maxCount <= curCount) {
                    maxCount = curCount;
                }
            } else {
                curCount = 0;
            }
            num = num / 2;
        }
        System.out.println(maxCount);
    }
}
