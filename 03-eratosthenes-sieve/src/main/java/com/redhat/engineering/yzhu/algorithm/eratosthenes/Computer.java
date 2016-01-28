package com.redhat.engineering.yzhu.algorithm.eratosthenes;

import java.util.Arrays;

public class Computer {

	public int[] sieve(int n) {
		int[] arr = new int[n + 1];
		for (int i = 0; i <= n; i++) {
			arr[i] = i;
		}
		int removedCount = 0;
		for (int i = 2; i <= (int) Math.sqrt(n); i++) {
			if (0 != arr[i]) {
				int j = i * i;
				while (j <= n) {
					arr[j] = 0;
					j += i;
				}
			}
		}
		int[] out = new int[n];
		int j = 0;
		for (int i = 2; i <= n; i++) {
			if (0 != arr[i]) {
				out[j++] = arr[i];
			}
		}
		return Arrays.copyOf(out, j);
	}

}
