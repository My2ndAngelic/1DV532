package eh223im_assign3;

import java.io.FileInputStream;
import java.util.Objects;
import java.util.Scanner;

public class Names {
    public static void main(String[] args) throws Exception {
        // Idea for getting the current working directory: https://stackoverflow.com/questions/4871051/how-to-get-the-current-working-directory-in-java
        FileInputStream fisB = new FileInputStream(System.getProperty("user.dir")+"/src/eh223im_assign3"+"/boynames.txt");
        Scanner sB = new Scanner(fisB);
        Object[][] a = new Object[0][2];
        while (sB.hasNext()) {
            Object[][] b = new Object[a.length + 1][2];
            System.arraycopy(a, 0, b, 0, a.length);
            a = b;
            a[a.length-1][0] = sB.next();
            a[a.length-1][1] = sB.nextInt();
        }

        FileInputStream fisG = new FileInputStream(System.getProperty("user.dir")+"/src/eh223im_assign3"+"/girlnames.txt");
        Scanner sG = new Scanner(fisG);
        Object[][] c = new Object[0][2];
        while (sG.hasNext()) {
            Object[][] d = new Object[c.length + 1][2];
            System.arraycopy(c, 0, d, 0, c.length);
            c = d;
            c[c.length-1][0] = sG.next();
            c[c.length-1][1] = sG.nextInt();
        }
        sB.close();
        fisB.close();
        sG.close();
        fisG.close();

        String[] a0 = new String[a.length];
        for (int i = 0; i< a0.length; i++) {
            a0[i] = Objects.toString(a[i][0]);
        }
        int[] a1 = new int[a.length];
        for (int i = 0; i< a1.length; i++) {
            a1[i] = Integer.parseInt(Objects.toString(a[i][1]));
        }
        String[] c0 = new String[c.length];
        for (int i = 0; i< c0.length; i++) {
            c0[i] = Objects.toString(c[i][0]);
        }
        int[] c1 = new int[c.length];
        for (int i = 0; i< c1.length; i++) {
            c1[i] = Integer.parseInt(Objects.toString(c[i][1]));
        }

        Scanner s = new Scanner(System.in);
        System.out.print("Enter name: ");
        String ss = s.next();
        int rB = -1;
        int rG = -1;
        for (int i = 0; i<a0.length; i++) {
            if (ss.equals(a0[i])) {
                rB = i+1;
            }
        }
        for (int i = 0; i<c0.length; i++) {
            if (ss.equals(c0[i])) {
                rG = i+1;
            }
        }
        if (rB == -1) {
            System.out.println(ss + " is not ranked among the top 1000 boy names.");
        } else {
            System.out.println(ss + " is ranked "+rB+" in popularity among boys with "+c1[rB]+" naming.");
        }
        if (rG == -1) {
            System.out.println(ss + " is not ranked among the top 1000 girl names.");
        } else {
            System.out.println(ss + " is ranked "+rG+" in popularity among girls with "+c1[rG]+" naming.");
        }
    }
}