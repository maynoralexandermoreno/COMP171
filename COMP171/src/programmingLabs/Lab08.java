/* ARRAYS (UNIT 7)
 
 * M. Alex Moreno
 * COMP 171_801RL
 * LAB 8: COUNTING DIGITS
 * PAGE 277 # 7.3
 * April 13, 2017

 * (Count occurrence of numbers) Write a program that reads the integers between 1 and 100 
 * and counts the occurrences of each. Assume the input ends with 0. Here is a sample run of the program:
	
	Enter the integers between 1 and 100: 2 5 6 5 4 3 23 43 2 0
	2 occurs 2 times
	3 occurs 1 time
	4 occurs 1 time
	5 occurs 2 times
	6 occurs 1 time
	23 occurs 1 time
	43 occurs 1 time

 * Note that if a number occurs more than one time, the plural word “times” is used in the output.
 
 * Hints:
 * How many times do I have to loop through? (i.e is there a maximum number of integers one can input)
 * Do I know how many maximum unique integers I can have? In other words, do I know how big of an array to make?
 * Don't forget, an array of size n starts at element 0 and goes to n-1; so adjust appropriately
 
*/
package programmingLabs;

import java.util.Scanner;

public class Lab08 {

	public static void main(String[] args) {
		System.out.print("Enter the integers between 1 and 100: ");
		Scanner in = new Scanner(System.in);
		int[] arr = new int[100];
		int x = 0;
		while(in.hasNextInt()) {
			x = in.nextInt();
			if(x == 0){
				break;
			}
			else if(x >= 1 && x <= 100) {
				arr[x-1]++;
			}
			else {
				System.exit(0);
			}
		}
		for(int i = 0; i < 100; i++){
			if(arr[i] == 1){
				System.out.println((i+1) + " occurs 1 time");
			}
			else if(arr[i] > 1) {
				System.out.println((i+1) + " occurs " + arr[i] +" times");
			}
			else {
				continue;
			}
		}
		in.close();
	}

}
