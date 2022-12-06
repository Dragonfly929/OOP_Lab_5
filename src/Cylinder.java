public class Cylinder extends Circle implements Dimensions3D{
    private double z;
    private double radius;
    private double height;

    public Cylinder(double radius, double height) {
        super(radius);
        this.radius = radius;
        this.height = height;
    }

    public double getZ() { return z; }
    public void setZ(double z) { this.z = z; }

    public double getRadius() { return radius; }
    public void setRadius(double radius)  {
        if( this.radius < 0 )
            this.radius =  0.00;
        else
            this.radius = radius;
    }

    public double getHeight() { return height; }
    public void setHeight(double height)  {
        if( this.height < 0 )
            this.height =  0.00;
        else
            this.height = radius;
    }

    @Override
    public double getTotalSurface() {
        System.out.print("Cylinder's surface area: ");
        return 2*Math.PI*radius*height + 2*Math.PI*radius*radius;
    }

    @Override
    public double getVolume() {
        System.out.print("Cylinder's volume: ");
        return Math.PI * radius*radius * height;
    }

    @Override
    public void display(geometryObject object){
        System.out.println("Cylinder's position: (" + getX() + ", " + getY() + ", " + getZ() + ")");
        System.out.println(getVolume());
        System.out.println(getTotalSurface());
    }
}
