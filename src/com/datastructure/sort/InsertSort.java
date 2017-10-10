package com.datastructure.sort;

//插入排序
public class InsertSort {
	public static void main(String[] args) {
		int x[] = {12,21,55,11,66,144,10,11,55,88,13};
//		int x[] = {12,21,11,55,66,144,10,11,55,88,13};
//		int x[] = {12,11,21,55,66,144,10,11,55,88,13};
//		sort(x);
		sortByWhile(x);
		SortUtil.traversal(x);
	}
	public static int [] sort(int [] array){
		for (int i = 1; i < array.length; i++) {
			int tem = array[i];
			if(array[i-1] > array[i]){
				for (int j = i-1; j >= 0;j--) {
					int tems = 0;
					if(array[j] > tem){
						tems = array[j];
						array[j] = array[j+1];
						array[j+1] = tems;
					}
				}
			}
		}
		return array;
	}
	public static void sortByWhile(int [] array){
		for (int i = 1; i < array.length; i++) {
			int tem = array[i];
			int k = i;
			while(k > 0 && array[k-1] < tem ){
				array[k] = array[k-1];
				k--;
			}
			array[k] = tem;
		}
	}
}
