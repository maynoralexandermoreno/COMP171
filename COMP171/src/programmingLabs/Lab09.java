/* METHODS (UNIT 6)
 
 * M. Alex Moreno
 * COMP 171_801RL
 * LAB 9: CALENDAR CLASS
 * PAGE 361 # 9.5
 * April 27, 2017

 * (Use the GregorianCalendar class) Java API has the GregorianCalendar class in the java.util package,
 * which you can use to obtain the year, month, and day of a date. The no-arg constructor constructs an 
 * instance for the current date, and the methods get(GregorianCalendar.YEAR), get(GregorianCalendar.MONTH),
 * and get(GregorianCalendar.DAY_OF_MONTH) return the year, month, and day. Write a program to perform two tasks:

	Display the current year, month, and day.
	The GregorianCalendar class has the setTimeInMillis(long), which can be used to set a 
		specified elapsed time since January 1, 1970. Set the value to 1234567898765L and 
		display the year, month, and day.

 * Hints:
 * The purpose of this exercise is to demonstrate how classes work, and how we can create objects from a class
 * You use the class to create an object of that class, and then call the methods that are within that class
 * In this instance I created an object of Lab9, and then called the methods created
 * You would call the methods much like you call the methods of a String object.

*/
package programmingLabs;

import java.util.GregorianCalendar;

public class Lab09 {
	
	private int YEAR, MONTH, DAY_OF_MONTH;
	
	public void theCurrentDateIs(){
		java.util.GregorianCalendar date = new java.util.GregorianCalendar();
		this.YEAR = date.get(GregorianCalendar.YEAR);
		this.MONTH = date.get(GregorianCalendar.MONTH) + 1 ;
		this.DAY_OF_MONTH = date.get(GregorianCalendar.DAY_OF_MONTH);
		System.out.println("Year:\t" + YEAR);
		System.out.println("Month:\t" + MONTH);
		System.out.println("Day:\t" +  DAY_OF_MONTH +"\n");
	}
	public void theSetDateIs(){
		java.util.GregorianCalendar date = new java.util.GregorianCalendar();
		date.setTimeInMillis(1234567898765L);
		this.YEAR = date.get(GregorianCalendar.YEAR);
		this.MONTH = date.get(GregorianCalendar.MONTH) + 1 ;
		this.DAY_OF_MONTH = date.get(GregorianCalendar.DAY_OF_MONTH);
		System.out.println("Year:\t" + YEAR);
		System.out.println("Month:\t" + MONTH);
		System.out.println("Day:\t" +  DAY_OF_MONTH +"\n");
	}
	
	public static void main(String[] args){
		Lab09 a1 = new Lab09();
		a1.theCurrentDateIs();
		a1.theSetDateIs();
	}
}
