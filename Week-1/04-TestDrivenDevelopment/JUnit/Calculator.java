package com.cognizant.testing;

public class calc{

    public int add(int a,int b){
        return a+b;
    }

    public int sub(int a,int b){
        return a-b;
    }

    public int mul(int a,int b){
        return a*b;
    }

    public double div(int a,int b){
        if(b==0)
            throw new IllegalArgumentException("zero not allowed");
        return (double)a/b;
    }

    public boolean pos(int n){
        return n>0;
    }

    public boolean even(int n){
        return n%2==0;
    }
}