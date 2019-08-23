/* MATH & STRINGS (UNIT 4)
 
 * M. Alex Moreno
 * COMP 171_801RL
 * LAB 4: PHONE KEY PAD
 * PAGE 154 # 4.15
 * February 23, 2017

 * (Phone key pads) The international standard letter/number mapping found on the telephone is shown below:

	1; 2:abc; 3:def; 4:ghi; 5:jkl; 6:mno; 7:pqrs; 8:tuv; 9:wxyz; 0:' ';

 * Write a program that prompts the user to enter a letter and displays its corresponding number.
 * Sample output:
	
	Enter a letter: A
	The corresponding number is 2
	Enter a letter: a
	The corresponding number is 2
	Enter a letter: +
	+ is an invalid input

 * Hints:
 * Once again, either a switch statement or a series of if, else if, else statements
 * But, how many satisfactory conditions would you need to handle? (i.e A-Z and a-z) What is clearer?
 * If you do a switch statement, you can combine cases by 
	
	case 'A':
	case 'B':
		break;
	case....
	
 * If you do a series of if else if else statements, you can combine cases by using the logical or operator if(x = 1 || x = 2){ /*code } 
 * Remember, this is an exercise in the available operations to Strings

*/
package programmingLabs;

import java.util.Scanner;

public class Lab04 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in) ;
		
		final int abc = 2 , def = 3 , ghi = 4 , jkl = 5 , mno = 6 , pqrs = 7 , tuv = 8 , wxyz = 9 ;
		String response = "The corresponding number is " ;
		String error = " is an invalid input" ;
		
		System.out.print("Enter A Letter: ") ;
		String input = in.next() ;
		in.nextLine() ;
		
		input = input.toLowerCase() ;
		char letter = input.charAt(0) ;
		
		if (letter == 'a' || letter == 'b' || letter == 'c' ) {
			System.out.print(response + abc) ;
		}
		else if (letter == 'd' || letter == 'e' || letter == 'f' ) {
			System.out.print(response + def) ;
		}
		else if (letter == 'g' || letter == 'h' || letter == 'i' ) {
			System.out.print(response + ghi) ;
		}
		else if (letter == 'j' || letter == 'k' || letter == 'l' ) {
			System.out.print(response + jkl) ;
		}
		else if (letter == 'm' || letter == 'n' || letter == 'o' ) {
			System.out.print(response + mno) ;
		}
		else if (letter == 'p' || letter == 'q' || letter == 'r' || letter == 's' ) {
			System.out.print(response + pqrs) ;
		}
		else if (letter == 't' || letter == 'u' || letter == 'v' ) {
			System.out.print(response + tuv) ;
		}
		else if (letter == 'w' || letter == 'x' || letter == 'y' || letter == 'z' ) {
			System.out.print(response + wxyz) ;
		}
		else {
			System.out.print(letter + error) ;
		}
		
		in.close();
	}

}
