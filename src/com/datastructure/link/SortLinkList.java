package com.datastructure.link;

/**
 * 有序链表
 * @author Mingpoint
 * @date 2017年9月15日 上午10:03:25 
 *
 */
public class SortLinkList {
	private Node first;
	
	public void add(Object obj){
		Node node = new Node(obj);
		Node current = first; 
		Node previous = null;
		while(current != null && ((int)obj > (int)current.data)){
			previous = current;
			current = current.next;
		}
		if(previous == null){
			first = node;
		}else{
			previous.next = node;
		}
		node.next = current;
	}
	public void deleteAll(){
		
		while(first != null){
			first = first.next;
		}
		return;
	}
	public Node deletefirst(){
		Node node = null;
		while(first != null){
			node = first;
			first = first.next;
		}
		return node;
	}
	public Node delete(Object obj){
		Node node = null;
		Node current = first; 
		while(current != null){
			if(current.data.equals(obj)){
				node = current;
				break;
			}else{
				current = current.next;
			}
		}
		return node;
	}
	public boolean isEmpty(){
		return false;
	}

	public void displaySortLinkList() {
		Node node = first;
		while (node != null) {
			System.out.println("node:" + node);
			System.out.println("data:" + node.data);
			node = node.next;
		}
	}
	
	
	
	
	
	
	
	
	
	
	

}
