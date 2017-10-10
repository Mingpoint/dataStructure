package com.datastructure.link;

public class LinkQueueTest {
	public static void main(String[] args) {
		LinkQueue link = new LinkQueue();
		link.push(21);
		link.push(44);
		link.push("obj");
		link.push("we23");
		link.push("we4");
		link.push("we54");
		
		link.display();
		Node pop = null;
		while(!link.isEmpty()){
			pop = link.pop();
			System.out.println("pop:"+pop.data);
		}
		
	}

}
