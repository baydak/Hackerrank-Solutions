package algorithms;

import java.util.Scanner;

public class CountingValleys {

    static int countingValleys(int n, String s) {
        // Complete this function
        int currentLevel = 0;
        int downhillCounter = 0;
        int valleyCounter = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'U') {
                if (currentLevel == 0) {
                    downhillCounter++;
                }
                currentLevel++;
            }
            if (s.charAt(i) == 'D') {
                if (currentLevel == 0) {
                    valleyCounter++;
                }
                currentLevel--;
            }
        }
        return valleyCounter;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();
        int result = countingValleys(n, s);
        System.out.println(result);
        in.close();
    }
}
