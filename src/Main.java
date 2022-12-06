import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome!");
        Random random = new Random();
        int x = random.nextInt(10);
        int y = random.nextInt(10);
        int z = random.nextInt(10);
        int x1 = random.nextInt(1,10);
        int y1 = random.nextInt(1,10);
        int x2 = random.nextInt(1,10);
        int y2 = random.nextInt(1,10);
        int a = random.nextInt(20);
        int b = random.nextInt(20);
        int c = random.nextInt(20);
        int length = random.nextInt(15);
        int width = random.nextInt(20);
        int radius = random.nextInt(10);
        int height = random.nextInt(10);
        for (;;){
            for (geometryObject object : geometryObject.values()) {
                System.out.print("\n=========================================");
                int i = 0;
                while (i < object.toString().length()) {
                    System.out.print("=");
                    i++;
                }
                System.out.println();
                System.out.println("Design and drafting software Simulation: " + object);
                System.out.print("=========================================");
                int j = 0;
                while (j < object.toString().length()) {
                    System.out.print("=");
                    j++;
                }
                System.out.println("\nPosition Point: " + object.getPointPosition());

                switch (object) {
                    case POINT -> Point.displayPoint(x, y);
                    case LINE -> {
                        Line l = new Line(x, y, x1, y2);
                        l.display(geometryObject.LINE);
                    }
                    case POLYGON -> {
                        Polygon p = new Polygon();
                        p.display(geometryObject.POLYGON);
                    }
                    case TRIANGLE -> {
                        TriangleSides tsides = new TriangleSides(x, y, a, b, c);
                        tsides.display(geometryObject.TRIANGLE);
                        System.out.println();
                        TriangleCoordinates tcoord = new TriangleCoordinates(x, y, x1, y1, x2, y2);
                        tcoord.display(geometryObject.TRIANGLE);
                    }
                    case RECTANGLE -> {
                        Rectangle rect = new Rectangle(length, width);
                        Rectangle sq = new Rectangle(length, width);
                        rect.display(geometryObject.RECTANGLE);
                        System.out.println();
                        sq.display(geometryObject.RECTANGLE);
                    }
                    case CIRCLE -> {
                        Circle circle = new Circle(radius);
                        circle.display(geometryObject.CIRCLE);
                    }
                    case ELLIPSE -> {
                        Ellipse ellipse = new Ellipse(a, b);
                        ellipse.display(geometryObject.ELLIPSE);
                    }
                    case SPHERE -> {
                        Sphere sphere = new Sphere(x, y, z, radius);
                        sphere.display(geometryObject.SPHERE);
                    }
                    case CYLINDER -> {
                        Cylinder cylinder = new Cylinder(radius, height);
                        cylinder.display(geometryObject.CYLINDER);
                    }
                }
            }
        }
    }
}