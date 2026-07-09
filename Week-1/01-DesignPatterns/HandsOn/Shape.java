package com.cognizant.designpatterns;

public interface shape{
    void draw();
}

class circle implements shape{
    public void draw(){
        System.out.println("drawing circle");
    }
}

class rect implements shape{
    public void draw(){
        System.out.println("drawing rectangle");
    }
}

class tri implements shape{
    public void draw(){
        System.out.println("drawing triangle");
    }
}

class factory{
    public static shape get(String s){
        if(s==null)
            return null;
        if(s.equalsIgnoreCase("circle"))
            return new circle();
        if(s.equalsIgnoreCase("rectangle"))
            return new rect();
        if(s.equalsIgnoreCase("triangle"))
            return new tri();
        return null;
    }
}

class test{
    public static void main(String[] args){
        shape s1=factory.get("circle");
        s1.draw();

        shape s2=factory.get("rectangle");
        s2.draw();

        shape s3=factory.get("triangle");
        s3.draw();
    }
}