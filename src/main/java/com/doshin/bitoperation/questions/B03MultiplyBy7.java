package com.doshin.bitoperation.questions;

/**
 * 
 Efficient way to multiply with 7
 * 
 * We can multiply a number by 7 using bitwise operator. First left shift the
 * number by 3 bits (you will get 8n) then subtract the original numberfrom the
 * shifted number and return the difference (8n – n).
 * 
 * @author gwills
 * 
 */
public class B03MultiplyBy7 {

	public static void main(String[] args) {
		int number = 0;
		
		System.out.println(number&(number-1));
		System.out.println(multiplyBy7(number));

	}

	private static int multiplyBy7(int number) {
		int mul7Number = number << 3;
		return mul7Number - number;
		

	}

}
