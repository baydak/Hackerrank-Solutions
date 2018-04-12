package algorithms;

import java.util.*;

public class MiniMaxSum {

    static void miniMaxSum(int[] arr) {
        long[] sumArr = new long[arr.length];
        for (int i = 0; i < arr.length; i++) {
            long tempSum = 0;
            for (int k = 0; k < arr.length; k++) {
                if (k != i) {
                    tempSum += arr[k];
                }
            }
            sumArr[i] = tempSum;
        }
        long maxSum = sumArr[0];
        long minSum = sumArr[0];
        for (int i = 0; i < sumArr.length; i++) {
            if (maxSum < sumArr[i]) {
                maxSum = sumArr[i];
            }
            if (minSum > sumArr[i]) {
                minSum = sumArr[i];
            }
        }
        System.out.println(minSum + " " + maxSum);
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scan.nextLine().split(" ");

        for (int arrItr = 0; arrItr < 5; arrItr++) {
            int arrItem = Integer.parseInt(arrItems[arrItr].trim());
            arr[arrItr] = arrItem;
        }

        miniMaxSum(arr);
    }
}
