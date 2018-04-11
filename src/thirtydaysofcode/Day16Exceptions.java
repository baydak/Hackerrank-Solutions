package thirtydaysofcode;

import java.util.Scanner;

public class Day16Exceptions {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        in.close();
        int intFromStr;
        try {
            intFromStr = Integer.parseInt(str);
            System.out.println(intFromStr);

        } catch (NumberFormatException e) {
            System.out.println("Bad String");
        }
    }
}
