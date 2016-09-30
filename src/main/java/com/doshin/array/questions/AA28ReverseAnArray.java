package com.doshin.array.questions;

import java.util.Random;

/**
 * How to reverse array in place in Java? (solution)
 * Now let's see one of the most frequently asked array interview question. 
 * You need to write a program which accepts an integer array and your program needs 
 * to reverse that array in place, which means you cannot use additional buffer or array, 
 * but one or two variables will be fine. Of course you cannot use any open source library 
 * or Java API method to directly solve this problem, you need to create your own logic.
 * 
 * Read more: http://javarevisited.blogspot.com/2015/06/top-20-array-interview-questions-and-answers.html#ixzz4LTk5a2jI
 * 
 * @author gwills
 *
 */
public class AA28ReverseAnArray {
	
	public static void main(String[] args) {
		
		
		Random random = new Random();
		int seq[] = new int[100];
		for (int i = 0; i < 100; i++) {
			seq[i] = random.nextInt(1000);
		}
		
		for(int i = 0; i< seq.length; i++) {
			System.out.print(seq[i] + ", ");
		}

		System.out.println("");

		reverseArray(seq);
		
		for(int i = 0; i< seq.length; i++) {
			System.out.print(seq[i] + ", ");
		}

		System.out.println("");
		
	}

	private static void reverseArray(int[] seq) {
		
		for(int i = 0, length = seq.length - 1; i< seq.length/2; i++) {
			int temp = seq[i];
			seq[i] = seq[length - i];
			seq[length - i] = temp;
		}
		
	}
	

}
