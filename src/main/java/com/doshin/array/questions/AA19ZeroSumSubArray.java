package com.doshin.array.questions;

import java.util.HashMap;
import java.util.Map;

/**
 * How to find if there is a sub array with sum equal to zero? (solution)
 * There is whole set of array related questions which are based upon sub-array or only 
 * selective elements of array e.g. from some range, this is one of such problem. 
 * Here you are given an array of positive and negative numbers, find if there is a sub-array with 0 sum.
 * 
 * Examples:
 * 
 * Input: {4, 2, -3, 1, 6}
 * Output: true 
 * There is a sub-array with zero sum from index 1 to 3.
 * 
 * Read more: http://javarevisited.blogspot.com/2015/06/top-20-array-interview-questions-and-answers.html#ixzz4M4JKpRkE	
 * 
 * @author gwills
 * 
 */
public class AA19ZeroSumSubArray {

	public static void main(String arg[]) {
		int arr[] = { 4, 2, -3, 1, 6 };
		if (printZeroSumSubarray(arr))
			System.out.println("Found a subarray with 0 sum");
		else
			System.out.println("No Subarray with 0 sum");
	}

	private static boolean printZeroSumSubarray(int[] arr) {

		Map<Integer, Integer> numMap = new HashMap<Integer, Integer>();
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];

			if (sum == 0 || arr[i] == 0 || numMap.get(sum) != null)
				return true;
			numMap.put(sum, i);
		}

		return false;
	}
}
