package com.datastructure.simulation;

/**
 * Created by Administrator on 2017/10/9.
 */
public class Params {
    private int n;
    private int adress;

    public Params(){

    }
    public Params(int nn,int ad){
        this.n =  nn;
        this.adress = ad;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int getAdress() {
        return adress;
    }

    public void setAdress(int adress) {
        this.adress = adress;
    }
}
