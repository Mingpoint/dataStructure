package com.datastructure.link;


/**
 * 双端链表
 * @author Mingpoint
 * @date 2017年9月13日 下午3:41:00 
 *
 */
public class DeLinkList {
	private Node first;
	private Node last;

	 public DeLinkList(){
		 first = null;
	 }
	public boolean isEmpty() {
		return first == null;
	}

	public boolean add(Object obj) {
		Node node = new Node(obj);
		if(first == null){
			last = node;
		}
		node.next = first;
		first = node;
		return true;
	}
	public boolean addLast(Object obj){
		Node node = new Node(obj);
		if(first == null){
			first = node;
		}else{
			last.next = node;
		}
		last = node;
		return false;
	}

	public Node findNode(Object obj) {
		Node current = first;
		while (current != null) {
			if (obj.equals(current.data)) {
				break;
			} else {
				current = current.next;
			}
		}
		return current;
	}

	public Node delete() {
		Node node = null;
		if (this.isEmpty()) {
			return node;
		}
		if(first.next == null){
			last = null;
		}
		node = first;
		first = first.next;
		
		return node;
	}
	public Node deleteLast(){
		Node node = null;
		if (this.isEmpty()) {
			return node;
		}
		if(first.next == null){
			last = first;
			first = null;
			return last;
		}else{
			Node node1 = first;
			node = last;
			while(node1.next != null){
				if(node1.next == last){
					last = node1;
					last.next = null;
					break;
				}
				node1 = node1.next;
			}
		}
		return node;
	}

	public void displayLinkList() {
		Node node = first;
		while (node != null) {
			System.out.println("node:" + node);
			System.out.println("data:" + node.data);
			node = node.next;
		}
	}

}
