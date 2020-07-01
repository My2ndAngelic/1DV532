package eh223im_assign1;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char a = 'y';
        while (a=='y') {
            System.out.print("Enter the starting number of the range: ");
            int b = s.nextInt();
            System.out.print("Enter the ending number of the range: ");
            int c = s.nextInt();
            if (c >=0 && c>=b) {
                for (int i = b; i <= c; i++) {
                    if (isArmstrong(i)) {
                        System.out.println(i);
                    }
                }
            }
            System.out.print("Do you want to repeat? (Y/N): ");
            a=s.next().toLowerCase().charAt(0);
            System.out.println();
        }
    }

    static boolean isArmstrong(int c) {
        int lastdigit;
        int counter=0;
        int sum=0;
        int a=c;
        if (c == 0) {
            counter = 1;
        } else {
            counter = (int) (Math.floor(Math.log(a) / Math.log(10)) + 1);
        }
        while(a!=0) {
            lastdigit=a%10;
            a=a/10;
            sum+=Math.pow(lastdigit,counter);
        }
        return sum==c;
    }
}
