/* METHODS (UNIT 6)
 
 * M. Alex Moreno
 * COMP 171_801RL
 * LAB 6: INVESTMENTS
 * PAGE 235 # 6.7
 * March 30, 2017

 * (Financial application: compute the future investment value) Write a method that computes 
 * future investment value at a given interest rate for a specified number of years. The future 
 * investment is determined using the formula in Programming Exercise 2.21. 
 * Use the following method header:

	public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years)
	
 * For example, futureInvestmentValue(10000, 0.05/12, 5) returns 12833.59.
 * Write a test program that prompts the user to enter the investment amount (e.g.,1000) 
 * and the interest rate (e.g., 9%) and prints a table that displays future value for the years from 1 to 30, 
 * as shown below:

	The amount invested: 1000
	Annual interest rate: 9
	Years 	Future Value
	1 		1093.81
	2 		1196.41
	...
	29 		13467.25
	30 		14730.58
	
 * Hints:
 * How many times do I have to loop through?
 * The tab character is \t; the new line character is \n; formatting a decimal requires %f
 * The equation for this problem is in the textbook, in the actual chapter 2. Read the book!
 
*/
package programmingLabs;

import java.util.Scanner;

public class Lab06 {

	public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years) {
		
		double futureInvestment = investmentAmount * Math.pow(1.00 + monthlyInterestRate, years * 12.00) ;
		return futureInvestment ;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in) ;
		
		System.out.print("The amount invested: ") ;
		double initialInvestment = in.nextDouble() ;
		
		System.out.print("Annual interest rate: ") ;
		double annualInterest = in.nextDouble();
		
		double monthlyInterest = annualInterest / 1200.00 ;
		
		System.out.print("Years\t\tFutureValue\n");
		
		for (int i = 1 ; i <=30 ; i++) {
			double futureValue = futureInvestmentValue( initialInvestment, monthlyInterest, i) ;
			System.out.printf("%1d\t\t%10.2f\n",  i , futureValue) ; 
		}
	
		in.close();
	}
}
