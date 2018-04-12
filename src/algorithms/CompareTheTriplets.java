package algorithms;

import java.io.*;
import java.util.*;

public class CompareTheTriplets {

    static int[] solve(int a0, int a1, int a2, int b0, int b1, int b2) {
        int aPoints = 0;
        int bPoints = 0;
        int[] compPoints = new int[2];
        if (a0 > b0) {
            aPoints++;
        } else if (a0 < b0) {
            bPoints++;
        }
        if (a1 > b1) {
            aPoints++;
        } else if (a1 < b1) {
            bPoints++;
        }
        if (a2 > b2) {
            aPoints++;
        } else if (a2 < b2) {
            bPoints++;
        }
        compPoints[0] = aPoints;
        compPoints[1] = bPoints;

        return compPoints;
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] a0A1A2 = scan.nextLine().split(" ");

        int a0 = Integer.parseInt(a0A1A2[0].trim());

        int a1 = Integer.parseInt(a0A1A2[1].trim());

        int a2 = Integer.parseInt(a0A1A2[2].trim());

        String[] b0B1B2 = scan.nextLine().split(" ");

        int b0 = Integer.parseInt(b0B1B2[0].trim());

        int b1 = Integer.parseInt(b0B1B2[1].trim());

        int b2 = Integer.parseInt(b0B1B2[2].trim());

        int[] result = solve(a0, a1, a2, b0, b1, b2);

        for (int resultItr = 0; resultItr < result.length; resultItr++) {
            bw.write(String.valueOf(result[resultItr]));

            if (resultItr != result.length - 1) {
                bw.write(" ");
            }
        }

        bw.newLine();

        bw.close();
    }
}
