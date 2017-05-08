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
public class A7Q9 {

    /**
     * @param args the command line arguments
     */
    public static void allDigitsOdd(int number) {
        while (true) {
            // If the number is divisible by 2, output the word False then break the loop
            if (number % 2 == 0) {
                System.out.println("False");
                break;
            } // If the number is not divisible by 2, check the next digit
            else if (number % 2 == 1 && number > 10) {
                number = number / 10;
            }
            // If the all the digits are divisible by 2, output the word True then break the loop
            if (number < 10 && number % 2 == 1) {
                System.out.println("True");
                break;
            }
        }
    }
    // Test the method

    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);
        // Get a number from the user
        System.out.println("Please enter a number");
        int n = input.nextInt();
        // Use that number in the method
        allDigitsOdd(n);
    }
}
