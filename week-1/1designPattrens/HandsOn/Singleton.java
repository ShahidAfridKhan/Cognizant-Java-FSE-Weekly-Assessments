package com.cognizant.designpatterns;

public class single{
    private static single obj=new single();

    private single(){
        System.out.println("object created");
    }

    public static single get(){
        return obj;
    }

    public void log(String msg){
        System.out.println(msg);
    }
}

class test{
    public static void main(String[] args){
        single s1=single.get();
        single s2=single.get();

        s1.log("hello");
        System.out.println(s1==s2);
    }
}