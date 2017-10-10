package com.datastructure.link.duobleLink;

public class DuobleLinkListTest {
	public static void main(String[] args) {
		DuobleLinkList list = new DuobleLinkList();
		list.addFirst(90);
		list.addFirst("aa");
		list.addFirst("dd");
		list.addFirst(434);
		list.addFirst(578);
		list.addFirst(32);
		list.addFirst(10);
		list.addAfterObj("dd", "dd1");
		list.display();
	}

}
