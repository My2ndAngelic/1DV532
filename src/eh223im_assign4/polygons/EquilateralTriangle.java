package eh223im_assign4.polygons;

public class EquilateralTriangle implements RegularPolygon {
    private final int sizeLength;

    public EquilateralTriangle(int sideLength) {
        this.sizeLength = sideLength;
    }

    @Override
    public int getNumSides() {
        return 3;
    }

    @Override
    public int getSideLength() {
        return sizeLength;
    }
}