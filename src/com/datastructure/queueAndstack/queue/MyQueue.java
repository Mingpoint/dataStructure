package com.datastructure.queueAndstack.queue;

public class MyQueue {
	private int top;
	private int end;
	private Object [] object;
	private int length;
	private int num;
	
	public MyQueue(){
	}
	public MyQueue(int max){
		object = new Object[max];
		top = 0;
		end = -1;
		length = max;
	}
	public void put(Object obj){
		if(isFull()){
			System.out.println("队列已满！");
			return;
		}
		if(end == length-1){
			end = 0;
		}else{
			end++;
		}
		object[end] = obj;
		num++;

	}
	public Object delete(){
		if(isEmpty()){
			System.out.println("队列已空，不能删除");
			return null;
		}
		Object o = object[top];
		object[top] = null;
		if(top == length-1){
			top = 0;
		}else{
			top ++;
		}
		num--;
		return o;
	}
	public Object peek(){
		return object[top];
	}
	public boolean isFull(){
		return num == length;
	}
	public boolean isEmpty(){
		return num == 0;
	}
	public int size(){
		return num;
	}
	public void displayQueue(MyQueue myQueue){
		while(!myQueue.isEmpty()){
			System.out.println(myQueue.delete());
		}
	}
}
