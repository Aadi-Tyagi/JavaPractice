package Week2;

abstract class Shape7 {
    abstract double calculateArea();

    abstract double calculatePerimeter();
}

class Circle7 extends Shape7 {
    private double radius;

    public Circle7(double radius) {
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

class Rectangle7 extends Shape7 {
    private double length, width;

    public Rectangle7(double length, double width) {
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

class Triangle7 extends Shape7 {
    private double side1, side2, side3;

    public Triangle7(double side1, double side2, double side3) {
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

public class Challenge7 {
    public static void main(String[] args){
        Circle7 circle = new Circle7(5);
        Rectangle7 rectangle  = new Rectangle7(4,6);

        System.out.println("Circle\nArea: " + circle.calculateArea() + ", Perimeter: " + circle.calculatePerimeter());
        System.out.println("\nRectangle\nArea: " + rectangle.calculateArea() + ", Perimeter: " + rectangle.calculatePerimeter());

    }
}

