package com.cognizant.designpatterns;

import java.util.ArrayList;
import java.util.List;

public interface obs{
    void update(String msg);
}
class email implements obs{
    public void update(String msg){
        System.out.println("email: "+msg);
    }
}
class sms implements obs{
    public void update(String msg){
        System.out.println("sms: "+msg);
    }
}
class push implements obs{
    public void update(String msg){
        System.out.println("push: "+msg);
    }
}
class notify{
    private List<obs> list=new ArrayList<>();
    public void add(obs o){
        list.add(o);
    }
    public void remove(obs o){
        list.remove(o);
    }
    public void send(String msg){
        for(obs o:list){
            o.update(msg);
        }
    }
}
class test{
    public static void main(String[] args){
        notify n=new notify();
        n.add(new email());
        n.add(new sms());
        n.add(new push());
        n.send("new order received!");
    }
}