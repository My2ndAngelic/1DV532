package eh223im_assign1;

import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        System.out.print("Enter an integer to estimate the square root of: ");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        // Source for the idea: https://stackoverflow.com/questions/3144610/integer-division-how-do-you-produce-a-double
        if (a > 0) {
            double guess = a * 1.0 / 2;
            double r = a * 1.0 / guess;
            double percent;

            System.out.println("Current guess: " + guess);
            do {
                double newguess = (guess + r) / 2;
                percent = (Math.abs(newguess - guess)) * 100;
                guess = newguess;
                r = a * 1.0 / guess;
                System.out.println("Current guess: " + guess);
            } while (!(percent <= 1.0));
            System.out.print("The estimated square root of " + a + " is ");
            System.out.printf("%.2f", guess);
            System.out.println();
        }
    }
}
