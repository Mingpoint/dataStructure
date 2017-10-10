package com.datastructure.queueAndstack.queue;

public class TestMyQueue {
	public static void main(String[] args) {
		MyQueue qu = new MyQueue(5);
		qu.put(4);
		qu.put(3);
		qu.put(6);
		qu.put(8);
		qu.put(1);
		System.out.println("qu:"+qu.peek());
		Object delete1 = qu.delete();
		System.out.println("delete1:"+delete1);
		qu.put(2);
		System.out.println("qu:"+qu.peek());
		MyQueue qus = new MyQueue(5);
		qus = qu;
		System.out.println("===display start===");
		qu.displayQueue(qus);
	}

}
