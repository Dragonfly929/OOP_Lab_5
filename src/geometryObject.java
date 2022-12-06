public enum geometryObject {
    POINT("Location in the coordinate space"),
    LINE("First point location"),
    POLYGON("Center Inscribed in Circle"),
    TRIANGLE("A corner"),
    RECTANGLE("Right upper corner"),
    CIRCLE("Circle's Center"),
    ELLIPSE("Ellipse's center"),
    SPHERE("Center of the sphere 3D coordinate system"),
    CYLINDER("Base's center 3D coordinate system");


    private final String pointPosition;

    geometryObject(String pointPosition) {
        this.pointPosition = pointPosition;
    }

    public String getPointPosition() {
        return pointPosition;
    }
}
