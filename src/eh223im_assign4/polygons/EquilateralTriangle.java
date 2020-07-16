package eh223im_assign4.polygons;

import java.util.InputMismatchException;

public class EquilateralTriangle implements RegularPolygon {
    private int sideLength;

    public EquilateralTriangle(int sideLength) {
        if (sideLength > 0) {
            this.sideLength = sideLength;
        } else throw new InputMismatchException("Invalid side length.");
    }

    @Override
    public int getNumSides() {
        return 3;
    }

    @Override
    public int getSideLength() {
        return sideLength;
    }
}