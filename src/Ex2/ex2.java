/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex2;

import java.util.Scanner;

public class ex2 {

    public static void main(String args[]) {
        boolean valid = false;
        Scanner in = new Scanner(System.in);
        int array[] = {10, 11, 12, 13, 14};

        while (!valid) {
            try {
                System.out.print("Which index would you like?");
                int index = in.nextInt();
                System.out.println("Answer: " + array[index]);
                valid = true;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Exception is" + e.getMessage());
                e.printStackTrace(System.out);
            } finally {
                System.out.println("Goodbye!");
            }
        }

    }
}
