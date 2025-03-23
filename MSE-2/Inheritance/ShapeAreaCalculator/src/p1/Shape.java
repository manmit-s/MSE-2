package p1;

public abstract class Shape {
    public abstract double calculateArea();
    public static class Circle extends Shape{
        private double radius;

        public Circle(double radius){
            this.radius = radius;
        }

        public double calculateArea() {
            return Math.PI*Math.pow(radius, 2.0);
        }
    }
    public static class Rectangle extends Shape{
        private double length, breadth;
        public Rectangle(double length, double breadth){
            this.length = length;
            this.breadth = breadth;
        }

        public double calculateArea() {
            return length*breadth;
        }
    }
    public static class Triangle extends Shape{
        private double base, height;
        public Triangle(double base, double height){
            this.base = base;
            this.height = height;
        }
        
        public double calculateArea() {
            return 0.5*base*height;
        }
    }

}
