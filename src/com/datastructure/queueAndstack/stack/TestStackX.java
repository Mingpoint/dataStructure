package com.datastructure.queueAndstack.stack;

public class TestStackX {
	public static void main(String[] args) {
		StackX stackX = new StackX(5);
		System.out.println("=========压栈=========");
		for (int i = 0; i < 6; i++) {
			stackX.push(i);
		}
		System.out.println("=========寻找=========");
		System.out.println(stackX.peek());

		System.out.println("=========出栈=========");
		while(!stackX.isEmpty()){
			System.out.println(stackX.pop());
		}
	}
}
