import java.util.Arrays;
import java.util.Random;

public abstract class Point {
    private final geometryObject object;
    static double x;
    static double y;
    public Point(geometryObject object, double x, double y) {
        this.object = object;
        Point.x = x;
        Point.y = y;
    }

    public double getX() { return x; }
    public void setX(double x) { Point.x = x; }

    public double getY() { return y; }
    public void setY(double y) { Point.y = y; }

    // Method used to display X and Y coordinates of a point

    public String move(double x, double y) {
        Random random = new Random();
        int deltaX = random.nextInt(100);
        int deltaY = random.nextInt(100);
        return object + " with location: (" + x + ", " + y + ") moved to: (" + Double.sum(x, deltaX) + ", " + Double.sum(y, deltaY) + ')';
    }

    public boolean isErased() {
        Random random = new Random();
        boolean delete = random.nextBoolean();
        System.out.print(object + " with location (" + x +", " + y + ") has been erased? ");
        return delete;
    }

    public String getShape() {
        String object;
        object = Arrays.toString(geometryObject.values());
        return object;
    }
    static void displayPoint(double x, double y) {
        System.out.println("Point at location (" + x + ", " + y + ") in coordinate space");
    }

    // Abstract method
    abstract void draw();
    abstract void display(geometryObject object);

//    abstract void copy(geometryObject object);
//    abstract void offset(geometryObject object);
//    abstract void scale(geometryObject object);
//    abstract void mirror(geometryObject object);


}
