package thirtydaysofcode;

import java.util.Scanner;

class Person2 {

    protected String firstName;
    protected String lastName;
    protected int idNumber;

    // Constructor
    Person2(String firstName, String lastName, int identification) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = identification;
    }

    // Print person data
    public void printPerson() {
        System.out.println(
                "Name: " + lastName + ", " + firstName
                + "\nID: " + idNumber);
    }
}

class Student extends Person2 {

    private int[] testScores;
    /*	
    *   Class Constructor
    *   
    *   @param firstName - A string denoting the Person's first name.
    *   @param lastName - A string denoting the Person's last name.
    *   @param id - An integer denoting the Person's ID number.
    *   @param scores - An array of integers denoting the Person's test scores.
     */
    // Write your constructor here
    Student(String firstName, String lastName, int identification, int[] scores) {
        super(firstName, lastName, identification);
        testScores = scores;
    }
    /*	
    *   Method Name: calculate
    *   @return A character denoting the grade.
     */
    // Write your method here
    public char calculate() {
        int sum = 0;
        for (int i = 0; i < testScores.length; i++) {
            sum += testScores[i];
        }
        double avg = sum / testScores.length;
        char retChar;
        if (90 <= avg && avg <= 100) {
            retChar = 'O';
        } else if (80 <= avg && avg < 90) {
            retChar = 'E';
        } else if (70 <= avg && avg < 80) {
            retChar = 'A';
        } else if (55 <= avg && avg < 70) {
            retChar = 'P';
        } else if (40 <= avg && avg < 55) {
            retChar = 'D';
        } else {
            retChar = 'T';
        }
        return retChar;
    }
}

public class Day12Inheritance {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String firstName = scan.next();
        String lastName = scan.next();
        int id = scan.nextInt();
        int numScores = scan.nextInt();
        int[] testScores = new int[numScores];
        for (int i = 0; i < numScores; i++) {
            testScores[i] = scan.nextInt();
        }
        scan.close();

        Student s = new Student(firstName, lastName, id, testScores);
        s.printPerson();
        System.out.println("Grade: " + s.calculate());
    }
}
