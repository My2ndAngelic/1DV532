package eh223im_assign4.polygons;

public class Square implements RegularPolygon {
    private final int sideLength;

    public Square(int sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public int getNumSides() {
        return 4;
    }

    @Override
    public int getSideLength() {
        return sideLength;
    }
}
