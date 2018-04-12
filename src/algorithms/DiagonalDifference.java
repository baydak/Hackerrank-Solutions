package algorithms;

import java.io.*;
import java.util.*;

public class DiagonalDifference {

    static int diagonalDifference(int[][] a) {
        int diagSum = 0;
        int negDiagSum = 0;
        for (int i = 0; i < a.length; i++) {
            diagSum += a[i][i];
            negDiagSum += a[i][a.length - 1 - i];
        }

        return Math.abs(diagSum - negDiagSum);
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(scan.nextLine().trim());

        int[][] a = new int[n][n];

        for (int aRowItr = 0; aRowItr < n; aRowItr++) {
            String[] aRowItems = scan.nextLine().split(" ");

            for (int aColumnItr = 0; aColumnItr < n; aColumnItr++) {
                int aItem = Integer.parseInt(aRowItems[aColumnItr].trim());
                a[aRowItr][aColumnItr] = aItem;
            }
        }

        int result = diagonalDifference(a);

        bw.write(String.valueOf(result));
        bw.newLine();

        bw.close();
    }
}