/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg7;

/**
 *
 * @author bonsk5852
 */
public class A7Q5 {

    /**
     * @param args the command line arguments
     */
    public static int numbers() {
        while (true) {
            int number = (int) (Math.random() * (5 - 1 + 1)) + 1;
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here

        for (int i = 0; i < numbers; i++) {
            System.out.print("*");
        }
    }
}
