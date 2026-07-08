package com.cognizant.designpatterns;

/**
 * Factory Pattern
 * Creates objects without specifying their exact classes
 * Decouples object creation from usage
 */
public interface Shape {
    void draw();
}

class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing Circle");
    }
}

class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing Rectangle");
    }
}

class Triangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing Triangle");
    }
}

// Factory Class
class ShapeFactory {
    public static Shape createShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        
        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("TRIANGLE")) {
            return new Triangle();
        }
        return null;
    }
}

// Test
class FactoryTest {
    public static void main(String[] args) {
        Shape circle = ShapeFactory.createShape("CIRCLE");
        circle.draw();
        
        Shape rectangle = ShapeFactory.createShape("RECTANGLE");
        rectangle.draw();
        
        Shape triangle = ShapeFactory.createShape("TRIANGLE");
        triangle.draw();
    }
}
