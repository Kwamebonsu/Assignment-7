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
public class A7Q8 {

    /**
     * @param args the command line arguments
     */
    public static String season(int month, int day) {
        String seas = "season";
        if ((month * 100 + day) >= 1216 || (month * 100 + day) <= 315) {
            seas = "Winter";
        } else if ((month * 100 + day) >= 316 && (month * 100 + day) <= 615) {
            seas = "Spring";
        } else if ((month * 100 + day) >= 616 && (month * 100 + day) <= 915) {
            seas = "Summer";
        } else if ((month * 100 + day) >= 916 && (month * 100 + day) <= 1215) {
            seas = "Fall";
        }
        return seas;
    }

    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a month as an integer (e.g. Instead of April, enter 4)");
        int month = input.nextInt();
        System.out.println("Please enter the day");
        int date = input.nextInt();
        System.out.println(season(month, date));
    }
}
