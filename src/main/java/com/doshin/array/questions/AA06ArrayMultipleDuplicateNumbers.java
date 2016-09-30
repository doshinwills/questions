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
 * @author gwills
 * 
 */
public class AA06ArrayMultipleDuplicateNumbers {

	static void printRepeating(int arr[]) {

		System.out.println("\nRepeating numbers are ");
		for (int i = 0; i < arr.length; i++) {
			if (arr[Math.abs(arr[i])] > 0) {
				arr[Math.abs(arr[i])] = -arr[Math.abs(arr[i])];
			} else
				System.out.print(Math.abs(arr[i]) + " ");
		}

	}

	/* Driver program to test the above function */
	public static void main(String[] args) {
		int arr[] = { 4, 2, 4, 5, 2, 3, 1 };
		printRepeating(arr);
	}

}
