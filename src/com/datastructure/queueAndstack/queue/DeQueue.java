package com.datastructure.queueAndstack.queue;

public class DeQueue {
	int right;
	int left;
	int num = 0;
	Object[] obj;
	
	public DeQueue(int size){
		right = 0;
		left = -1;
		obj = new Object[size];
	}
	public boolean leftPush(Object ob){
		if(this.isFull()){
			System.out.println("队列已满！");
			return false;
		}
		if(left == -1 ){
			left = obj.length-1;
			obj[left--] = ob;
		}else if(left == 0){
			obj[left] = ob;
			left = obj.length-1;
		}
		return false;
		
	}
	public Object leftPop(){
		if(this.isEmpty()){
			System.out.println("队列为空！");
			return null;
		}
//		if(){
//			
//		}
		
		
		
		return right;
	}
	public boolean rightPush(){
		return false;
		
	}
	public Object rightPop(){
		if(this.isEmpty()){
			System.out.println("队列为空！");
			return null;
		}
		return right;
	}
	public boolean isEmpty(){
		return num == 0;
	}
	public boolean isFull(){
		return num == obj.length;
	}
}
