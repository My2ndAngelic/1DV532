package eh223im_assign4;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] a = new int [10];
        for (int i = 0; i< a.length; i++) {
            a[i] = i;
        }

        System.out.println(Arrays.toString(a));

        //pop
        for (int i = a.length-1; i>0; i--) {
            int j = a[i];
            a[i] = a[i-1];
            a[i-1] = j;
        }
        a[0] = -1 ;
        System.out.println(Arrays.toString(a));
    }
}
