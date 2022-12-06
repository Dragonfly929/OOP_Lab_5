public class Ellipse extends Point implements Shape{
    private double a;
    private double b;

    public Ellipse(double a, double b) {
        super(geometryObject.ELLIPSE, x,y);
        this.a = a;
        this.b = b;
    }

    public double getA() { return a; }
    public double getB() { return b; }


    public void setA(double a) { this.a = a; }
    public void setB(double b) { this.b = b; }

    public String getCircle() {
        if (a == b) {
            return "Circle";
        } else if (a == 0 && b != 0 || a != 0 && b == 0){
            return "Line";
        } else if (a == 0) {
            return "Point";
        } else {
            return "Ellipse";
        }

    }

    @Override
    public double getArea() {
        if (a == b) {
            System.out.println("Circle's Area for radius equal to " + a);
            return Math.PI * a * b;
        } else if (a != 0 && b != 0){
            System.out.print("Ellipse's Area for a = " + a + " b = " + b + ": ");
            return Math.PI * a * b;
        }
        return 0;
    }
    public double getPerimeter() {
        if (a == b) {
            System.out.println("Circle's Perimeter with radius" + a);
            return Math.PI * 2 * a;
        } else {
            System.out.println("Ellipse's Perimeter simple approximation: " + 2*Math.PI*Math.sqrt((a*a+b*b)/2));
            System.out.print("Ellipse's Perimeter computed with Ramanujan approximation: ");
            double h = (Math.pow((a-b), 2)/Math.pow((a+b), 2));
            return Math.PI * (a+b) * (1 + ((3*h) / (10+Math.sqrt(4-3*h))));
        }
    }

    public void getDiameter() {
        if (a > b) {
            System.out.println("Major axis diameter: " + 2*a +
                    "\nMinor axis diameter: " + 2*b);
        } else if(a < b) {
            System.out.println("Major axis diameter: " + 2*b +
                    "\nMinor axis diameter: " + 2*a);
        } else {
                System.out.println("Circle with diameter:" + 2*a);
        }
    }

    @Override
    void draw() {

    }

    @Override
    void display(geometryObject shape) {
        System.out.println(getPerimeter());
        System.out.println(getArea());
        getDiameter();

    }


}
