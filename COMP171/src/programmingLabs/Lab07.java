/* METHODS (UNIT 6)
 
 * M. Alex Moreno
 * COMP 171_801RL
 * LAB 7: PHONE PAD TRANSLATOR
 * PAGE 239 # 6.21
 * March 30, 2017

 * (Phone keypads) The international standard letter/number mapping for telephones is shown in 
 * Programming Exercise 4.15. Write a method that returns a number, given an uppercase letter, as follows:

	int getNumber(char uppercaseLetter)

 * Write a test program that prompts the user to enter a phone number as a string. The input number may
 * contain letters. The program translates a letter (uppercase or lowercase) to a digit and leaves all 
 * other characters intact. Here is a sample run of the program:

	Enter a string: 1-800-Flowers
	1-800-3569377

	Enter a string: 1800flowers
	18003569377
	
 * Hints:
 * How many times do I have to loop through (i.e how long is the phone number)?
 * How do you handle if they happen to give you lowercase letters?
 * How do you handle the non-letter characters?
 * This time I used a switch statement; if you did so too, don't reinvent the wheel; the focus is on methods
 * Java uses unicode, so you can treat characters as integers, and it is pretty safe to assume they will have the same value
 
*/
package programmingLabs;

import java.util.Scanner;

public class Lab07 {
	public static int getNumber(char uppercaseLetter) {
		int number = 0 ;
		switch (uppercaseLetter) {
		case 'A': case 'B': case 'C':
			number = 2 ; break;
		case 'D': case 'E': case 'F':
			number = 3 ; break;
		case 'G': case 'H': case 'I':
			number = 4 ; break;
		case 'J': case 'K': case 'L':
			number = 5 ; break;
		case 'M': case 'N': case 'O':
			number = 6 ; break;	
		case 'P': case 'Q': case 'R': case 'S':
			number = 7 ; break ;
		case 'T': case 'U': case 'V':
			number = 8 ; break ;
		case 'W': case 'X': case 'Y': case 'Z':
			number = 9 ; break ;	
		}
		return number ;
	}
	

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in) ;
		
		System.out.print("Please enter the phone number: ") ;
		String phoneNumber = in.next() ;
		
		phoneNumber =  phoneNumber.toUpperCase();
		char [] phoneNumberChar = phoneNumber.toCharArray() ;
		
		int numFromChar = 0 ;
		String noLettersPhoneNumber = "";
		
		for (int i = 0 ; i <= (phoneNumber.length()-1) ; i++) {
			if ( phoneNumberChar[i] >= 'A' && phoneNumberChar[i] <= 'Z') {
				numFromChar = getNumber(phoneNumberChar[i]);
				noLettersPhoneNumber = noLettersPhoneNumber + numFromChar + "" ;	
			}
			else {
				noLettersPhoneNumber = noLettersPhoneNumber + phoneNumberChar[i] + "" ;
			}
		}
		System.out.print(noLettersPhoneNumber);
		in.close();
	}
}
