package com.doshin.bitoperation.questions;

/**
 * Find the Number Occurring Odd Number of Times Given an array of positive
 * integers. All numbers occur even number of times except one number which
 * occurs odd number of times. Find the number in O(n) time & constant space.
 * 
 * @author gwills
 * 
 */
public class B07NumberOccuringOddNumberOfTimes {

	public static void main(String[] args) {
		int ar[] = { 2, 3, 5, 4, 5, 2, 4, 3, 5, 2, 4, 4, 2 };
		System.out.println(numberOccuringOddNumberOfTimes(ar));

	}

	private static int numberOccuringOddNumberOfTimes(int[] ar) {

		int singleNum = 0;
		for (int a : ar) {
			singleNum = singleNum ^ a;
		}
		return singleNum;
	}

}
