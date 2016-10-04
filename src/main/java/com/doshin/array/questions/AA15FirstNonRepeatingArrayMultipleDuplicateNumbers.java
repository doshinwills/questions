package com.doshin.array.questions;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * 
 * How to find first non-repeating element in array of integers? (solution) This
 * array interview question is exactly opposite of previous problem, In that you
 * need to find first repeating element while in this you need to find first
 * non-repeating element. I am sure you can use similar approach to solve this
 * problem, just need to consider non repeating element though.
 * 
 * Read more:
 * http://javarevisited.blogspot.com/2015/06/top-20-array-interview-questions
 * -and-answers.html#ixzz4M8pvZebB
 * 
 * @author gwills
 * 
 */
public class AA15FirstNonRepeatingArrayMultipleDuplicateNumbers {

	static void printNonRepeating(int arr[]) {

		int min = Integer.MAX_VALUE;
		Set<Integer> uniqueInt = new LinkedHashSet<Integer>();
		System.out.println("\nRepeating numbers are ");
		for (int i = 0; i < arr.length; i++) {
			if (!uniqueInt.contains(arr[i])) {
				uniqueInt.add(arr[i]);
			} else {
				uniqueInt.remove(arr[i]);
			}
		}
		System.out.print("First repeating min value is " + uniqueInt.iterator().next());
	}

	/* Driver program to test the above function */
	public static void main(String[] args) {
		int arr[] = { 4, 2, 2, 5, 4, 3, 1 };
		printNonRepeating(arr);
	}

}
