import p1.Shape.*;

public class Main {
    public static void main(String[] args) {
        Circle c = new Circle(6);
        System.out.println("Area of Circle = " + c.calculateArea());

        Rectangle r = new Rectangle(7, 6);
        System.out.println("Area of Rectangle = " + r.calculateArea());

        Triangle t = new Triangle(6, 5);
        System.out.println("Area of Triangle = "+ t.calculateArea());
    }
}