package com.datastructure.link;

public class SortLinkListTest {
	public static void main(String[] args) {
		SortLinkList sort = new SortLinkList();
		sort.add(3);
		sort.add(2);
		sort.add(1);
		sort.add(4);
		sort.add(6);
		sort.add(6);
		sort.displaySortLinkList();
		
		Node delete = sort.delete(4);
		System.out.println("delete:	"+delete.data);
	}

}
