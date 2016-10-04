package com.doshin.array.questions;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 
 * How to merge sorted array? (solution) Given two sorted integer arrays A and
 * B, merge B into A as one sorted array. You may assume that A has enough space
 * (size that is greater or equal to m + n) to hold additional elements from B.
 * The number of elements initialized in A and B are m and n respectively. This
 * is another intermediate array coding question, its not as simple as previous
 * one but neither very difficult.
 * 
 * Read more:
 * http://javarevisited.blogspot.com/2015/06/top-20-array-interview-questions
 * -and-answers.html#ixzz4M96fwIdY
 * 
 * @author gwills
 * 
 */
public class AA22MergeSortedArray {

	public static void main(String arg[]) {
		int arr[] = new int[20];

		arr[0] = 1;
		arr[1] = 3;
		arr[2] = 6;
		arr[3] = 10;
		arr[4] = 11;
		arr[5] = 15;
		int arr2[] = { 2, 4, 6, 7, 20 };

		mergeSortedArray(arr, arr2, 6, 5);

		for (int i = 0; i < 11; i++) {
			System.out.print(arr[i] + ", ");
		}

	}

	private static void mergeSortedArray(int[] arr1, int[] arr2, int m, int n) {

		int i = 0, j = 0, k = 0;
		while (i < m + n) {
			if (arr1[j] > arr2[k]) {
				for (int l = m; l > j; l--) {
					arr1[l] = arr1[l - 1];
				}
				arr1[j] = arr2[k];
				m++;
				k++;
			} else {
				i++;
				j++;

			}
		}

	}
}
