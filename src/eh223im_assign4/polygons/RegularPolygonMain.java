package eh223im_assign4.polygons;

public class RegularPolygonMain {
    public static void main(String[] args) throws Exception {
        RegularPolygon a = new EquilateralTriangle(5);
        System.out.println("Triangle");
        System.out.println("Number of sides: "+a.getNumSides());
        System.out.println("Side length: "+a.getSideLength());
        System.out.println("Interior angele: "+a.getInteriorAngle());
        System.out.println("Perimeter: "+a.getPerimeter());
        RegularPolygon b = new Square (5);
        System.out.println();
        System.out.println("Square");
        System.out.println("Number of sides: "+b.getNumSides());
        System.out.println("Side length: "+b.getSideLength());
        System.out.println("Interior angele: "+b.getInteriorAngle());
        System.out.println("Perimeter: "+b.getPerimeter());
        RegularPolygon[] rp = new RegularPolygon[10];

        for (int i = 0; i < rp.length; i++) {
            rp[i] = new Square(5);
        }
        System.out.println();
        System.out.println("Total number of sides of 10 squares: "+RegularPolygon.totalSides(rp));
    }
}