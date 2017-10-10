package com.datastructure.link;

public class DeLinkListTest {
	public static void main(String[] args) {
		DeLinkList list = new DeLinkList();
		list.add(5);
		list.add(3);
		list.add(44);
		list.add(12);
		list.add(15);
//		list.displayLinkList();
		list.addLast("psos");
		list.displayLinkList();
	}
}
