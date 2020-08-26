package OOPBasic;

// class to test out composition instead of inheritence
// the new cylinder class is composed of a base circle and height
public class CompCyl {
    private Circle base;
    private double height;

    public CompCyl() {
        base = new Circle();
        height = 1.0;
    }

    
}