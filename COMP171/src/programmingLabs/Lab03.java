/* SELECTION STATEMENTS (UNIT 3)
 
 * M. Alex Moreno
 * COMP 171_801RL
 * LAB 3: DAYS OF THE MONTH
 * PAGE 110 # 3.11
 * February 4, 2017

 * (Find the number of days in a month) Write a program that prompts the user to enter the month and year 
 * and displays the number of days in the month. For example, if the user entered month 2 and year 2012, 
 * the program should display that February 2012 had 29 days. If the user entered month 3 and year 2015, 
 * the program should display that March 2015 had 31 days.
	
 * Hints:
 * In this section we learned about conditional statements. You can use either a switch statement or a series of if, else if, else statements.
 * How will you handle the fact that a user can input an invalid month number (e.g 13)?
 * February is the month that changes days based on the year. There are 2 rules for when February gets an extra day or not. What are they?

*/
package programmingLabs;

import java.util.Scanner;

public class Lab03 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in) ;
		
		System.out.print("Please input the month number (1-12): ") ;
		int monthNum = in.nextInt() ;
		String month = "No Valid Month Entered Yet" ;
		int days = 0 ;
		System.out.print("Please input the year: ") ;
		int year = in.nextInt() ;
		
		switch (monthNum) {
		case 1:
			month = "January" ;
			days = 31 ;
			System.out.print(month + " " + year + " has " + days + " days." );
			break ;		
		case 2:
			month = "February" ; 
			if ( (year % 4 == 0 && year % 100 != 0) /* excludes all century years*/ || (year % 400 ==0) /*includes all centuries /400 */ ) { 
				days = 29 ;
			}
			else {			
				days = 28 ; 
			}
			System.out.print(month + " " + year + " has " + days + " days." ) ;
			break ;
		case 3:
			month = "March" ;
			days = 31 ;
			System.out.print(month + " " + year + " has " + days + " days." ) ;
			break ;
		case 4:
			month = "April" ;
			days = 30 ;
			System.out.print(month + " " + year + " has " + days + " days." ) ;
			break ;	
		case 5:
			month = "May" ;
			days = 31 ;
			System.out.print(month + " " + year + " has " + days + " days." ) ;
			break ;			
		case 6:
			month = "June" ;
			days = 30 ;
			System.out.print(month + " " + year + " has " + days + " days." ) ;
			break ;
		case 7:
			month = "July" ;
			days = 31 ;
			System.out.print(month + " " + year + " has " + days + " days." ) ;
			break ;
		case 8:
			month = "August" ;
			days = 31 ;
			System.out.print(month + " " + year + " has " + days + " days." ) ;
			break ;		
		case 9:
			month = "September" ;
			days = 30 ;
			System.out.print(month + " " + year + " has " + days + " days." ) ;
			break ;
		case 10:
			month = "October" ;
			days = 31 ;
			System.out.print(month + " " + year + " has " + days + " days." ) ;
			break ;
		case 11:
			month = "November" ;
			days = 30 ;
			System.out.print(month + " " + year + " has " + days + " days." ) ;
			break ;
		case 12:
			month = "December" ;
			days = 31 ;
			System.out.print(month + " " + year + " has " + days + " days." ) ;
			break ;
		default:
			System.out.print("The month number entered is invalid. Please start again, this time with a valid month number." );
			break;
		}
		in.close();
	}
}
