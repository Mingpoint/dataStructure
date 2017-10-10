package com.datastructure.recursion;

public class Testfibonacci {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
//		fibonacci(47);
		fibonacci1(47);
		System.out.println(System.currentTimeMillis()-start);
	}

	public static int fibonacci(int n) {
		// write your code here
		if (n == 1) {
			return 0;
		}
		if (n == 2 || n == 3) {
			return 1;
		}
		return fibonacci(n - 1) + fibonacci(n - 2);
	}
	public static int fibonacci1(int n) {
		int a = 0;
		int b = 1;
		for (int i = 0; i < 2; i++) {
			int c = a + b;
			a = b;
			b = c;
		}
		return a;
	}
}
