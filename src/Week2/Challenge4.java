package Week2;

interface Drawable{
    void draw();
}

class Circles implements Drawable{

    public void draw(){
        System.out.println("Drawing a circle");
    }
}

class Rectangles implements Drawable{

    public void draw(){
        System.out.println("Drawing a Rectangle");
    }
}

class Triangles implements Drawable{

    public void draw(){
        System.out.println("Drawing a Triangle");
    }
}

public class Challenge4 {
    public static void main(String[] args){

        Circles circle = new Circles();
        circle.draw();

        Rectangles rectangle = new Rectangles();
        rectangle.draw();

        Triangles triangle = new Triangles();
        triangle.draw();
    }
}
