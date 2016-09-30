package com.doshin.array.questions;

/**
 * 
 * How to check if array contains a duplicate number? (answer) This may look a
 * repeated question because we have already done similar question, but in this
 * question, most from Java interviews, you need to write a contains() like
 * method from Collections, which returns true or false if you pass an element
 * and it is repeated or not.
 * 
 * Read more:
 * http://javarevisited.blogspot.com/2015/06/top-20-array-interview-questions
 * -and-answers.html#ixzz4LTjcQ4k2
 * 
 * Solution
 * 	
 * Brute force - two loops to find the first repeating
 * n*2
 * 
 * Sorting and find the element
 * nlogn
 * 
 * Hashset
 * time - n
 * space - 2*n
 * 
 * Start from the back and iterate till you find the last element
 * Only for positive numbers
 * time - n
 * space - n
 * 
 * 	
 * @author gwills
 * 
 */
public class AA14FirstRepeatingArrayMultipleDuplicateNumbers {

	static void printRepeating(int arr[]) {

		int min = Integer.MAX_VALUE;
		System.out.println("\nRepeating numbers are ");
		for (int i = arr.length - 1; i >= 0; i--) {
			if (arr[Math.abs(arr[i])] > 0) {
				arr[Math.abs(arr[i])] = -arr[Math.abs(arr[i])];
			} else {
				if(i < min)
					min = i;
			}
				
		}
		
		
		
		System.out.print("First min value is " + Math.abs(arr[min]));
	}

	/* Driver program to test the above function */
	public static void main(String[] args) {
		int arr[] = { 4, 2, 2, 5, 4, 3, 1 };
		printRepeating(arr);
	}

}
