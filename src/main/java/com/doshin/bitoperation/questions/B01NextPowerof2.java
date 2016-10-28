package com.doshin.bitoperation.questions;
/**
 * Write a function that, for a given no n, finds a number p which is greater than or equal to n and is a power of 2. 
 * @author gwills
 *
 */
public class B01NextPowerof2 {

	public static void main(String[] args) {
		int n = 14;
		System.out.println(Integer.toBinaryString(n));
		int k = n*2;
		System.out.println(Integer.toBinaryString(k));

		System.out.println(Integer.toBinaryString(n^k));
		
		
		System.out.println(logWay(5));
		System.out.println(shiftCountWay(11));
		System.out.println(logWay(17));
		System.out.println(logWay(35));
		
		System.out.println(13&12);
	}
	
	
	

	private static double logWay(double number) {
		return Math.pow(2, Math.ceil(log(number, 2)));
	}
	
	private static double shiftCountWay(int number) {
		int count = 0;
		while(number != 0) {
			number >>= 1;
			count++;
		}
		return Math.pow(2, count);		
	}



	static double log(double number, double base) {
		double log = Math.log(number) / Math.log(base);
		return log;
	}

}
