package com.datastructure.search;

import java.util.Scanner;

//二分查找
public class BinarySearch {
	
	public static void main(String[] args) {
		int [] x = {1,5,6,8,10,21,66,77,88,99};
		Scanner sc = new Scanner(System.in);
		while(true){
			int y = sc.nextInt();
			if(0 == y) break;
			binarySearch(x, y, x.length);
		}
	}
	//递归实现
	public static int binarySearchRecursion(int[] array,int query,int length){
		return length;
	}
//	非递归实现
	public static void  binarySearch(int[] array,int query,int length){
		int start = 0;
		int end =length;
		int mid = length/2;
		while(true){
			mid = (end+start)/2;
			if(query > array[mid]){
				start = mid+1;
			}else if(query < array[mid]){
				end = mid;
			}else{
				System.out.println("下标:"+mid);
				break;
			}
		}
	}
	
}
