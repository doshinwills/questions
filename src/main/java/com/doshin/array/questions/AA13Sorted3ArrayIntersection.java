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
public class AA13Sorted3ArrayIntersection {

	public static void main(String[] args) {
		int seq1[] = new int[100];
		int seq2[] = new int[110];
		int seq3[] = new int[120];

		Random random1 = new Random();
		Random random2 = new Random();
		Random random3 = new Random();

		for (int i = 0; i < 100; i++) {
			seq1[i] = random2.nextInt(1000);
		}

		for (int i = 0; i < 110; i++) {
			seq2[i] = random2.nextInt(1000);
		}
		
		for (int i = 0; i < 120; i++) {
			seq3[i] = random3.nextInt(1000);
		}
		Arrays.sort(seq1);
		Arrays.sort(seq2);
		Arrays.sort(seq3);
		
		int ar1[] = {1, 5, 10, 20, 40, 80};
	    int ar2[] = {6, 7, 20, 80, 100};
	    int ar3[] = {3, 4, 15, 20, 30, 70, 80, 120};
		

		findSortedArrayIntersection(seq1, seq2, seq3);
	}

	static void findSortedArrayIntersection(int seq1[], int seq2[], int seq3[]) {
		int inter[] = new int[100];
		int i = 0;
		int j = 0;
		int k = 0;

		while (i < seq1.length && j < seq2.length && k < seq3.length) {
			if(seq1[i] == seq2[j] && seq1[i] == seq3[k]) {
				System.out.println(seq1[i]);
				i++;
				j++;
				k++;
			} else if(seq1[i] < seq2[j]) {
				i++;
			} else if(seq2[j] < seq3[k]) {
				j++;
			} else {
				k++;
			}
			
			
		}
	}
}
