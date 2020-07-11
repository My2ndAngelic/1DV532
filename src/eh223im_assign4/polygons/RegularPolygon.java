package eh223im_assign4.polygons;

public interface RegularPolygon {
    public abstract int getNumSides();
    public abstract int getSideLength();
    public default int getPerimeter() {
        return getSideLength()*getNumSides();
    }
    public default int getInteriorAngle () {
        return (getNumSides()-2)*180;
    }

    public static int totalSides(RegularPolygon[] pol) {
        int k = 0;
        for (RegularPolygon regularPolygon : pol) {
            k += regularPolygon.getNumSides();
        }
        return k;
    }
}
