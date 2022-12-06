import java.util.Random;

public class Rectangle extends Polygon implements Shape, Drawable{
    private int length;
    private int width;

    public Rectangle(int length, int width) {
        super();
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }
    public int getWidth() {
        return width;
    }

    public void setLength(int width) {
        this.length = length;
    }
    public void setWidth(int width) {
        this.width = width;
    }


    @Override
    public double getArea() {
        return this.length * this.width;
    }

    public double getPerimeter() {
        // Calculate the 'perimeter' using the formula
        double perimeter = 2 * (length + width);

        if (length != width ) {
            System.out.println("The perimeter of the given rectangle with length = "
                + length + " and width = " + width + ": "
                + perimeter);
        } else {
            System.out.println("The perimeter of the square with side = "
                    + length + ": "
                    + perimeter);
        }
        return perimeter;
    }

    public void draw() {
        for (int i = 1; i <= width; i++) {
            for (int j = 1; j <= length; j++) {
                if (i == 1 || i == width || j == 1 || j == length)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    public String isSquare() {
        if (length == width) {
            return "Square";
        } else {
            return "Rectangle";
        }
    }

    @Override
    public void display(geometryObject object) {
        System.out.println(isSquare());
        if (isSquare().equals("Square")) {
            System.out.println("Side equal to " + length);
        } else {
            System.out.println("Width: " + this.length);
            System.out.println("Height: " + this.width);
        }
        System.out.println("Area: " +  getArea());
        System.out.println("Perimeter: " +  getPerimeter());
        draw();
    }

    @Override
    public boolean erase(geometryObject object) {
        Random random = new Random();
        boolean delete = random.nextBoolean();
        System.out.print(geometryObject.RECTANGLE + " with location (" + x +", " + y + ") has been erased? ");
        return delete;
    }
}