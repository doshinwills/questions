package com.doshin.array.questions;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * Write a program to find length of longest consecutive sequence in array of integers? (solution)
 * 
 * Given an unsorted array of integers, find the length of the longest consecutive elements sequence.
 * 
 * For example,
 * Given [100, 4, 200, 1, 3, 2],
 * Input: arr[] = {36, 41, 56, 35, 44, 33, 34, 92, 43, 32, 42}
 * 
 * The longest consecutive elements sequence is [1, 2, 3, 4]. Return its length: 4.
 * 
 * Challenging part of this question is that your algorithm should run in O(n) complexity. 
 * 
 * Read more: http://javarevisited.blogspot.com/2015/06/top-20-array-interview-questions-and-answers.html#ixzz4M3fw10ii
 * 
 * @author gwills
 * 
 */
public class AA25LongestConsecutiveSequence {

	public static void main(String[] args) {
		int arr[] = {36, 41, 56, 44, 33, 34, 92, 43, 32, 42};
		
		System.out.println(longestConsecutiveSequence(arr));
		
	}

	private static int longestConsecutiveSequence(int[] seq) {
		
		Set<Integer> numSet = new TreeSet<Integer>();
		int prevval = 0;
		int count = 0;
		int maxCount = 0;
		
		for(int num : seq) {
			numSet.add(num);
		}
		
		Iterator<Integer> numIterator = numSet.iterator();
		
		if(numIterator != null && numIterator.hasNext()) {
			prevval = numIterator.next();
			count++;
		}
		
		while(numIterator.hasNext()) {
			int nextVal = numIterator.next();
			if(++prevval == nextVal) {
				count++;
			} else {
				if(count > maxCount) {
					maxCount = count;
				}
				count = 1;
				prevval = nextVal;
			}
		}
		
		return maxCount;
	}

	

}
