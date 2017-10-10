package com.datastructure.queueAndstack.infix;

public class TestInToPost {
	public static void main(String[] args) {
		String in = "6+7*(5-4)";
		InToPost into = new InToPost(in);
		String out = into.in();
		System.out.println(out);
	}

}
