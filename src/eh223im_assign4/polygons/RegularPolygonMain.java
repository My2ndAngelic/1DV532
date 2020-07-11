package eh223im_assign4.polygons;

import java.util.Arrays;

public class RegularPolygonMain {
    public static void main(String[] args) {
        RegularPolygon a = new EquilateralTriangle(5);
        System.out.println("Triangle");
        System.out.println(a.getNumSides());
        System.out.println(a.getSideLength());
        System.out.println(a.getInteriorAngle());
        System.out.println(a.getPerimeter());
        RegularPolygon b = new Square (5);
        System.out.println("Square");
        System.out.println(b.getNumSides());
        System.out.println(b.getSideLength());
        System.out.println(b.getInteriorAngle());
        System.out.println(b.getPerimeter());
        RegularPolygon[] rp = new RegularPolygon[10];

        for (int i = 0; i < rp.length; i++) {
            rp[i] = new Square(5);
        }
        System.out.println();
        System.out.println(RegularPolygon.totalSides(rp));
    }
}
