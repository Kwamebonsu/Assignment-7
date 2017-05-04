/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg7;

import java.util.Scanner;

/**
 *
 * @author bonsk5852
 */
public class A7Q5 {

    /**
     * @param args the command line arguments
     */
    public static int chaotic(int length) {
        // This loop changes the number of lines
        for (int q = 0; q < length; q++) {
            // Randomly generate numbers between 1 and 5
            int number = (int) (Math.random() * (5 - 1 + 1)) + 1;
            // Output that number of asteriks
            for (int i = 0; i < number; i++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        // return the length
        return length;
    }

    public static void main(String[] args) {
        // Test the method

        // Create a Scanner
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number of lines");
        int n = input.nextInt();
        chaotic(n);
    }
}
