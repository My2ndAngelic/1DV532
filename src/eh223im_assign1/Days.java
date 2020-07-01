package eh223im_assign1;

import java.util.Scanner;

public class Days {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter today's day: ");
        int a=s.nextInt();
        System.out.print("Enter the number for future day: ");
        int b=s.nextInt();
        if (a>=0 && a+b>=0) {
            System.out.print("Today is " + main2(a % 7) + " and the future day is " + main2((a + b) % 7));
        }
    }

    static String main2(int c) {
        if (c==0) {
            return"Sunday";
        } else if (c==1) {
            return"Monday";
        } else if (c==2) {
            return"Tuesday";
        } else if (c==3) {
            return"Wednesday";
        } else if (c==4) {
            return"Thursday";
        } else if (c==5) {
            return"Friday";
        } else if (c==6) {
            return"Saturday";
        } else return "Unknown";
    }
}
