package com.doshin.array.questions;

import java.util.PriorityQueue;
import java.util.Random;

/**
 * How to find kth smallest element in unsorted array? (solution)
 * You are given an unsorted array of numbers and k, you need to find the kth smallest 
 * number in the array. For example if given array is {1, 2, 3, 9, 4} and k=2 then you 
 * need to find the 2nd smallest number in the array, which is 2. One way to solve this 
 * problem is to sort the array in ascending order then pick the k-1th element, that would 
 * be your kth smallest number in array because array index starts at zero, but can you do better? 
 * Once you are able to solve this array coding question, you can solve many similar questions easily e.g. our next question.
 * 
 * Read more: http://javarevisited.blogspot.com/2015/06/top-20-array-interview-questions-and-answers.html#ixzz4M8npkIte
 * 
 * @author gwills
 * 
 */
public class AA11KthSmallestElement {

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
