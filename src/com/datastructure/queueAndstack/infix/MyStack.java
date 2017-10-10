package com.datastructure.queueAndstack.infix;

public class MyStack {
	private int size;
	private int top;
	private char[] array;
	
	public MyStack(int size){
		this.size = size;
		top = -1;
		array = new char[size];
	}
	
	public boolean push(char ch){
		if(!isFull()){
			array[++top] = ch;
			return true;
		}
		return false;
	}
	public char pop(){
		if(!isEmpty()){
			char c = array[top];
			array[top] = 0;
			top--;
			return c;
		}
		return 0;
		
	}
	public boolean isEmpty(){
		return top == -1;
	}
	public boolean isFull(){
		return top == size-1;
	}
	public int peek(){
		if(!isEmpty()){
			return array[top];
		}
		return -1;
	}
	public void displayStack(String str){
		System.out.println(str);
		System.out.println("Stack (bottom --> top) : ");
		for (int i = 0; i < array.length; i++) {
			System.out.println(peek());
		}
	}
}
