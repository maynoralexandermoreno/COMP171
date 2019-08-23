/* ARRAYS (UNIT 7)
 
 * M. Alex Moreno
 * COMP 171_801RL
 * LAB 11: CAPITALS
 * PAGE 319 # 8.37
 * April 13, 2017

 * (Guess the capitals) Write a program that repeatedly prompts the user to enter a capital for a state. 
 * Upon receiving the user input, the program reports whether the answer is correct. Assume that 50 states 
 * and their capitals are stored in a two-dimensional array, as shown in Figure 8.10. The program prompts the 
 * user to answer all states’ capitals and displays the total correct count. The user’s answer is not case-sensitive.
 * Here is a sample run:
 
 	What is the capital of Alabama? Montogomery
	The correct answer should be Montgomery
	What is the capital of Alaska? Juneau
	Your answer is correct
	What is the capital of Arizona? ...
	...
	The correct count is 35

 * Hints:
 * How many times do you need to ask the user for input?
 * How do you ignore the case?
 * There are 50 rows and 2 columns; print the state in the question by getting column element [0] 
 * Then, compare the input answer with column element [1]
 * The way you should think about this matrix is as follows
 
 				State	Capital
 	Solution 1:
 	Solution 2:
 	Solution 3:
 	
 * So there are 50 rows and 2 columns. What you are doing is inserting every row in, each row an array containing 2 elements
 
*/
package programmingLabs;

import java.util.Scanner;

public class Lab11 {


	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		String[][] capitals = {
		{"Alabama","Montgomery"},{"Alaska","Juneau"},{"Arizona","Phoenix"},{"Arkansas","Little Rock"},
		{"California","Sacramento"},{"Colorado","Denver"},{"Connecticut","Hartford"},{"Delaware","Dover"},
		{"Florida","Tallahassee"},{"Georgia","Atlanta"},{"Hawaii","Honolulu"},{"Idaho","Boise"},{"Illinois","Springfield"},
		{"Indiana","Indianapolis"},{"Iowa","Des Moines"},{"Kansas","Topeka"},{"Kentucky","Frankfort"},{"Louisiana","Baton Rouge"},
		{"Maine","Augusta"},{"Maryland","Annapolis"},{"Massachusetts","Boston"},{"Michigan","Lansing"},{"Minnesota","St. Paul"},
		{"Mississippi","Jackson"},{"Missouri","Jefferson City"},{"Montana","Helena"},{"Nebraska","Lincoln"},{"Nevada","Carson City"},
		{"New Hampshire","Concord"},{"New Jersey","Trenton"},{"New Mexico","Santa Fe"},{"New York","Albany"},{"North Carolina","Raleigh"},
		{"North Dakota","Bismarck"},{"Ohio","Columbus"},{"Oklahoma","Oklahoma City"},{"Oregon","Salem"},{"Pennsylvania","Harrisburg"},
		{"Rhode Island","Providence"},{"South Carolina","Columbia"},{"South Dakota","Pierre"},{"Tennessee","Nashville"},{"Texas","Austin"},
		{"Utah","Salt Lake City"},{"Vermont","Montpelier"},{"Virginia","Richmond"},{"Washington","Olympia"},{"West Virginia","Charleston"},
		{"Wisconsin","Madison"},{"Wyoming","Cheyenne"}
		};
		
		int correct = 0 ;
		String hold = "" ;
		
		for (int i = 0; i < 50 ; i++){
			int j = 0;
			
			System.out.print("What is the capital of " + capitals[i][j] + "? ");
			
			j++;
			hold = in.nextLine();
			if (hold.equalsIgnoreCase(capitals[i][j])){
				System.out.print("Your answer is correct\n");
				correct++;
				}
			else{
				System.out.print("The correct answer should be " + capitals[i][j] + "\n");
				}
			
		}
		System.out.println("The correct count is " + correct);
		in.close();
	}
}
