package com.datastructure.link;

/**
 * 尾插法
 * @author Mingpoint
 * @date 2017年9月13日 下午2:27:24 
 *
 */
public class TailLinkList {
	private Node tail;
	public TailLinkList(){
		tail = null;
	}
	public boolean isEmpty(){
		return tail == null;
	}
	public Node add(Node head,Object obj){
		Node node = new Node(obj);
		if(isEmpty()){
			node.next = tail;
			tail = node;
			head = node;
			return head;
		}
		
		while(tail.next != null){
			tail = tail.next;
		}
		node.next = tail.next;
		tail.next = node;
		tail = node;
		return head;
		
	}
	public Node delete(Node head){
		Node node =  null;
		if(!this.isEmpty()){
			node = head;
			head = head.next;
		}
		return node;
	}
	public void displayLinkList(Node head){
		Node node = head;
		while(node != null){
			System.out.println("node:"+node);
			System.out.println("data:"+node.data);
			node = node.next;
		}
	}

}
