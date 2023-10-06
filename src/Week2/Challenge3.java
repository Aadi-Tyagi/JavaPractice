package Week2;

import java.util.Scanner;

public class Challenge3 {
    public static void main(String[] args){
        Circle circle = new Circle(5);
        Rectangle rectangle  = new Rectangle(4,6);

        System.out.println("Circle\nArea: " + circle.calculateArea() + ", Perimeter: " + circle.calculatePerimeter());
        System.out.println("\nRectangle\nArea: " + rectangle.calculateArea() + ", Perimeter: " + rectangle.calculatePerimeter());

    }
}
