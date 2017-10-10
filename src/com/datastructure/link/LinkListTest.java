package com.datastructure.link;


public class LinkListTest {
	public static void main(String[] args) {
		HeadLinkList list = new HeadLinkList();
		list.add(5);
		list.add(3);
		list.add(44);
		list.add(12);
		list.add(15);
		list.displayLinkList();
		Node findNode = list.findNode(12);
		System.out.println("findNode:"+findNode.data);
	}
}
