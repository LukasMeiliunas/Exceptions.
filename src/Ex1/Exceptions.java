/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex1;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author X00139670
 */
public interface Exceptions {
    // Intro to Exceptions
    public static void main(String[] Args) {
        //variables    
        Scanner in = new Scanner(System.in);
        int[] nums = new int[2];
        int i = 0; int result;

        while (i < nums.length) {
            try {
                System.out.println("Enter number "+(i+1));
                nums[i]= in.nextInt();
                i++;
            } catch (InputMismatchException e) {
                System.out.println("Invalid int entered please try again");
                in.nextLine();
            }

        }
        try {
            result = nums [0]/nums[1];
            System.out.println(nums[1]+" goes into "+nums[0] + result +" times");
        } catch(ArithmeticException e){
            System.out.println("Second number is zero cannot do division!");
        } 
        
    
}
}