package com.datastructure.queueAndstack.stack;

//单词逆序栈
public class StackX4Word {
	private int maxSize;
	private int top;
	private char[] array;
	public StackX4Word(int max){
		maxSize = max;
		top = -1;
		array = new char[maxSize];
	}
	
	public boolean push(char x){
		if(isFull()){
			System.out.println("栈已满！");
			return false;
		}
		top ++;
		array[top] = x;
		return true;
	}
	public char pop(){
		if(isEmpty()){
			System.out.println("空栈！");
			return '\u0000';
		}
		char x = array[top];
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
