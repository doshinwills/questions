package com.doshin.array.questions;

import java.util.Random;

/**
 * How to find duplicate number on Integer array in Java? (solution)
 * An array contains n numbers ranging from 0 to n-2. 
 * There is exactly one number is repeated in the array. 
 * You need to write a program to find that duplicate number. 
 * For example, if an array with length 6 contains numbers {0, 3, 1, 2, 3}, then duplicated number is 3. 
 * Actually this problem is very similar to previous one and you can apply the same trick of comparing 
 * actual sum of array to expected sum of series to find out that duplicate. This is generally asked as follow-up question of previous problem.
 * Read more: http://javarevisited.blogspot.com/2015/06/top-20-array-interview-questions-and-answers.html#ixzz4LTiyVGJb
 * 
 * @author gwills
 *
 */
public class AA10NonRepeatNumber {

	public static void main(String[] args) {
		int seq[] = new int[101];
		for (int i = 0; i < 100; i++) {
			seq[i] = i + 1;
		}
		

		int repeatInt = new Random().nextInt(100);
		seq[100] =  repeatInt;

		System.out.println(findRepeatNumber(seq));
	}

	static int findRepeatNumber(int seq[]) {
		int sum = 0;
		for (int i = 0; i < seq.length; i++) {
			sum += seq[i];
		}
		int missingInt = sum - (seq.length- 1) * seq.length/ 2;
		return missingInt;
	}

}
