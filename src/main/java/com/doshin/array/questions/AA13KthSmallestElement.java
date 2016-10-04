package com.doshin.array.questions;

import java.util.PriorityQueue;
import java.util.Random;

/**
 * Write a program to find intersection of two sorted array in Java? (solution)
 * Another interesting array interview question, where you need to treat array
 * as Set. Your task is to write a function in your favorite language e.g. Java,
 * Python, C or C++ to return intersection of two sorted array. For example, if
 * the two sorted arrays as input are {21, 34, 41, 22, 35} and {61, 34, 45, 21,
 * 11}, it should return an intersection array with numbers {34, 21}, For the
 * sake of this problem you can assume that numbers in each integer array are
 * unique.
 * 
 * Read more:
 * http://javarevisited.blogspot.com/2015/06/top-20-array-interview-questions
 * -and-answers.html#ixzz4LTjEG9Fj
 * 
 * @author gwills
 * 
 */
public class AA13KthSmallestElement {

	public static void main(String[] args) {
		int seq1[] = new int[100];
		Random random1 = new Random();

		for (int i = 0; i < 100; i++) {
			seq1[i] = random1.nextInt(1000);
		}
		int seq2[] = { 3, 2, 1, 5, 6, 4 };
		System.out.println(kthSmallestElement(seq2, 2));
	}

	static int kthSmallestElement(int seq1[], int k) {
		PriorityQueue<Integer> q = new PriorityQueue<Integer>(k);

		for (int i = 0; i < seq1.length; i++) {
			q.offer(seq1[i]);

			if (q.size() > k) {
				q.poll();
			}
		}

		return q.peek();

	}
}
