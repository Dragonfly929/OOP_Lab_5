import java.util.Arrays;
import java.util.Objects;
import java.util.Random;

public class TriangleSides extends Line implements Shape, Drawable{
    private double a;
    private double b;
    private double c;

    public TriangleSides(double a, double b, double c) {
        super();
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public TriangleSides(double x, double y, double a, double b, double c) {
        super();
        Point.x = x;
        Point.y = y;
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() { return a; }
    public void setA(double a) { this.a = a; }

    public double getB() { return b; }
    public void setB(double b) { this.b = b; }

    public double getC() { return c; }
    public void setC(double c) { this.c = c; }

    public String isTriangle() {
        if ((a+b) > c && (a+c) > b && (b+c) > a) {
            return "Triangle";
        } else if (a+b == c || a+c == b || b+c == a) {
            return "Degenerate triangle/ Segment";
        } else {
            return "Not Triangle";
        }
    }

    @Override
    public String getShape() {
        String shape;
        shape = Arrays.toString(geometryObject.values());
        return shape = String.valueOf(geometryObject.TRIANGLE);
    }

    @Override
    public double getArea() {
        System.out.print("Triangle's Area: ");
        double p = getPerimeter() / 2;
        return Math.sqrt(p * ((p - a) * (p - b) * (p - c)));
    }

    @Override
    public double getPerimeter() {
        System.out.print("Triangle's Perimeter: ");
        return a+b+c;
    }

    public String typeTriangle() // function to calculate the type of triangle
    {
        if (a == b && b == c)
            return "Equilateral";
        else if (a == b || b == c || a == c)
            return "Isosceles";
        else
            return "Scalene";
    }

    public String triangleAngle() {
        double x = a * a;
        double y = b * b;
        double z = c * c;
        if(a>b && a>c) // largest side is 'a'
        {
            if(x == y + z)
                return "Right-angled";
            else if(x < y + z)
                return "Acute-angled";
            else
                return "Obtuse-angled";

        }
        else if(b>a && b>c) // largest side is 'b'
        {
            if(y == x + z)
                return "Right-angled";
            else if(y < x + z)
                return "Acute-angled";
            else
                return "Obtuse-angled";
        }
        else // largest side is 'c'
        {
            if(z == x + y)
                return "Right-angled";
            else if(z < x + y)
                return "Acute-angled";
            else
                return "Obtuse-angled";
        }
    }

    @Override
    public void display(geometryObject object) {
        System.out.println("The segments given form: " + isTriangle());
        if (Objects.equals(isTriangle(), "Triangle")) {
            System.out.println("Triangle's Position: (" + getX() + ", " + getY() + ")");
            System.out.println(getArea());
            System.out.println(getPerimeter());
            setColor("RED");
            System.out.println("Triangle's color is " + getColor());
            System.out.println("Triangle type by angle: " + triangleAngle());
            System.out.println("Triangle type by sides: " + typeTriangle());
            System.out.println(chooseLineType());
            System.out.println(chooseLineWeight());
            System.out.println(erase(geometryObject.TRIANGLE));
        }
    }

    @Override
    public boolean erase(geometryObject object) {
        Random random = new Random();
        boolean delete = random.nextBoolean();
        System.out.print(geometryObject.TRIANGLE + " with location (" + x +", " + y + ") has been erased? ");
        return delete;
    }

}
