package com.datastructure.sort;
//选择排序
public class SelectSort {
	public static void main(String[] args) {
		int [] x = {666,22,88,33,44,22,99,11,100,55,44,77};
		sort(x);
		SortUtil.traversal(x);
	}
	public static int[] sort(int[] array){
		int tem = 0;
		int min;
		for (int i = 0; i < array.length-1; i++) {
			min = i;
			for (int j = i + 1; j < array.length; j++) {
				if(array[min] > array[j]) min = j;
			}
			tem = array[min];
			array[min] = array[i];
			array[i] = tem;
		}
		return array;
	}
}
