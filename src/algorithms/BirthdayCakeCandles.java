package algorithms;

import java.io.*;
import java.util.*;

public class BirthdayCakeCandles {

    static int birthdayCakeCandles(int n, int[] ar) {
        int maxEqCount = 0;
        int max = ar[0];
        for (int i = 0; i < n; i++) {
            if (ar[i] > max) {
                max = ar[i];
            }
        }
        for (int i = 0; i < n; i++) {
            if (ar[i] == max) {
                maxEqCount++;
            }
        }
        return maxEqCount;
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(scan.nextLine().trim());

        int[] ar = new int[n];

        String[] arItems = scan.nextLine().split(" ");

        for (int arItr = 0; arItr < n; arItr++) {
            int arItem = Integer.parseInt(arItems[arItr].trim());
            ar[arItr] = arItem;
        }

        int result = birthdayCakeCandles(n, ar);

        bw.write(String.valueOf(result));
        bw.newLine();

        bw.close();
    }
}
