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
public class A7Q1 {

    /**
     * @param args the command line arguments
     */
    // Calculate the area
    public static double areaofcircle(double radius) {
        double rSquared = Math.pow(radius, 2);
        double area = rSquared * Math.PI;
        return area; // Returns the area of the circle
    }

    public static void main(String[] args) {

        // Create a scanner
        Scanner input = new Scanner(System.in);

        //Ask the user to input the radius
        System.out.println("What is the radius of the circle?");

        double r = input.nextDouble();
        // Output areaofcircle
        double area = areaofcircle(r);
        System.out.println(area);
    }
}
