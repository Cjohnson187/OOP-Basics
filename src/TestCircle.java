import OOPBasic.Circle;
import OOPBasic.Shape;



public class TestCircle {
    //Testing circle class
    public static void main(String[] args) {
        Circle circ = new Circle();
        System.out.println("The circle has a radius of " + circ.getRadius() + " and an area of " + circ.getArea());

        Circle circ2 = new Circle(2.0);
        System.out.println("The circle has a radius of " + circ2.getRadius() + " and an area of " + circ2.getArea());

        System.out.println( circ2.toString() );
        System.out.println( circ2 );

        // upcast to shape
        Shape s1 = new Circle(5.5, "red", false);
        System.out.println(s1);                    
        System.out.println(s1.getArea());         
        System.out.println(s1.getPerimeter()); 
        System.out.println(s1.getColor());
        System.out.println(s1.isFilled());
        System.out.println(s1.getRadius());

        // downcast to circle
        Circle c1 = (Circle)s1;
        System.out.println(c1);                    
        System.out.println(c1.getArea());         
        System.out.println(c1.getPerimeter()); 
        System.out.println(c1.getColor());
        System.out.println(c1.isFilled());
        System.out.println(c1.getRadius());

        //TODO try building squre class to attempt polymorphism with shape class.

    }
    
}