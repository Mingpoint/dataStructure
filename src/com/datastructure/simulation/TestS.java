package com.datastructure.simulation;

import java.io.*;

/**
 * Created by Administrator on 2017/10/9.
 */
public class TestS {
    static int number;
    static int theAnswer;
    static StackX stackX;
    static StackX stackX1;
    static int codePart;
    static Params theseParam;

    public static void main(String[] args) {
        System.out.println("输入数字：");
        number = getInt();
        reTriangle();
        System.out.println("T:"+theAnswer);
    }
    public static void reTriangle(){
        stackX = new StackX(10000);
        stackX1 = new StackX(10000);
        codePart = 1;
        while (!step()){
            ;
        }
    }
    public static boolean step(){
        switch (codePart){
            case 1:
                theseParam = new Params(number,6);
                System.out.println("case 1 :"+" theAnswer="+theAnswer+"  Stack:"+"()");
                stackX.push(theseParam);
                codePart = 2;
                break;
            case 2:
                System.out.println("case 2 :"+" theAnswer="+theAnswer);
                simMeth();
                theseParam = stackX.peek();
                if(theseParam.getN() == 1){
                    theAnswer = 1;
                    codePart = 5;
                }else{
                    codePart = 3;
                }
                break;
            case 3:
                System.out.println("case 3 :"+" theAnswer="+theAnswer);
                simMeth();
                Params params = new Params(theseParam.getN() - 1, 4);
//                System.out.println("case 3 :"+" theAnswer="+theAnswer+"  Stack:"+"("+params.getN()+","+params.getAdress()+")");
                stackX.push(params);
                codePart = 2;
                break;
            case 4:
                System.out.println("case 4 :"+" theAnswer="+theAnswer);
                simMeth();
//                System.out.println("case 4 :"+" theAnswer="+theAnswer+"  Stack:"+"("+theseParam.getN()+","+theseParam.getAdress()+")");
                theseParam = stackX.peek();
                theAnswer = theAnswer + theseParam.getN();
                codePart = 5;
                break;
            case 5:
                System.out.println("case 5 :"+" theAnswer="+theAnswer);
                simMeth();
//                System.out.println("case 5 :"+" theAnswer="+theAnswer+"  Stack:"+"("+theseParam.getN()+","+theseParam.getAdress()+")");
                theseParam = stackX.peek();
                codePart = theseParam.getAdress();
                stackX.pop();
                break;
            case 6:
                return true;
        }
        return false;
    }

  public static int getInt(){
      InputStreamReader isr = new InputStreamReader(System.in);
      BufferedReader br = new BufferedReader(isr);
      int x = 1;
      try {
          String s = br.readLine();
          x = Integer.parseInt(s);
      } catch (IOException e) {
          e.printStackTrace();
      }
      return x;
  }
  public static void simMeth(){
      StackX stackX1 = stackX;
      while(!stackX1.isEmpty()){
          Params pop = stackX1.pop();
          System.out.println("  Stack:"+"("+pop.getN()+","+pop.getAdress()+")");
      }
  }
}
