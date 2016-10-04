package com.doshin.array.questions;

import java.util.Random;

/**
 * How to find minimum value in a rotated sorted array? (solution) This is
 * another advanced level array coding question and you should only attempt this
 * one, once you have solved the easier ones. Suppose a sorted array is rotated
 * at some pivot unknown to you beforehand.
 * 
 * (i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).
 * 
 * Find the minimum element.
 * 
 * You may assume no duplicate exists in the array. One follow-up question of
 * this question is What if duplicates are allowed? Would this affect the
 * run-time complexity? How and why?
 * 
 * Read more:
 * http://javarevisited.blogspot.com/2015/06/top-20-array-interview-questions
 * -and-answers.html#ixzz4M3RhmyTA
 * 
 * @author gwills
 * 
 */
public class AA26FindMinRotatedSortedArray {

	public static void main(String[] args) {

		Random random = new Random();
		int seq[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		// int seq[] = {3, 4, 5, 1, 2};

		System.out.println(seq[findMinRotatedSortedArray(seq, 1)]);

		System.out.println(seq[findMinRotatedSortedArrayBinaryWay(seq, 1)]);

	}

	private static int findMinRotatedSortedArray(int[] seq, int k) {

		int arrayLength = seq.length;
		int index = 0;

		for (int i = 1; i < arrayLength; i++) {

			if (seq[i - 1] > seq[i]) {
				index = i;
			}
		}

		index = (index + k - 1) % seq.length;

		return index;
	}

	private static int findMinRotatedSortedArrayBinaryWay(int[] seq, int k) {

		int index = findMin(seq, 0, seq.length - 1);

		index = (index + k - 1) % seq.length;
		return index;

	}

	private static int findMin(int[] seq, int start, int end) {

		if (start == end)
			return 0;

		int mid = start + (end - start) / 2;

		if (mid > start && seq[mid - 1] > seq[mid])
			return mid;

		if (seq[mid] > seq[end]) {
			return findMin(seq, mid, end);
		} else {
			return findMin(seq, start, mid);
		}

	}

}
