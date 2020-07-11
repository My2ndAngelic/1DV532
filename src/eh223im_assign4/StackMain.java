package eh223im_assign4;

import java.util.Arrays;

public class StackMain {
    public static void main(String[] args) {
        Stack s = new StackImpl();
        try {
            s.pop();
        } catch (Exception e) {
        }
        s.push(new BankAccount("str"));
        System.out.println(s.pop().getStr());
        try {
            s.pop();
        } catch (Exception e) {
        }

        for (int i = 0; i < 10; i++) {
            s.push( new BankAccount("str"+(i)));
        }

        for (int i = 0; i < 10; i++) {
            System.out.println( s.pop().getStr());
        }
    }
}
