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
public class A7Q4 {

    /**
     * @param args the command line arguments
     */
    public static double compoundInterest(double initial, double rate, double years) {
        // Create a variable for the contents of the bracket
        double bracket = 0;

        if (rate < 1) {
            bracket = 1 + rate;
        } // Convert the percentage entered by the user into a decimal
        else if (rate >= 1) {
            bracket = 1 + (rate / 100);
        }
        // Using the formula B = P(1 + r)^n, calculate the balance
        double power = Math.pow(bracket, years);
        double total = initial * power;
        return total;
    }

    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Get the initial amount, the interest rate and the number of years from the user.
        System.out.println("Please enter the initial amount.");
        System.out.print("$");
        double initial = input.nextDouble();

        System.out.println("Please enter the interest rate.");
        double rate = input.nextDouble();

        System.out.println("Please enter the number of years.");
        double years = input.nextDouble();

        // Put the values in the method compoundInterest and output the balance
        double answer = compoundInterest(initial, rate, years);
        System.out.println("$" + answer);
    }
}
