/**
 * Int for exercise 1
 *
 * @version 2.1
 * @author Evan Huynh
 */
package eh223im_assign2;

public class Int {
    // Field
    private int number;

    // Standard getter and setters
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    // Constructor
    public Int(int number) {
        this.number = number;
    }

    // Method

    /**
     * Add two int
     * @param a
     * @return
     */
    public Int plus(Int a) {
        return new Int(number+a.getNumber());
    }

    /**
     * Divide two int
     * @param a
     * @return
     */
    public Int div(Int a) {
        return new Int(number/a.getNumber());
    }

    /**
     * Compare to see if int > input
     * @param a
     * @return
     */
    public boolean isLargerThan(Int a) {
        return (number > a.getNumber());
    }

    /**
     * Return if a-b is 0.
     * @param a
     * @return
     */
    public boolean isEqualTo(Int a) {
        return (number == a.number);
    }

    /**
     * Returns the string
     * @return a string
     */
    public String toString() {
        return "Int("+ number +")";
    }

    /**
     * Main class does something
     * @param args
     */


    public static void main(String[] args) {
        Int i1 = new Int(5);
        Int i2 = new Int(2);
        Int sum = i1.plus(i2); // the plus method adds i1 and i2 and returns
        // result of the addition, resulting sum = 7
        Int div = i1.div(i2); // the div method divides i1 by i2 and returns
        // result of the division, resulting div = 2
        if ( sum.isLargerThan(i1) )
            System.out.println("Sum "+ sum.toString()+ " is larger than "
                    +i1.toString() );
        if ( div.isEqualTo(i2) )
            System.out.println("Both are equal");
        else
            System.out.println("They are not equal");
    }
}
