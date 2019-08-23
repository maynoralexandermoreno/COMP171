/* INTRODUCTION TO JAVA / DATA TYPES AND OPERATIONS (UNITS 1 & 2)
 
 * M. Alex Moreno
 * COMP 171_801RL
 * LAB 1: TIPS
 * PAGE 70 # 2.5
 * January 26, 2017
 
 * (Financial application: calculate tips)
 * Write a program that reads the subtotal and the gratuity rate, then computes the gratuity and total.
 * For example, if the user enters 10 for subtotal and 15% for gratuity rate, the program displays $1.5
 * as gratuity and $11.5 as total. Here is a sample run:
   
 	Enter the subtotal and a gratuity rate: 10 15
	The gratuity is $1.5 and total is $11.5
 
 * Hints:
 * Remember to import your Scanner.
 * Note how the user is allowed to input a decimal number.
 * A Scanner is what you can use to read input from the console.	
	
*/

package programmingLabs;

import java.util.Scanner;

public class Lab01 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in) ;
		
		System.out.print("Enter the subtotal and a gratuity rate: ") ;
		
		double subtotal = input.nextDouble() ;
		double gratuityInput = input.nextDouble() ;
		
		double gratuityPercentage = gratuityInput/100 ;
		
		double gratuityAmount = subtotal * gratuityPercentage ;
		
		double total = subtotal + gratuityAmount ;
		
		System.out.print("The gratuity is $" + gratuityAmount + " and total is $" + total) ;
		
		input.close();
	}

}
