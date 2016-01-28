package com.redhat.engineering.yzhu.algorithm.euclids;

public class Computer {

	public int calculate(int m, int n) {
		if (m < n) {
			int tmp = m;
			m = n;
			n = tmp;
		}
		return gcd(m, n);
	}

	private int gcd(int m, int n) {
		if (0 == n) {
			return m;
		} else {
			return gcd(n, m % n);
		}
	}

}
