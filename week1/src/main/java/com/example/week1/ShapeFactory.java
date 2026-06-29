package com.example.week1;

public class ShapeFactory {
    public static Shape createShape(String type) {
        if ("circle".equalsIgnoreCase(type)) {
            return new Circle();
        }
        if ("square".equalsIgnoreCase(type)) {
            return new Square();
        }
        throw new IllegalArgumentException("unknown shape");
    }
}
