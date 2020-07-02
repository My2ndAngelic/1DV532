package eh223im_assign3;

import java.util.Random;

public class Dices {
    public static void main(String[] args) {
        int a1, a2, a3;
        Random r = new Random();
        int[][] b = new int[11][2];
        for (int i = 0; i<b.length;i++) {
            b[i][0] = i+2;
        }

        for (int i = 0; i<10000; i++) {
            a1 = r.nextInt(6) + 1;
            a2 = r.nextInt(6) + 1;
            a3 = a1 + a2;
            b[a3 - 2][1] += 1;
        }

        for (int i = 0; i<b.length;i++) {
            System.out.println(b[i][0]+"\t"+b[i][1]);
        }
    }
}
