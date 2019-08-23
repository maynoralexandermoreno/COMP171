/* INTRODUCTION TO JAVA/DATA TYPES AND OPERATIONS (UNITS 1 & 2)
 
 * M. Alex Moreno
 * COMP 171_801RL
 * LAB 2: INVESTMENT CALCULATOR
 * PAGE 74 # 2.21
 * January 28, 2017

 * (Financial application: calculate future investment value) Write a program that reads in 
 * investment amount, annual interest rate, and number of years, and displays the future 
 * investment value using the following formula:

	futureInvestmentValue = investmentAmount * (1 + monthlyInterestRate)^(numberOfYears*12)

 * For example, if you enter amount 1000, annual interest rate 3.25%, and number of years 1, 
 * the future investment value is 1032.98. Here is a sample run:

	Enter investment amount: 1000.56
	Enter annual interest rate in percentage: 4.25
	Enter number of years: 1
	Accumulated value is $1043.92
	
 * Hints:
 * Remember to import your Scanner.
 * What data type should you use? For example, can users type in decimals for the number of years?
 * Math can be done either bit by bit or in one shot. PEMDAS
 * How do you convert the annual interest rate into the monthly interest rate 
 * i.e how many months are in a year? And so how much of the percentage is charged every month?
 * Math.pow is used to do exponents(x^y).

*/
package programmingLabs;

import java.util.Scanner;

public class Lab02 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in) ;
		
		System.out.print("Enter investment amount: ");
		double investmentAmount = in.nextDouble() ;
		
		System.out.print("Enter annual interest rate in percentage: ") ;
		double annualInterestRate = in.nextDouble() ;
		double monthlyInterestRate = annualInterestRate / (12.00 * 100.00) ;
		
		System.out.print("Enter number of years: ") ;
		double numberOfYears = in.nextDouble() ;
		
		double futureInvestmentValue = investmentAmount * Math.pow(1.00 + monthlyInterestRate, numberOfYears * 12) ;
		
		System.out.println("Accumulated value is $" + ((int)(futureInvestmentValue*100)) / 100.0 ) ;

		in.close();
	}

}