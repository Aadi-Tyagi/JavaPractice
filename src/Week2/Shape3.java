package Week2;

import java.util.Scanner;

class Shape3 {
    double calculateArea() {
        return 0.0;
    }

    double calculatePerimeter() {
        return 0.0;
    }
}

class Circle extends Shape3 {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

}

class Rectangle extends Shape3 {
    private double length, width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double calculateArea() {
        return length * width;
    }

    @Override
    double calculatePerimeter() {
        return 2 * (length + width);
    }

}

class Triangle extends Shape3 {
    private double side1, side2, side3;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    double calculateArea() {
        double S = (side1 + side2 + side3) / 2;

        return Math.sqrt(S * ((S - side1) * (S - side2) * (S - side3)));
    }

    @Override
    double calculatePerimeter() {
        return side1 + side2 + side3;
    }

}
