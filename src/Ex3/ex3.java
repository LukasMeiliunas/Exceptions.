/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex3;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author X00139670
 */
public class ex3 {
 //input validation Exceptions
    public static void main(String[] args) {
        boolean valid = false;
        int max = 0;
        int count = 0;
        int num = 0;
        Scanner in = new Scanner(System.in);

        while (count < 9) {
            try {
                System.out.println("Enter number [" + count + "]");
                num = in.nextInt();

                if (num < 0) {
                    System.out.println("Negative number entered  " + "Please enter number [" + count + "] again");
                    num = in.nextInt();
                }
                if (num > max) {
                    max = num;
                }
              count++;
            }catch(InputMismatchException e){
                System.out.println("Error in input, Please enter digits only ");
            }
            

        }

    }

}
