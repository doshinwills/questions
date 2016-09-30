package com.doshin.array.questions;

import java.util.Random;

/**
 * How to find the missing number in integer array of 1 to 100? (solution)
 * This is one of the most simple array problems you will see, 
 * mostly asked in a telephonic round of Interview. You have given an integer 
 * array which contains numbers from 1 to 100 but one number is missing, 
 * you need to write a Java program to find that missing number in an array. 
 * You cannot use any open source library or Java API method which solves this problem. 
 * One trick to solve this problem is to calculate sum of all numbers in the array and compare with expected sum, 
 * the difference would be the missing number.
 * Read more: http://javarevisited.blogspot.com/2015/06/top-20-array-interview-questions-and-answers.html#ixzz4LTildBAa
 * 
 * @author gwills
 *
 */
public class AA01MissingNumber {

	public static void main(String[] args) {
		int seq[] = new int[100];
		for (int i = 0; i < 100; i++) {
			seq[i] = i + 1;
		}

		int missingInt = new Random().nextInt(100);
		seq[missingInt] = 0;
		System.out.println(findMissingNumber(seq));
	}

	static int findMissingNumber(int seq[]) {
		int sum = 0;
		for (int i = 0; i < seq.length; i++) {
			sum += seq[i];
		}
		int missingInt = seq.length * (seq.length + 1) / 2 - sum;
		return missingInt;
	}

}
