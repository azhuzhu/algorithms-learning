package com.redhat.engineering.yzhu.algorithm.checkfactorsum;

public class Checker {

	public int checkFactorSum(int input) {
		int max = (int) (Math.sqrt(input) + 1);
		int base = 2;
		int left = (input - 1);
		int upper = input;
		for (int i = base; i < max; i++) {
			if (input % i == 0) {
				upper = input / i;
				left -= upper + i;
				if (left > 2) {
					continue;
				} else if (0 == left) {
					return 1;
				} else {
					return 0;
				}
			}
		}
		return 0;
	}

	public int checkFactorSumWithoutMath(int input) {
		int base = 2;
		int left = input - 1;
		int upper = input;
		boolean conti = true;
		int i = base;
		while (conti) {
			if (input % i == 0) {
				upper = input / i;
				left -= upper + i;
			}
			i++;
			if (left > input / i) {
				continue;
			} else if (0 == left) {
				return 1;
			} else {
				return 0;
			}

		}
		return 0;
	}

}
