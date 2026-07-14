package com.cognizant.designpatterns;

import java.util.ArrayList;
import java.util.List;

interface Obs {
    void update(String msg);
}

class Email implements Obs {
    public void update(String msg) {
        System.out.println("Email: " + msg);
    }
}

class Sms implements Obs {
    public void update(String msg) {
        System.out.println("SMS: " + msg);
    }
}

class Push implements Obs {
    public void update(String msg) {
        System.out.println("Push: " + msg);
    }
}

class Notify {
    List<Obs> ls = new ArrayList<>();

    void add(Obs o) {
        ls.add(o);
    }

    void remove(Obs o) {
        ls.remove(o);
    }

    void send(String msg) {
        for (Obs o : ls) {
            o.update(msg);
        }
    }
}

public class Test {
    public static void main(String[] args) {

        Notify n = new Notify();
        Email e = new Email();
        Sms s = new Sms();
        Push p = new Push();
        n.add(e);
        n.add(s);
        n.add(p);
        n.send("New order received!");
    }
}