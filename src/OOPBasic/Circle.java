package OOPBasic;
/**
 * practicing OOP basics
 */


public class Circle extends Shape{
    private double radius;
    private String color;
    private Boolean filled;
 

    // Constructors  ************************************************
    public Circle() {
        radius = 1.0;
        color = "red";
    }

    // overloading constructor
    public Circle(double  radius) {
        // this refers to the global variable not the methods param
        this.radius = radius;
        color = "red";
    }

    public Circle (double radius, String color, boolean filled) {
        this.radius = radius;
        this.color = color;
        this.filled = filled;

    }

    // Getters ******************************************************
    public double getRadius() {
        return radius;
    }
    
    // overriding abstract class in shape class
    @Override
    public double getArea() {
        return radius*radius*Math.PI;
    }

    public String getColor() {
        return color;
    }

    // overriding abstract class in shape class
    @Override
    public double getPerimeter() {
        return 2*Math.PI*radius;
    }



    // Setters ******************************************************
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }


    // **************************************************************
    // Every well done class should contain a toString method
    public String toString() {
        return "Circle[radius= " + radius + " Color= " + color + "]";
    }

    
}
