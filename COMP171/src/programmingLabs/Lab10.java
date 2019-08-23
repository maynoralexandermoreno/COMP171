/* ARRAYS (UNIT 7)
 
 * M. Alex Moreno
 * COMP 171_801RL
 * LAB 10: ELIMINATING DUPLICATES
 * PAGE 279 # 7.15
 * April 7, 2017

 * (Eliminate duplicates) Write a method that returns a new array by eliminating the duplicate values in the 
 * array using the following method header: 
	
	public static int[] eliminateDuplicates(int[] list)
	
 * Write a test program that reads in ten integers, invokes the method, and displays the result. 
 * Here is the sample run of the program:
 
 	Enter ten numbers: 1 2 3 2 1 6 3 4 5 2
	The distinct numbers are: 1 2 3 6 4 5

 * Hints:
 * Essentially, what you want to do is, for every element array[i], you check it against every other element array[j]
 * How many loops do you need? Extra hint, I didn't confuse i with j above ^ ^ ^
 * You know how many numbers there can be. So how many distinct numbers can you have AT MOST?
 * NOTE: The professor allowed for me to sort and then eliminate the duplicates, as it met the requirement of finding 
 * distinct numbers; If your teacher uses an auto-grader, your teacher may not allow for it. I included both solutions.
 
*/
package programmingLabs;

import java.util.Scanner;

public class Lab10 {
/*	Sorting before deleting duplicates
	public static int[] eliminatingDuplicates(int[] list){
		int tempArr[] = new int[10] ;
		for (int i = 0 ; i < 10 ; i++) {
			tempArr[i] = -9 ;
		}
		java.util.Arrays.sort(list); 
		int j = 1 ;
		tempArr[0] = list[0];
		for (int i = 1; i < list.length ; i++){
			if (list[i] != list [i-1]) {
				tempArr[j] = list[i] ;
				j++;
			}
		}
		return tempArr ;
	}
*/
	public static int[] eliminatingDuplicates(int[] list) {
		int[] tempArr = new int[10];
		int k = 0;
		boolean found = false;
		for(int i = 0; i < 10; i++) {
			tempArr[k] = list[i];
			if(i != 0) {
				found = false;
				for(int j = 0; j < k; j++) {
					if(tempArr[k] == tempArr[j]) {
						found = true;
					}
				}
				if(found) {
					tempArr[k] = 0;
				}
				else {
					k++;
				}
			}
			else {
				k++;
			}
		}
		int[] ret = new int[k];
		for(int i = 0; i < k; i++) {
			ret[i] = tempArr[i];
		}
		return ret;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in) ;
		System.out.print("Enter ten numbers: ");
		int[] list = new int[10] ;
		for (int i = 0 ; i < 10 ; i++) {
			list[i] = in.nextInt();
		}
		int[] distinct = eliminatingDuplicates(list);
		System.out.print("The distinct numbers are: ");
		for (int i = 0;  i < distinct.length ; i++){
			if (distinct[i] == -9 ) {
				break;
			}
			else {
				System.out.print(distinct[i] + " ");
			}
		}
		in.close();
	}
}
