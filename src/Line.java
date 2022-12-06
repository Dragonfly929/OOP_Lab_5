import java.util.Arrays;
import java.util.Random;

public class Line extends Point {
    protected double x1;
    protected double y1;
    private String color;
    private double[] lineWeight = {0.05, 0.09, 0.13, 0.2, 0.5, 1, 2};
    private final String[] lineType = {"DASHDOT", "DASHED", "DOT", "ZIGZAG"};

    public Line() {
        super(geometryObject.LINE, x, y);
        this.x1 = 5;
        this.y1 = 5;
    }

    public Line(double x, double y, double x1, double y1) {
        super(geometryObject.LINE, x,y);
        Point.x = x;
        Point.y = y;
        this.x1 = x1;
        this.y1 = y1;
    }

    public double getY1() { return y1; }
    public void setY1(double y1) { this.y1 = y1; }

    public double getX1() { return x1; }
    public void setX1(double x1) { this.x1 = x1; }

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }

    public double[] getLineWeight() { return lineWeight; }
    public void setLineWeight(double[] lineWeight) { this.lineWeight = lineWeight; }

    public String[] getLineType() { return lineType; }


    public String chooseLineType() {
        Random random = new Random();
        int randomIndex = random.nextInt(lineType.length);
        getShape();
        System.out.println("Line type: ");
        return switch (lineType[randomIndex]) {
            case "DASHDOT" -> lineType[randomIndex] + " _._._._._._._._._._._._._._._._._._._";
            case "DASHED" -> lineType[randomIndex] + " _____________________________________";
            case "DOT" -> lineType[randomIndex] + " .....................................";
            default -> lineType[randomIndex] + " ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^";
        };
    }

    public double chooseLineWeight() {
        Random random = new Random();
        int randomWeight = random.nextInt(lineWeight.length);
        System.out.print("Line's weight: ");
        return lineWeight[randomWeight];
    }

    public String lineLength() {
        double length = Math.sqrt(Math.pow(x1 - x, 2) +
                                  Math.pow(y1 - y, 2));
        return "Line's length is " + length;
    }

    public String printAngle() {
        double angleInDegrees = Math.atan2 (y1-y, x1-x) * 180.0 / Math.PI;
        return "Angle is " + angleInDegrees + " degrees";
    }

    public String lineType() {
        if (x == x1 && y != y1) {
            return "The Line is Vertical";
        } else if (x != x1 && y == y1) {
            return "The Line is Horizontal";
        } else if (x != x1 || y != y1) {
            return "The Line is Oblique";
        } else {
            return "The Points coincide or not straight line";
        }
    }

    @Override
    void draw() {
        System.out.println("Draw a " + geometryObject.LINE + " from x = " + x + " and y = " + y);
        System.out.println("              to x = " + x1 + " and y = " + y1 + "\n");
    }

    @Override
    public String getShape() {
        String shape;
        shape = Arrays.toString(geometryObject.values());
        return shape = String.valueOf(geometryObject.LINE);
    }

    @Override
    public void display(geometryObject shape) {
        getShape();
        draw();
        System.out.println(chooseLineType());
        System.out.println(chooseLineWeight());
        System.out.println(lineLength());
        System.out.println(printAngle());
        System.out.println(lineType());
        System.out.println(isErased());

    }
}
