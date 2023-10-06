package Week2;

import java.util.Scanner;

public class Shape {
    private String shapeName;
    private String shapeColour;

    public Shape(){
        this.shapeName = null;
        this.shapeColour = null;
    }

    public Shape(String shapeName, String shapeColour){
        this.shapeName = shapeName;
        this.shapeColour = shapeColour;
    }

    public String getShapeColour() {
        return shapeColour;
    }

    public void setShapeColour(String shapeColour) {
        this.shapeColour = shapeColour;
    }

    public String getShapeName() {
        return shapeName;
    }

    public void setShapeName(String shapeName) {
        this.shapeName = shapeName;
    }

    public static void main(String[] args){
        Shape Shape1 = new Shape();


        Shape1.setShapeName("Circle");
        Shape1.setShapeColour("Red");

        System.out.println("Shape 1 name is: "+Shape1.getShapeName());
        System.out.println("Shape 1 colour is: "+Shape1.getShapeColour());

        Scanner scan = new Scanner(System.in);

        System.out.println("\nEnter name of Second Shape");
        String shapeName = scan.nextLine();

        System.out.println("Enter colour of Second Shape");
        String shapeColour = scan.nextLine();

        Shape Shape2 = new Shape(shapeName,shapeColour);

        System.out.println("\nShape 2 name is: "+Shape2.getShapeName());
        System.out.println("Shape 2 colour is: "+Shape2.getShapeColour());

    }
}
