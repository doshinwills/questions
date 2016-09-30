package com.doshin.array.questions;

import java.util.Random;

/**
 * Find the largest and smallest number in an non sorted array
 * 
 * @author gwills
 *
 */
public class AA04LargestSmallestNumber {

	public static void main(String[] args) {
		int seq[] = new int[100];
		for (int i = 0; i < 100; i++) {
			seq[i] = new Random().nextInt(1000);
		}

		int largest = seq[0];
		int smallest = seq[0];
		for (int i = 1; i < seq.length; i++) {
			if (seq[i] > largest)
				largest = seq[i];
			if (seq[i] < smallest)
				smallest = seq[i];
		}
		System.out.println("Largest -> " + largest);
		System.out.println("Samllest -> " + smallest);
	}
}
