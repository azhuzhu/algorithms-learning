package com.redhat.engineering.yzhu.algorithm.euclids;

public class App {

	public static void main(String[] args) {
		int[] inputs = null;
		if (null != args && args.length == 2) {
			inputs = new int[2];
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
		Computer computer = new Computer();
		System.out.println("input Num: [" + inputs[0] + ", " + inputs[1] + "], result: "
				+ computer.calculate(inputs[0], inputs[1]) + ".");
	}

}
