package com.datastructure.link;

public class TaillinkListTest {
	public static void main(String[] args) {
		TailLinkList list = new TailLinkList();
		Node head = null;
		head = list.add(head,23);
		list.add(head,55);
		list.add(head,97);
		list.add(head, 90);
		list.displayLinkList(head);
		while(head != null){
			head = list.delete(head);
			System.out.println("delete:"+head.data);
			head = head.next;
		}
	}

}
