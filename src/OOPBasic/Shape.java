package OOPBasic;

public abstract class Shape {
    private String color;
    private boolean filled;

    public Shape() {
        color = "red";
        filled = true;
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    // Getters ******************************************************
    public boolean isFilled() {
        return filled;
    }
    public String getColor() {
        return color;
    } 
    public boolean getFilled() {
        return filled;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    public abstract double getRadius();

    // Setters ******************************************************
    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }




    // To String ****************************************************
    public String toString() {
        return "Color= " + color + ", Filled= " + filled;
    }

}