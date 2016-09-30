package com.doshin.array.questions;

import java.util.Random;

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
public class AA03ArraySearchNumbers {

	public static void main(String[] args) {
		int seq[] = new int[100];
		for (int i = 0; i < 100; i++) {
			seq[i] = i + 1;
		}

		int searchNumber = new Random().nextInt(100);
		System.out.println("searchNumber " + searchNumber);

		findNumberSeq(seq, searchNumber);
		
		System.out.println("Found element at " + findNumberBin(seq, searchNumber));

	}

	static void findNumberSeq(int seq[], int searchNumber) {
		int sum = 0;
		for (int i = 0; i < seq.length; i++) {
			if (seq[i] == searchNumber)
				System.out.println("Found at " + i);
		}

	}

	static int findNumberBin(int seq[], int searchNumber) {

		int start = 0;
		int end = seq.length - 1;

		while (start < end) {
			int mid = (start + end) / 2;
			if (searchNumber < seq[mid]) {
				end = mid;
			} else if (searchNumber > seq[mid]) {
				start = mid;
			} else {
				return mid;
			}
		}
		return -1;

	}

}
