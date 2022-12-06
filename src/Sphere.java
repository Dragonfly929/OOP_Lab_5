public class Sphere extends Circle implements Dimensions3D{

    private double z;

    public Sphere(double radius) {
        super(radius);
        this.radius = radius;
    }

    public Sphere(double x, double y, double z, double radius) {
        super(radius);
        Sphere.x = x;
        Sphere.y = y;
        this.z = z;
        this.radius = radius;

    }

    @Override
    public double getTotalSurface() {
        System.out.print("Sphere's Surface Area: ");
        return 4 * Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getVolume() {
        System.out.print("Sphere's Volume: ");
        return (4/3) * Math.PI * Math.pow(radius, 3);
    }

    @Override
    public void display(geometryObject object) {
       System.out.println(geometryObject.SPHERE);
       System.out.println(getTotalSurface());
       System.out.println(getVolume());
       System.out.println("Sphere's diameter: " + getDiameter());
       System.out.println("Sphere's radius: " + getRadius());

    }
}