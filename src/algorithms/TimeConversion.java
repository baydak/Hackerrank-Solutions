package algorithms;

import java.io.*;
import java.util.*;

public class TimeConversion {

    static String timeConversion(String s) {

        String onlyHours24 = s.substring(0, 2);
        String onlyAmPm = s.substring(8);

        if (onlyHours24.equals("12") && onlyAmPm.equals("AM")) {
            return ("00" + s.substring(2, 8));
        }
        if (onlyHours24.equals("12") && onlyAmPm.equals("PM")) {
            return ("12" + s.substring(2, 8));
        }

        if (onlyAmPm.equals("AM")) {
            return (onlyHours24 + s.substring(2, 8));
        }
        if (onlyAmPm.equals("PM")) {
            return ((Integer.parseInt(onlyHours24) + 12) + s.substring(2, 8));
        }

        return "error";
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);

        bw.write(result);
        bw.newLine();

        bw.close();
    }
}
