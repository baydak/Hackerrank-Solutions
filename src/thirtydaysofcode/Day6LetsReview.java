package thirtydaysofcode;

import java.util.Scanner;

public class Day6LetsReview {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. 
        Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int numberOfLines = sc.nextInt();
        sc.nextLine();

        String str1 = "", str2 = "";
        for (int i = 0; i < numberOfLines; i++) {
            String input = sc.next();
            char[] char1 = input.toCharArray();
            for (int j = 0; j < char1.length; j++) {
                if (j % 2 == 0) {
                    str1 = str1 + char1[j];
                } else {
                    str2 = str2 + char1[j];

                }
            }
            System.out.println(str1 + " " + str2);
            str1 = str2 = "";
        }
        sc.close();
    }
}
