package com.datastructure.recursion;

public class TriangleNumber {
//	1	3	6	10	15	21。。。
//	fn = fn(n-1) + n;
	
	
	public static void main(String[] args) {
		int findNumber = FindNumber(3);
		System.out.println(findNumber);
//		try {
//			Thread.sleep(Integer.MAX_VALUE);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}
	
	public static int FindNumber(int n){
		if(n == 1){
			return 1;
		}
		return FindNumber(n-1)+n;
	}
}
