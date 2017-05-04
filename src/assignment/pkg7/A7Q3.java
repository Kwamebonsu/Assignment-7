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
public class A7Q3 {

    /**
     * @param args the command line arguments
     */
    public static int factors(int factor) {
        // Outputs all the positive factors of the given number
        int[] numbers = new int[factor];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }
        for (int i = 0; i < numbers.length; i++) {
            if (factor % numbers[i] != 0) {
                numbers[i] = -1;
            } else if (factor % numbers[i] == 0) {
                System.out.println(numbers[i]);
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);
        // Get a number from the user
        System.out.println("Please enter a number.");
        int number = input.nextInt();
        factors(number);

    }
}
