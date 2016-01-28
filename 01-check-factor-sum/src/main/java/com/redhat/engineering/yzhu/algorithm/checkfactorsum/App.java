package com.redhat.engineering.yzhu.algorithm.checkfactorsum;

public class App {

	public static void main(String[] args) {
		int[] inputs = null;
		if (null != args && args.length > 0) {
			inputs = new int[args.length];
			try {
				for (int i = 0; i < args.length; i++) {
					inputs[i] = Integer.valueOf(args[i]);
				}
			} catch (NumberFormatException e) {
				throw new IllegalArgumentException("contains non-integer input(s).", e);
			}
		} else {
			throw new IllegalArgumentException("please input your tested integer");
		}
		Checker checker = new Checker();
		for (int i : inputs) {
			System.out.println("input Num: " + i + ", result: "+ checker.checkFactorSumWithoutMath(i) + ".");
		}

	}

}
