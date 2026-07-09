package com.cognizant.library;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class app{
    public static void main(String[] args){
        ApplicationContext c=new ClassPathXmlApplicationContext("applicationContext.xml");
        bookservice b=c.getBean("bookService",bookservice.class);
        b.printAllBooks();
    }
}