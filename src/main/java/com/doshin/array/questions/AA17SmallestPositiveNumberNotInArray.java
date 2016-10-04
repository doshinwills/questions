package com.doshin.array.questions;


/**
 * How to find the smallest positive integer value that cannot be represented as sum of any subset of a given array? (solution)
 * This is another tough array question you will see on Amazon, Microsoft or Google. 
 * You have given a sorted array (sorted in non-decreasing order) of positive numbers, 
 * find the smallest positive integer value that cannot be represented as sum of elements 
 * of any subset of given set. What makes it more challenging is expected time complexity of O(n).
 * 
 * Examples:
 * Input: {1, 3, 6, 10, 11, 15};
 * Output: 2
 * 
 * Read more: http://javarevisited.blogspot.com/2015/06/top-20-array-interview-questions-and-answers.html#ixzz4M4NGBjGJ
 * 
 * @author gwills
 * 
 */
public class AA17SmallestPositiveNumberNotInArray {

	static int findSmallest(int arr[], int n) 
    {
        int res = 1; // Initialize result
 

        for (int i = 0; i < n && arr[i] <= res; i++)
            res = res + arr[i];
 
        return res;
    }
 
    // Driver program to test above functions
    public static void main(String[] args) 
    {
        
        int arr1[] = {1, 3, 4, 5};
        int n1 = arr1.length;
        System.out.println(findSmallest(arr1, n1));
 
        int arr2[] = {1, 2, 6, 10, 11, 15};
        int n2 = arr2.length;
        System.out.println(findSmallest(arr2, n2));
 
        int arr3[] = {1, 1, 1, 1};
        int n3 = arr3.length;
        System.out.println(findSmallest(arr3, n3));
 
        int arr4[] = {1, 2, 4, 8, 16, 32, 64, 128};
        int n4 = arr4.length;
        System.out.println(findSmallest(arr4, n4));
 
    }

}
