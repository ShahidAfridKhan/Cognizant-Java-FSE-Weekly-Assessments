package com.cognizant.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class log{

    private static final Logger l=LoggerFactory.getLogger(log.class);

    public static void main(String[] args){
        l.trace("start");
        l.debug("debug");
        l.info("running");
        l.warn("warning");
        l.error("error",new Exception("sample"));
    }

    public static void user(String name,int age){
        l.debug("user {} age {}",name,age);
        l.info("login {} {}",name,System.currentTimeMillis());
    }

    public static void action(String user,String act,boolean ok){
        if(ok)
            l.info("{} {}",user,act);
        else
            l.warn("{} {}",user,act);
    }
}