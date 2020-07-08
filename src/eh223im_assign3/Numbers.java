package eh223im_assign3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) throws Exception {
        System.out.print("Enter directory path in which number.txt is located and analysis.txt is going to be written: ");
        String dir = new Scanner(System.in).next();
        FileInputStream fis = new FileInputStream(dir+"/numbers.txt");
        Scanner s = new Scanner(fis);
        int[] a = new int[0];
        while (s.hasNext()) {
            int[] b = new int[a.length+1];
            System.arraycopy(a,0,b,0,a.length);
            a=b;
            a[a.length-1] = s.nextInt();
        }

        int c = 0;
        for (int i = 0; i < a.length; i++) {
            c+=a[i];
        }
        double d = (double) c/a.length;

        FileOutputStream fos = new FileOutputStream(dir+"/analysis.txt");
        PrintWriter pw = new PrintWriter(fos);
        String o1 = "Average: "+d;
        pw.println(o1);
        double e = 0;

        for (int i = 0; i < a.length; i++) {
            e += Math.pow((a[i] - d),2);
        }
        e = Math.sqrt(e);
        String o2 = "Standard deviation: "+e;
        pw.println(o2);

        System.out.println(o1);
        System.out.println(o2);

        s.close();
        fis.close();
        pw.close();
        fos.close();
    }
}
