package algorithms;

import java.util.*;

public class PlusMinus {

    static void plusMinus(int[] arr) {
        int posCount = 0;
        int negCount = 0;
        int zeroCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                posCount++;
            } else if (arr[i] < 0) {
                negCount++;
            } else {
                zeroCount++;
            }
        }
        System.out.println((double) posCount / arr.length);
        System.out.println((double) negCount / arr.length);
        System.out.println((double) zeroCount / arr.length);
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine().trim());

        int[] arr = new int[n];

        String[] arrItems = scan.nextLine().split(" ");

        for (int arrItr = 0; arrItr < n; arrItr++) {
            int arrItem = Integer.parseInt(arrItems[arrItr].trim());
            arr[arrItr] = arrItem;
        }

        plusMinus(arr);
    }
}
