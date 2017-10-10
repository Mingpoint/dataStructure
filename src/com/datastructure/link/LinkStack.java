package com.datastructure.link;

/**
 * 链表实现栈
 * @author Mingpoint
 * @date 2017年9月13日 下午3:57:28 
 *
 */
public class LinkStack {
	
	private HeadLinkList list = null;
	
	public LinkStack(){
		list = new HeadLinkList();
	}
	public LinkStack(Object obj){
		list = new HeadLinkList();
	}
	public boolean push(Object obj){
		return list.add(obj);
	}
	public Node pop(){
		return list.delete();
	}
	public boolean isEmpty(){
		return list.isEmpty();
	}
	public void displayStack(){
		list.displayLinkList();
	}
}
