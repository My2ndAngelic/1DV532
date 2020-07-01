package eh223im_assign3;

import java.io.FileInputStream;
import java.util.Arrays;
import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"/src/eh223im_assign3"+"/numbers.txt");
        Scanner s = new Scanner(fis);
        int[] a = new int[0];
        while (s.hasNext()) {
            int[] b = new int[a.length+1];
            System.arraycopy(a,0,b,0,a.length);
            a=b;
            a[a.length-1] = s.nextInt();
        }
        System.out.println(Arrays.toString(a));
        s.close();
        fis.close();

        int c = 0;
        for (int i = 0; i < a.length; i++) {
            c+=a[i];
        }
        double d = (double) c/a.length;

        System.out.println("Average: "+d);

        double e = 0;

        for (int i = 0; i < a.length; i++) {
            e += Math.pow((a[i] - d),2);
        }
        e = Math.sqrt(e);
        System.out.println("Standard deviation: "+e);
    }
}
