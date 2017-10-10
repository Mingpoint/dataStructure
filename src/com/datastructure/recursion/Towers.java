package com.datastructure.recursion;

/**
 * 
 * 汉诺塔
 * @author Mingpoint
 * @date 2017年9月25日 下午5:21:20 
 *
 */
public class Towers {
	
	public static void main(String[] args) {
		handleTowers(6, 'A', 'B', 'C');
	}
	public static void handleTowers(int topN,char sourse,char inter,char destion){
		if(topN == 1){
			System.out.println("topN:1,sourse:"+sourse+",destion:"+destion);
		}else{
			handleTowers(topN-1,sourse, destion,inter);
			System.out.println("topN:"+topN+",sourse:"+sourse+",destion:"+destion);
			handleTowers(topN-1,inter,sourse,destion);
		}
		
	}

}
