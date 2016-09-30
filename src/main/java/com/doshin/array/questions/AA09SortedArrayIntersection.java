package com.doshin.array.questions;

import java.util.Arrays;
import java.util.Random;

/**
 * Write a program to find intersection of two sorted array in Java? (solution)
 * Another interesting array interview question, where you need to treat array as Set. 
 * Your task is to write a function in your favorite language e.g. Java, Python, C or C++ 
 * to return intersection of two sorted array. For example, if the two sorted arrays as input 
 * are {21, 34, 41, 22, 35} and {61, 34, 45, 21, 11}, it should return an intersection array with numbers 
 * {34, 21}, For the sake of this problem you can assume that numbers in each integer array are unique.
 * 
 * Read more: http://javarevisited.blogspot.com/2015/06/top-20-array-interview-questions-and-answers.html#ixzz4LTjEG9Fj
 * 
 * @author gwills
 *
 */
public class AA09SortedArrayIntersection {

	public static void main(String[] args) {
		int seq1[] = new int[100];
		int seq2[] = new int[110];

		Random random1 = new Random();
		Random random2 = new Random();

		for (int i = 0; i < 100; i++) {
			seq1[i] = random2.nextInt(1000);
		}

		for (int i = 0; i < 110; i++) {
			seq2[i] = random2.nextInt(1000);
		}
		Arrays.sort(seq1);
		Arrays.sort(seq2);
		findSortedArrayIntersection(seq1, seq2);
	}

	static void findSortedArrayIntersection(int seq1[], int seq2[]) {
		int inter[] = new int[100];
		int i = 0;
		int j = 0;

		while (i < seq1.length && j < seq2.length) {
			if (seq1[i] < seq2[j]) {
				i++;
			} else if (seq1[i] > seq2[j]) {
				j++;
			} else {
				System.out.println(seq1[i++]);
				j++;
			}
			
		}
	}
}
