package com.datastructure.queueAndstack.stack;

public class StackX {
	private int maxSize;
	private int top;
	private int[] array;
	public StackX(int max){
		maxSize = max;
		top = -1;
		array = new int[maxSize];
	}
	
	public boolean push(int x){
		if(isFull()){
			System.out.println("栈已满！");
			return false;
		}
		top ++;
		array[top] = x;
		return true;
	}
	public int pop(){
		if(isEmpty()){
			System.out.println("空栈！");
			return -1;
		}
		int x = array[top];
		top --;
		return x;
	}
	public int peek(){
		return array[top];
	}
	public boolean isEmpty(){
		return top == -1;
		
	}
	public boolean isFull(){
		return top == maxSize-1;
	}
}
