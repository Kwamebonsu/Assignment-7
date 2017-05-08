/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg7;

import static assignment.pkg7.A7Q6.lastDigit;
import java.util.Scanner;

/**
 *
 * @author bonsk5852
 */
public class A7Q7 {

    /**
     * @param args the command line arguments
     */
    public static int firstDigit(int number) {
        // Divide by 10 until the number is less than 10
        while (number >= 10) {
            number = number / 10;
            if (number < 10) {
                break;
            }
        }
        // Return the remaining digit which is the first digit\
        return number;
    }

    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Test the method
        System.out.println("Please input a number");
        int n = input.nextInt();
        System.out.println(firstDigit(n));
    }
}
