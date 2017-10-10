package com.datastructure.link;

public class LinkStackTest {
	public static void main(String[] args) {
		LinkStack stack = new LinkStack();
		stack.push("sdfde");
		stack.push('p');
		stack.push(948);
		stack.push("9s4"+"8s3");
		stack.displayStack();
		Node pop = null;
		while(!stack.isEmpty()){
			pop = stack.pop();
			System.out.println("pop:"+pop.data);
		}
	}

}
