package eh223im_assign4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BankAccount {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Welcome to the Bank of Students, By the Students, for the Students!");
        System.out.print("Enter customer ID: ");
        String a;
        a = s.next();
        while (!a.matches("^[A-z]+[0-9]{3}")) { // Regex because it sounds fun, any chars in the beginning, 3 digits at the end.
            System.out.println("Incorrect Customer ID. The Customer ID must start with a letter followed by three digits.\nInput again");
            System.out.print("Enter customer ID: ");
            a = s.next();
        }
        int b = 0;
        do {
            try {
                System.out.print("Enter account no: ");
                b = s.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Incorrect Account No. The Account number must be of seven digits.\nInput again.");
                s.nextLine();
            }
            if (b<=999999 || b > 9999999) {
                System.out.println("Incorrect Account No. The Account number must be of seven digits.\nInput again.");
            }
        } while (b<=999999 || b > 9999999);

        int c = 0;
        do {
            try {
                System.out.print("Enter balance: ");
                c = s.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Initial balance must be equal to or higher than 1000.\nInput again.");
                s.nextLine();
            }
            if (c < 1000) {
                System.out.println("Initial balance must be equal to or higher than 1000.\nInput again.");
            }
        } while (c < 1000);
        System.out.println("Congratulations, your account has been create successfully!");
        System.out.println("ID: "+a+" | Account no: "+b+" | Balance: "+c);
    }

    private String str;
    BankAccount(String str) {
        this.str = str;
    }

    public String getStr() {
        return str;
    }
}
