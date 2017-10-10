package com.datastructure.sort;

//冒泡
public class BubbSort {
	public static void main(String[] args) {
		int [] x = {1,99,33,44,55,22,122,11,45,98,15,16};
		sortFromEnd(x);
		sort(x);
		SortUtil.traversal(x);
	}
	public static int[] sort(int [] array){
		int tem = 0;
		for(int k = 1; k < array.length; k++){
			for (int i = 0; i < k; i++) {
				System.out.println("第【k="+k+"】【i="+i+"】遍\n");
				if(array[k] < array[i]){
					System.out.println("for:第【k="+k+"】【i="+i+"】遍 :"+array[i]+" 和"+ array[i+1] + "交换\n");
					tem = array[k];
					array[k] = array[i];
					array[i] = tem;
				}
			}
		}
		return array;
	}
	public static int[] sortFromEnd(int [] array){
		int tem = 0;
		for(int k = array.length-1; k > 1 ; k--){
			for (int i = 0; i < k; i++) {
				System.out.println("第【k="+k+"】【i="+i+"】遍\n");
				if(array[k] < array[i]){
					System.out.println("for:第【k="+k+"】【i="+i+"】遍 :"+array[i]+" 和"+ array[i+1] + "交换\n");
					tem = array[k];
					array[k] = array[i];
					array[i] = tem;
				}
			}
		}
		return array;
	}
	
}
