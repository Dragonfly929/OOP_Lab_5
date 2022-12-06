import java.util.Hashtable;
import java.util.Random;

public class Polygon extends Line implements Shape {
    private int side;
    private final int[] nrSides = {3, 4, 6, 7, 8, 9, 10};
    private final String[] type = {"Triangle", "Quadrilateral", "Pentagon", "Hexagon", "Heptagon", "Nonagon", "Decagon"};
    private final Hashtable<Integer, String> polygonType = new Hashtable<>();

    public Polygon() {
        this.side = side;
    }

    public Polygon(int side) {
        this.side = side;
    }

    private int getSide() { return side; }
    private void setSide(int side) { this.side = side; }

    public Hashtable<Integer, String> getPolygonTypes() { return polygonType; }
    public void listPolygonType() {
        for(int i = 0; i < nrSides.length; i++) {
            polygonType.put(nrSides[i], type[i]);
        }
    }

    public String getPolygonType() {
        Random random = new Random();
        int randomInd = random.nextInt(type.length);
        return "Polygon has " + nrSides[randomInd] + " sides so we have " + type[randomInd];
    }

    // regular polygons
    public String getInteriorAngle() {
        double sum;
        Random random = new Random();
        int randomIndex = random.nextInt(nrSides.length);
        System.out.println("Regular Polygon");
        return type[randomIndex] + "'s Interior angle sum: " + 180*(nrSides[randomIndex]-2) + "degrees" +
                "\nInterior angle: " + (180*(nrSides[randomIndex]-2))/nrSides[randomIndex];
    }

    @Override
    public double getPerimeter() {
        Random random = new Random();
        this.side = random.nextInt(10);
        int randomIndex = random.nextInt(nrSides.length);
        System.out.print(type[randomIndex] + "'s Perimeter with side's length equal to " + side + ": ");
        return nrSides[randomIndex] * side;
    }
    @Override
    public double getArea() {
        Random random = new Random();
        this.side = random.nextInt(10);
        int randomIndex = random.nextInt(nrSides.length);
        double p = nrSides[randomIndex] * side;
        double a = side/(2 * Math.tan(Math.toRadians(180 / (double) nrSides[randomIndex])));
        System.out.print(type[randomIndex] + "'s Area with side equal to " + side +": ");
        return p*a/2;
    }
    @Override
    public void display(geometryObject object){
        System.out.println(geometryObject.POLYGON);
        System.out.println(getPolygonType());
        System.out.println(getInteriorAngle());
        System.out.println(getArea());
        System.out.println(getPerimeter());

    }

}
