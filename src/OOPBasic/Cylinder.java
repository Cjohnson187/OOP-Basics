package OOPBasic;

public class Cylinder extends Circle {
    private double height;
    private double radius;
    private String color;


    // default constructor
    public Cylinder() {
        super(); // calls super class since there are no arguments for the constructor
        height = 1.0;
    }

    // single arg
    public Cylinder(double height) {
        //super();
        radius = super.getRadius();
        color = super.getColor();
        this.height = height;
    }

    // double arg
    public Cylinder(double height, double radius) {
        this.height = height;
        this.radius = radius;
    }

    // tripple arg
    public Cylinder(double height, double radius, String color) {
        this.height = height;
        this.radius = radius;
        this.color = color;
    } 


    // getters ******************************************************
    public double getHeight() {
        return height;
    }
    public double getRadius() {
        return super.getRadius();
    }

    public double getVolume() {
        return getArea() * height;
    }
    

    // Setters ******************************************************
    public void setHeight (double height) {
        this.height = height;
    }

    // **************************************************************
    // overriding toSting in super class
    @Override
    public String toString() {
        //return super.toString() + ", height = " + height;
        return "radius= " + radius + " color= " + color + " height= " + height;
    }

}