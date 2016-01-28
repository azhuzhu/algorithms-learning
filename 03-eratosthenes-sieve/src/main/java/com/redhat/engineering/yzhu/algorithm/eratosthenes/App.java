package com.redhat.engineering.yzhu.algorithm.eratosthenes;

import java.util.Arrays;

public class App {

	public static void main(String[] args) {
		if (null != args && args.length > 0) {
			try {
				int input = Integer.valueOf(args[0]);
				Computer computer = new Computer();
				System.out.println("input Num: " + input + ", result: \n" + prt(computer.sieve(input)));
			} catch (NumberFormatException e) {
				throw new IllegalArgumentException("contains non-integer input.", e);
			}
		} else {
			throw new IllegalArgumentException("please input your tested integer");
		}

	}

	private static String prt(int[] sieved) {
		StringBuilder sb = new StringBuilder();
		int count = 0;
		int colCount = Math.min(10,(int)Math.sqrt(sieved.length)); 
		for (int i : sieved) {
			count++;
			sb.append(i + "\t");
			if (colCount == count) {
				count = 0;
				sb.append("\n");
			}

		}
		return sb.toString();
	}

}
