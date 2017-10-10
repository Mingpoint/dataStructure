package com.datastructure.recursion;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/10/9.
 */
public class Power {

    public static void main(String[] args) {
        System.out.println("请输入x");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println("请输入y");
        int y = sc.nextInt();
        int back = back(x, y);
        System.out.println(back);
    }

    public static int back(int x, int y){
        while(y != 1){
            if(y%2 > 0){
                return back(x * x*x, y / 2);
            }else {
                return back(x * x, y / 2);
            }
        }
        return x;
    }
}
