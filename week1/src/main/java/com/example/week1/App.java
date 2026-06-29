package com.example.week1;

public class App {
    public static void main(String[] args) {
        LoggerSingleton logger = LoggerSingleton.getInstance();
        logger.log("start app");
        Shape circle = ShapeFactory.createShape("circle");
        System.out.println(circle.draw());
        Shape square = ShapeFactory.createShape("square");
        System.out.println(square.draw());
        logger.log("end app");
    }
}
