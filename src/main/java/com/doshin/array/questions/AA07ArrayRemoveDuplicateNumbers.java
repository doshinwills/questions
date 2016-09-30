package com.doshin.array.questions;

import java.util.Arrays;

/**
 * 
 * How to find repeated numbers in an array if it contains multiple duplicate?
 * (solution) This is actually the follow-up question of problem 2, how to find
 * duplicate number on integer array. In that case, array contains only one
 * duplicate but what if it contains multiple duplicates? Suppose, an array
 * contains n numbers ranging from 0 to n-1 and there are 5 duplicates on it,
 * how do you find it? You can use the approach, we have learned in similar
 * String based problem of finding repeated characters in given String.
 * 
 * Read more:
 * http://javarevisited.blogspot.com/2015/06/top-20-array-interview-questions
 * -and-answers.html#ixzz4LZbBukJ3
 * 
 * @author gwills
 * 
 */
public class AA07ArrayRemoveDuplicateNumbers {

	static int[] removeDuplicates(int arr[]) {

		int index = 0;
		int arr1[] = new int[arr.length];

		System.out.println("\nRepeating numbers are ");
		for (int i = 0; i < arr.length; i++) {
			if (arr[Math.abs(arr[i])] > 0) {
				arr[Math.abs(arr[i])] = -arr[Math.abs(arr[i])];
				arr1[index++] = Math.abs(arr[i]);
			}
		}
		
		return Arrays.copyOf(arr1, index);

	}

	/* Driver program to test the above function */
	public static void main(String[] args) {
		int arr[] = { 4, 2, 4, 5, 2, 3, 1 };
		
		System.out.println("Before removing dups ");
		for(int i = 0; i< arr.length; i++) {
			System.out.print(arr[i] + ", ");
		}
		
		int arr1[] = removeDuplicates(arr);
		System.out.println("After removing dups ");
		for(int i = 0; i< arr1.length; i++) {
			System.out.print(arr1[i] + ", ");
		}
	}

}
