package com.datastructure.link;

/**
 * 头插法
 * @author Mingpoint
 * @date 2017年9月13日 下午2:27:02 
 *
 */
public class HeadLinkList {
	private Node first;
	public HeadLinkList(){
		first = null;
	}
	public boolean isEmpty(){
		return first == null;
	}
	public boolean add(Object obj){
		Node node = new Node(obj);
		node.next = first;
		first = node;
		return true;
	}
	public Node findNode(Object obj){
		Node current = first;
		while(current != null){
			if(obj.equals(current.data)){
				break;
			}else{
				current = current.next;
			}
		}
		return current;
	}
	public Node delete(){
		Node node =  null;
		if(!this.isEmpty()){
			node = first;
			first = first.next;
		}
		return node;
	}
	public void displayLinkList(){
		Node node = first;
		while(node != null){
			System.out.println("node:"+node);
			System.out.println("data:"+node.data);
			node = node.next;
		}
	}

}
