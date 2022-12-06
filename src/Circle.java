public class Circle extends Line implements Shape{
    protected double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() { return radius; }
    public void setRadius(double radius)  {
        if( this.radius < 0 )
            this.radius =  0.00;
        else
            this.radius = radius;
    }

    @Override
    public void draw() {
        for (double i = -radius; i <= radius; i++) {
            for (double j = -radius; j <= radius; j++) {
                if (i*i + j*j <= radius*radius) System.out.print("* ");
                else                            System.out.print(". ");
            }
            System.out.println();
        }
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * this.radius;
    }

    public double getDiameter() {
        return 2 * this.radius;
    }

    @Override
    public void display(geometryObject object) {
        System.out.println("Circle's center (" + getX() + ", " + getY() + ")");
        System.out.println("Circle's diameter: " + getDiameter());
        System.out.println("Circle's Area: " + getArea());
        System.out.println("Circle's Perimeter: " + getPerimeter());
        draw();
    }
}
