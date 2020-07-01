package eh223im_assign1;

import java.util.Scanner;

public class ISBN {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int b=0;
        System.out.print("Enter the first 9 digits of an ISBN as integer: ");
        int a = s.nextInt();
        int c = a;
        if (a>=0 && a<=999999999) {
            int d;
            if (c == 0) {
                d = 1;
            } else {
                d = (int) (Math.floor(Math.log(c) / Math.log(10)) + 1);
            }
            for (int i = 0; i < d; i++) {
                int lastdigit = a % 10;
                a = a / 10;
                b += lastdigit * (9 - i);
            }
            b = b % 11;
            System.out.print("The ISBN-10 number is: ");
            for (int i = 0; i<9-d; i++) {
                System.out.print(0);
            }
            if (b == 10) {
                System.out.println(c + "" + "X");
            } else {
                System.out.println(c + "" + b);
            }
        }
    }
}
