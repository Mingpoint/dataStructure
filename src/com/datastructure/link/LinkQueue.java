package com.datastructure.link;

/**
 * 链表实现队列
 * @author Mingpoint
 * @date 2017年9月13日 下午5:05:14 
 *
 */
public class LinkQueue {
	private DeLinkList deLinkList = null;
	
	public LinkQueue(){
		deLinkList = new DeLinkList();
	}
	
	public boolean push(Object obj){
		return deLinkList.add(obj);
	}
	
	public Node pop(){
		return deLinkList.deleteLast();
	}
	
	public boolean isEmpty(){
		return deLinkList.isEmpty();
	}
	public void display(){
		deLinkList.displayLinkList();
	}
}
