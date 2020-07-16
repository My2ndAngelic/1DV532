package eh223im_assign4.stack;

import eh223im_assign4.BankAccount;

public class StackMain {
    public static void main(String[] args) {
        Stack s = new StackImpl();
        // Empty stack
        try {
            s.pop();
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Add 1 then empty
        s.push(new BankAccount("str"));
        System.out.println("Peek: "+s.peek().getStr());
        System.out.println("Pop: "+s.pop().getStr());
        System.out.println("Is empty: "+s.isEmpty());

        // Add 100 then pop all
        for (int i = 0; i < 100; i++) {
            s.push( new BankAccount("str"+(i)));
        }
        System.out.println("Size after pushing: "+s.size());
        for (int i = 0; i < 100; i++) {
            System.out.println(s.pop().getStr());
        }
        System.out.println("Size after popping: "+s.size());
    }
}
