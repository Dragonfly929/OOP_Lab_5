import java.util.Arrays;
import java.util.Random;

public class TriangleCoordinates extends Polygon implements Shape, Drawable{
    private final double x2;
    private final double y2;

    public TriangleCoordinates(double x1, double y1, double x2, double y2) {
        Point.x = x;
        Point.y = y;
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = 0;
    }

    public TriangleCoordinates(double x, double y, double x1, double y1, double x2, double y2) {
        Point.x = x;
        Point.y = y;
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }
    public double getSideAB() {
        return Math.sqrt(Math.pow(((x1)-(x)),2) + Math.pow(((y1)-(y)),2));
    }

    public double getSideBC() {
        return Math.sqrt(Math.pow(((x2)-(x1)),2) + Math.pow(((y2)-(y1)),2));
    }

    public double getSideAC() { return Math.sqrt(Math.pow(((x)-(x2)),2) + Math.pow(((y)-(y2)),2)); }


    public boolean checkTriangle() {
        double a = x * (y1 - y2) +
                   x1 * (y2 - y) +
                   x2 * (y - y1);
        return a != 0;
    }

    @Override
    public String getShape() {
        String shape;
        shape = Arrays.toString(geometryObject.values());
        return shape = String.valueOf(geometryObject.TRIANGLE);
    }
    @Override
    public double getPerimeter() {
        System.out.print("Triangle's Perimeter: ");
        double A = getSideAB(), B = getSideBC(), C = getSideAC();
        return (A + B + C);
    }

    @Override
    public double getArea() {
        System.out.print("Triangle's Area: ");
        double perimeter = getSideAB() + getSideBC() + getSideAC();
        double s = (perimeter * 0.5);
        double A = getSideAB(), B = getSideBC(), C = getSideAC();
        return Math.sqrt(s * (s - A) * (s - B) * (s - C));
    }

    @Override
    public boolean isErased() {
        Random random = new Random();
        boolean delete = random.nextBoolean();
        System.out.print(geometryObject.TRIANGLE + " with location (" + x +", " + y + ") has been erased? ");
        return delete;
    }


    @Override
    public void display(geometryObject object) {
        System.out.println("The coordinates given from a triangle? " + checkTriangle());
        if (checkTriangle()){
            System.out.println(getPerimeter());
            System.out.println(getArea());
            System.out.println(chooseLineType());
            System.out.println(chooseLineWeight());
            System.out.println(erase(geometryObject.TRIANGLE));
        }
    }

    @Override
    public boolean erase(geometryObject object) {
        Random random = new Random();
        boolean delete = random.nextBoolean();
        System.out.print(geometryObject.TRIANGLE + " with location (" + getX() +", " + getY() + ") has been erased? ");
        return delete;
    }
}
