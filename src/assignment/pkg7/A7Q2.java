/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg7;

import static assignment.pkg7.A7Q1.areaofcircle;
import java.util.Scanner;

/**
 *
 * @author bonsk5852
 */
public class A7Q2 {

    public static double examGrade(double percentage) {
        // Outputs the letter which corresponds to the percentage given
        if (percentage < 50) {
            System.out.println("F");
        }
        if (percentage >= 50 && percentage < 60) {
            System.out.println("D");
        }
        if (percentage >= 60 && percentage < 70) {
            System.out.println("C");
        }
        if (percentage >= 70 && percentage < 80) {
            System.out.println("B");
        }
        if (percentage >= 80) {
            System.out.println("A");
        }
        return percentage; // Returns the percentage
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a scanner
        Scanner input = new Scanner(System.in);

        // Get a percentage from the user
        System.out.println("Please enter a percentage");
        double percentage = input.nextDouble();
        examGrade(percentage);
    }
}
