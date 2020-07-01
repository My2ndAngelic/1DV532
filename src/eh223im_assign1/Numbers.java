package eh223im_assign1;

import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        Scanner s = new Scanner(System.in);
        // Assuming no check
        System.out.print("Enter a three-digit integer number: ");
        a=s.nextInt();
        if (a>=100 && a<=999) {
            b = (a / 100) + ((a / 10) % 10) + (a % 10);
            System.out.println("Sum of the digits of the integer number is: " + b + ".");
            c = (a / 100) * ((a / 10) % 10) * (a % 10);
            System.out.println("Product of the digits of the integer number is: " + c + ".");
        }
    }
}
