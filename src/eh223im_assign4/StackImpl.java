package eh223im_assign4;

import java.util.Arrays;

public class StackImpl implements Stack {
    // Since I have done this before, as always
    // Here is the proper citation for the code, just in case.
    /**
     * Author(s) name: My2ndAngelic
     * Date: 2017 Dec
     * Title of program/source code: Stack
     * Code version: N/A
     * Type: computer program
     * Web address: https://github.com/My2ndAngelic/1DV506/blob/master/src/main/java/eh223im_assign4/stack/StackUtils.java
     */

    BankAccount[] bAss = new BankAccount[5];
    int size = 0;

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void push(BankAccount bankAccount) {
        if (size == bAss.length) {
            BankAccount[] temp = new BankAccount[size * 2];
            System.arraycopy(bAss, 0, temp, 0, size);
            bAss = temp;
        }
        System.arraycopy(bAss,0,bAss,1,size);
        bAss[0] = bankAccount;
        size++;
    }

    @Override
    public BankAccount pop() {
        if (size == 0) {
            throw new IndexOutOfBoundsException("Empty stack.");
        } else {
            BankAccount temp = bAss[0];
            if (size - 1 >= 0) System.arraycopy(bAss, 1, bAss, 0, size - 1);
            size--;
            bAss[size] = null;
            return temp;
        }
    }

    @Override
    public BankAccount peek() {
        if (size == 0) {
            throw new IndexOutOfBoundsException("Empty stack.");
        } else {
            return bAss[0];
        }
    }
}


