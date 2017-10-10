package com.datastructure.recursion;

/**
 * 二分查找，递归实现
 * @author Mingpoint
 * @date 2017年9月25日 下午3:28:10 
 *
 */
public class FindNumber {
	
	public static void main(String[] args) {
		int a[] = new int[]{1,3, 7, 8, 9,11,12,14,17,18};
		int find = find(a,0,a.length,9);
		System.out.println("find:"+find);
	}
	public static int find(int[] a,int low,int up,int key){
		int x = (low + up)/2;
		if(key == a[x]){
			return x;
		}else if(key < a[x]){
			up = x -1;
		}else{
			low = x+1;
		}
		return find(a, low, up, key);
	}
	
	
	
	
	
	

}
