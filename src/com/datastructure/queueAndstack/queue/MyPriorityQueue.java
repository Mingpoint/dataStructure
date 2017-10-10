package com.datastructure.queueAndstack.queue;

public class MyPriorityQueue {
	
	private int max;
	private int[] array;
	private int num;
	
	public MyPriorityQueue(int max){
		this.max = max;
		array = new int[max];
		num = 0;
	}
	public void put(int x){
		int j= 0;
		if(num == 0){
			array[num] = x;
			num++;
		}else{
			for (j = num -1;j >= 0 ; j--) {
				if(x > array[j]){
					array[j+1] = array[j];
				}else{
					break;
				}
			}
			array[j+1] = x;
		}
		
	}
	public void delete(){
		
	}
	public int peekMin(){
		return array[num - 1];
	}
	public boolean isEmpty(){
		return num == 0;
	}
	public boolean isFull(){
		return num == max;
	}
}
