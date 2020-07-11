package eh223im_assign4;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = 0;
        while (a <= 0) {
            System.out.println("How many numbers do you want to enter?");
            try {
                a = s.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("You entered a non-numeric value which is not allowed. Please enter the number again.");
                s.nextLine();
            }
            if (a <= 0) {
                System.out.println("Number must be greater than 0.");
            }
        }

        int[] b = new int[a];

        for (int i = 0; i < a; i++) {
            try {
                System.out.print("Enter number " + (i+1) +": ");
                b[i] = s.nextInt();
            } catch (Exception e) {
                System.out.println("Enter a valid number.");
                s.nextLine();
                i--;
            }
        }
        System.out.println(Arrays.toString(b));

        double c = 0;
        for (int value : b) {
            c += value;
        }
        c /= b.length;
        String format = new DecimalFormat("#.##").format(c);

        System.out.println("Average of the entered numbers is "+ format);
    }
}
