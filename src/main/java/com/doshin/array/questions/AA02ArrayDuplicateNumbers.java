package com.doshin.array.questions;

import java.util.Random;


/**
 * 
 * How to check if array contains a duplicate number? (answer)
 * This may look a repeated question because we have already done similar question, 
 * but in this question, most from Java interviews, you need to write a contains() 
 * like method from Collections, which returns true or false if you pass an element and it is repeated or not.
 * 
 * Read more: http://javarevisited.blogspot.com/2015/06/top-20-array-interview-questions-and-answers.html#ixzz4LTjcQ4k2
 * 
 * @author gwills
 *
 */
public class AA02ArrayDuplicateNumbers {

	public static void main(String[] args) {
		int seq[] = new int[100];
		for (int i = 0; i < 99; i++) {
			seq[i] = i + 1;
		}

		int duplicateNumber = new Random().nextInt(100);
		seq[99] = duplicateNumber;
		System.out.println("duplicateNumber " + duplicateNumber);

		System.out.println(findDuplicateNumber(seq));
	}

	static int findDuplicateNumber(int seq[]) {
		int sum = 0;
		for (int i = 0; i < seq.length; i++) {
			sum += seq[i];
		}
		int missingInt = sum - seq.length * (seq.length - 1) / 2;
		return missingInt;
	}

}
