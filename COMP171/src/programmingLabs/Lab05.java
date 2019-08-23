/* LOOPS (UNIT 5)
 
 * M. Alex Moreno
 * COMP 171_801RL
 * LAB 5: LOANS
 * PAGE 194 # 5.21
 * February 27, 2017

 * (Financial application: compare loans with various interest rates) Write a program that lets the user 
 * enter the loan amount and loan period in number of years and displays the monthly and total payments 
 * for each interest rate starting from 5% to 8%, with an increment of 1/8. Here is a sample run:

	Loan Amount: 10000
	Number of Years: 5
	Interest 	Rate Monthly 	Payment Total Payment
	5.000% 		188.71 			11322.74
	5.125% 		189.29 			11357.13
	5.250% 		189.86 			11391.59
	...
	7.875% 		202.17 			12129.97
	8.000% 		202.76 			12165.84

 * For the formula to compute monthly payment, see Listing 2.9, ComputeLoan.java (above).

 * Hints:
 * How many times do I have to loop through?
 * The tab character is \t; the new line character is \n; formatting a decimal requires %f
 * You already did the math in an earlier assignment, so don't reinvent the wheel
 
*/
package programmingLabs;

import java.util.Scanner;

public class Lab05 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in) ;
		
		System.out.print("Loan Amount: ") ;
		double loan = in.nextDouble() ;
		System.out.print("Number of Years: ") ;
		int years = in.nextInt() ;
		
		int i = 0 ;
		double rate = 5.000 ;
		double monthRate = 0.0;
		final double increment = .125 ;
		double monthPay = 0.0 ;
		double totalPay = 0.0 ;
		 
		System.out.printf("%-20s%-20s%-20s", "Interest Rate", "Monthly Payment", "Total Payment") ;
		System.out.println() ;
		System.out.println() ;
		
		for(i = 0 ; i <= 24 ; i++) {
			monthRate = rate / 1200.0 ;
			monthPay = loan * (monthRate / (1 - (1/Math.pow(1+ monthRate, years * 12)) ) ) ;
			totalPay = monthPay * years * 12.0 ;
			System.out.printf("%5.3f%%", rate) ;	
			System.out.printf("%20.2f%22.2f", monthPay, totalPay) ;
			System.out.println(); 
			
			rate = rate + increment ;
		}
		in.close();
	}

}
