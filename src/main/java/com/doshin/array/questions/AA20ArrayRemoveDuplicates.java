package com.doshin.array.questions;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * How to remove duplicates from array in place? (solution) Given a sorted
 * array, remove the duplicates in place such that each element appear only once
 * and return the new length.
 * 
 * Do not allocate extra space for another array, you must do this in place with
 * constant memory.
 * 
 * For example, Given input array A = [1,1,2],
 * 
 * Your function should return length = 2, and A is now [1,2].
 * 
 * Read more:
 * http://javarevisited.blogspot.com/2015/06/top-20-array-interview-questions
 * -and-answers.html#ixzz4M8zbdH8J
 * 
 * @author gwills
 * 
 */
public class AA20ArrayRemoveDuplicates {

	public static void main(String arg[]) {
		int arr[] = { 10, 5, 3, 4, 3, 5, 6 };

		for (int i = 0; i < arrayRemoveDuplicates(arr); i++) {
			System.out.print(arr[i] + ", ");
		}

	}

	private static int arrayRemoveDuplicates(int[] arr) {

		Set<Integer> numSet = new HashSet<Integer>();
		int index = 0;
		for (int i = 0; i < arr.length; i++) {

			if (!numSet.contains(arr[i])) {
				numSet.add(arr[i]);
				arr[index++] = arr[i];
			}
		}

		return index;
	}
}
