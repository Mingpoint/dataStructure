package com.datastructure.simulation;

public class StackX {
	private int maxSize;
	private int top;
	private Params[] array;
	public StackX(int max){
		maxSize = max;
		top = -1;
		array = new Params[maxSize];
	}
	
	public boolean push(Params x){
		if(isFull()){
			System.out.println("栈已满！");
			return false;
		}
		top ++;
		array[top] = x;
		return true;
	}
	public Params pop(){
		if(isEmpty()){
			System.out.println("空栈！");
			return null;
		}
		Params x = array[top];
		top --;
		return x;
	}
	public Params peek(){
		return array[top];
	}
	public boolean isEmpty(){
		return top == -1;
		
	}
	public boolean isFull(){
		return top == maxSize-1;
	}
}
