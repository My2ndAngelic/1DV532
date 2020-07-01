package eh223im_assign1;

public class Fibonacci {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int c = 1;
        int d = 0;

        while (c<1000) {
            System.out.println(c);
            if (c%2==1) {
                d+=c;
            }
            a=b;
            b=c;
            c=a+b;
        }
        System.out.println("Sum of all odd terms in the sequence: "+d);
    }
}
