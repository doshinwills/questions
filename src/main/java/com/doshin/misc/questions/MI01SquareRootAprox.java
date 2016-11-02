package com.doshin.misc.questions;

import java.math.BigDecimal;

public class MI01SquareRootAprox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double sqRoot = squarRoot(0, 4);
		System.out.println(sqRoot);

	}

	/**
	 * Find square root by approximation
	 * 
	 * @param number
	 * @param epsilon
	 * @return
	 */
	public static double squarRoot(double number, double epsilon) {
		double estimate = 0;
		double square = BigDecimal.valueOf(epsilon * epsilon)
				.setScale(8, BigDecimal.ROUND_HALF_UP).doubleValue();
		if (square != number) {
			estimate = number / epsilon;
			epsilon = (epsilon + estimate) / 2;
			epsilon = squarRoot(number, epsilon);
		}
		return BigDecimal.valueOf(epsilon)
				.setScale(8, BigDecimal.ROUND_HALF_UP).doubleValue();
	}

}
