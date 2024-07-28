package DesignPattern.CreationalDesignPatterns.FactoryMethodPattern;

// Product interface
interface Shape {
    void draw();
}

// Concrete Products
class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Circle.");
    }
}

class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle.");
    }
}

// Creator interface
abstract class ShapeFactory {
    public abstract Shape createShape();
}

// Concrete Creators
class CircleFactory extends ShapeFactory {
    @Override
    public Shape createShape() {
        return new Circle();
    }
}

class RectangleFactory extends ShapeFactory {
    @Override
    public Shape createShape() {
        return new Rectangle();
    }
}

// Usage example
public class ShapeFactoryApp {
    public static void main(String[] args) {
        ShapeFactory circleFactory = new CircleFactory();
        Shape circle = circleFactory.createShape();
        circle.draw();

        ShapeFactory rectangleFactory = new RectangleFactory();
        Shape rectangle = rectangleFactory.createShape();
        rectangle.draw();
    }
}