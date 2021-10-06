package eh223im_assign2;

public class SweIDTemp {
    public static void main(String[] args) {
        String ID = "665310-9288";
        int p = luhn(ID);
        System.out.println(p);

    }

    private static int luhn1(String sweID) {
        int a;
        int b = 0;
        String sweID2=sweID.substring(0,6) + sweID.substring(7,10);
        for (int i = 0; i < sweID2.length(); i++) { // multiplication pattern: 21212-121
            int i1 = Integer.parseInt(sweID2.substring(i,i+1));
            if (i % 2 != 0) {
                a = i1;
            } else {
                a = 0;
            }
            b+=a;
        }
        return b;
    }

    private static int luhn2(String sweID) {
        int a;
        int b = 0;
        String sweID2=sweID.substring(0,6) + sweID.substring(7,10);
        for (int i = 0; i < sweID2.length(); i++) { // multiplication pattern: 21212-121
            int i1 = Integer.parseInt(sweID2.substring(i,i+1));
            if (i % 2 == 0) {
                a = i1 * 2;
                a = a/10 + a%10;
            } else {
                a = 0;
            }
            b+=a;
        }
        return b;
    }

    private static int luhn(String sweID) {
        int a;
        int b = 0;
        String sweID2=sweID.substring(0,6) + sweID.substring(7,10);
        for (int i = 0; i < sweID2.length(); i++) { // multiplication pattern: 21212-121
            int i1 = Integer.parseInt(sweID2.substring(i,i+1));
            if (i % 2 == 0) {
                a = i1 * 2;
                a = a/10 + a%10;
            } else {
                a = i1;
            }
            b+=a;
        }
        return b;
    }
}
