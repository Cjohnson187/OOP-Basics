import OOPBasic.Cylinder;

public class TestCylinder {
    public static void main(String[] args) {
        Cylinder c1 = new Cylinder();
        System.out.println(c1.getRadius());

        Cylinder c2 = new Cylinder(2.0);
        System.out.println("c2-- " + c2);

        Cylinder c3 = new Cylinder(4, 2, "blue");
        System.out.println("c3-- " + c3.toString());


    }
}