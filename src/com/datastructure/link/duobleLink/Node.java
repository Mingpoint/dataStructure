package com.datastructure.link.duobleLink;

public class Node {
	
	public Object data;
	public Node next;
	public Node pre;
	
	public Node(){
		
	}
	public Node(Object obj){
		this.data = obj;
		next = null;
		pre = null;
	}
}
