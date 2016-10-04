package com.doshin.array.questions;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Random;

/**
 * How to find kth largest element in unsorted array? (solution)
 * This problem is exactly same as previous question with only difference 
 * being finding kth largest element instead of kth smallest number. 
 * For example if given array is {10, 20, 30, 50, 40} and k = 3 then your program 
 * should return 30 because 30 is the 3rd largest number in array. You can also 
 * solve this problem by sorting the array in decreasing order and picking k-1th element. 
 * I often seen this array question on Java interviews with 2 to 3 years experienced guys.
 * 
 * Read more: http://javarevisited.blogspot.com/2015/06/top-20-array-interview-questions-and-answers.html#ixzz4M8ncFdEg
 * 
 * @author gwills
 * 
 */
public class AA12KthLargestElement {

	public static void main(String[] args) {
		int seq1[] = new int[100];
		Random random1 = new Random();

		for (int i = 0; i < 100; i++) {
			seq1[i] = random1.nextInt(1000);
		}
		//int seq2[] = { 3, 2, 1, 5, 6, 4 };
		System.out.println(kthLargestElement(seq1, 7));
	}

	static int kthLargestElement(int seq1[], int k) {
		PriorityQueue<Integer> q = new PriorityQueue<Integer>(k, new HeighestNumberComparator());

		for (int i = 0; i < seq1.length; i++) {
			q.offer(seq1[i]);

			if (q.size() > k) {
				q.poll();
				
			}
		}

		return q.peek();

	}
}

class HeighestNumberComparator implements Comparator<Integer>
{

	public int compare(Integer x, Integer y)
    {
        return x - y;
    }
    
}
