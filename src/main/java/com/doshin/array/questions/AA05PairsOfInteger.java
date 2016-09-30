package com.doshin.array.questions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * How to find all pairs on integer array whose sum is equal to given number?
 * (solution) This is an intermediate level of array coding question, its
 * neither too easy nor too difficult. You have given an integer array and a
 * number, you need to write a program to find all elements in array whose sum
 * is equal to the given number. Remember, array may contain both positive and
 * negative numbers, so your solution should consider that. Don't forget to
 * write unit test though, even if interviewer is not asked for it, that would
 * separate you from lot of developers. Unit testing is always expected from a
 * professional developer.
 * 
 * Read more:
 * http://javarevisited.blogspot.com/2015/06/top-20-array-interview-questions
 * -and-answers.html#ixzz4LTpC4rfe
 * 
 * @author gwills
 * 
 */
public class AA05PairsOfInteger {

	public static void main(String[] args) {

		Random random = new Random();
		int seq[] = new int[100];
		for (int i = 0; i < 100; i++) {
			seq[i] = random.nextInt(1000);
		}

		int sum = 1000;
		
		Set<Integer> numberSet = new HashSet<Integer>();

		for (int i = 0; i < seq.length; i++) {
			System.out.println(numberSet.add(new Integer(1)));
		}

		findElementPairsBF(seq, sum);
		System.out.println("");
		findElementPairsHS(seq, sum);
		System.out.println("");
		findElementPairsSort(seq, sum);

	}

	private static void findElementPairsBF(int[] seq, int sum) {

		for (int i = 0; i < seq.length; i++) {
			for (int j = i + 1; j < seq.length; j++) {
				if (seq[i] + seq[j] == sum)
					System.out.println(seq[i] + " + " + seq[j] + " = "
							+ (seq[i] + seq[j]));
			}
		}

	}

	private static void findElementPairsHS(int[] seq, int sum) {

		Set<Integer> numberSet = new HashSet<Integer>();

		for (int i = 0; i < seq.length; i++) {
			numberSet.add(new Integer(seq[i]));
		}

		for (int i = 0; i < seq.length; i++) {
			int diff = sum - seq[i];

			if (numberSet.contains(new Integer(diff))) {
				System.out.println(seq[i] + " + " + diff + " = "
						+ (seq[i] + diff));
			}

			numberSet.remove(new Integer(diff));
			numberSet.remove(new Integer(seq[i]));
		}

	}

	private static void findElementPairsSort(int[] seq, int sum) {
		Arrays.sort(seq); 
		int left = 0, right = seq.length - 1;
		while (left <= right) { 
			if (seq[left] + seq[right] == sum) {
				System.out.println(seq[left] + " + " + seq[right] + " = "
						+ (seq[left] + seq[right]));
				left++;
				right--;
			} else if (seq[left] + seq[right] < sum) {
				left++;
			} else if (seq[left] + seq[right] > sum) {
				right--;
			}

		}
	}

}
