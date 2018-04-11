package thirtydaysofcode;

import java.util.Scanner;

public class Day2Operators {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double meal_cost = in.nextDouble();
        int tip_percent = in.nextInt();
        int tax_percent = in.nextInt();
        in.close();
        double totalCost = meal_cost + (tip_percent * meal_cost / 100) + (tax_percent * meal_cost / 100);
        System.out.println("The total meal cost is " + Math.round(totalCost) + " dollars.");   
    }
}
