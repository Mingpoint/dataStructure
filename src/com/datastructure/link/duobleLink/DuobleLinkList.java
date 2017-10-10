package com.datastructure.link.duobleLink;

/**
 * 双向链表
 * @author Mingpoint
 * @date 2017年9月18日 下午1:47:03 
 *
 */
public class DuobleLinkList {
	public Node first;
	public Node last;
	public DuobleLinkList(){
		first = null;
		last = null;
	}
	
	public void addFirst(Object obj){
		Node node = new Node(obj);
		node.next = first;
		if(null != first){
			first.pre = node;
		}else{
			last = node;
		}
		node.next = first;
		first = node;
	}
	public void addLast(Object obj){
		Node node = new Node(obj);
		if(first == null){
			first = node;
		}else{
			last.next = node;
			node.pre = last;
		}
		last = node;
	}
	public Node removeFirst(){
		Node removeNode = first;
		if(first.next == null){
			last = null;
		}else{
			first.next.pre = null;
		}
		first = first.next;
		return removeNode;
	}
	public Node removeLast(){
		Node removeNode = last;
		if(first.next == null){
			first = null;
		}else{
			last.pre.next = null;
		}
		last = last.pre ; 
		return removeNode;
	}
	public void addAfterObj(Object after,Object value){
		Node node = new Node(value);
		Node current = first;
		while(current.data != after){
			current = current.next;
			if(current == null){
				System.out.println(after + " 不存在");
				return;
			}
		}
		if(current.equals(last)){
			node.next = null;
			last = node;
		}else{
			node.next = current.next;  
		}
		current.next = node;
		node.pre = current;
	}
	
	
	public boolean isEmpty(){
		return first == null;
	}
	public void display(){
		Node current = first;
		while(null != current){
			System.out.println("current.data:"+current.data);
			System.out.println("next.data:"+(current.next == null ? "null" : current.next.data));
			System.out.println("before.data:"+(current.pre == null ? "null" : current.pre.data));
			current = current.next;
			System.out.println("----------------------------------");
		}
	}

}
