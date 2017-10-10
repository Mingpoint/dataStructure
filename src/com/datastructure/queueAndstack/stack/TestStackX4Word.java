package com.datastructure.queueAndstack.stack;

import java.util.Scanner;

public class TestStackX4Word {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nextLine = sc.nextLine();
		char[] charArray = nextLine.toCharArray();
		StackX4Word stack = new StackX4Word(charArray.length);
		for (int i = 0; i < charArray.length; i++) {
			stack.push(charArray[i]);
		}
		nextLine = "";
		while (!stack.isEmpty()) {
			char pop = stack.pop();
			nextLine = nextLine + pop;
		}
		System.out.println(nextLine);
	}

}
