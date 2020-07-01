/**
 * Money class for exercise 4
 *
 * @version 2.4
 * @author Evan Huynh
 */
package eh223im_assign2;

public class Money {
    // Fields
    private int dollar;
    private int cent;

    // Constructors
    // Idea for the cent counting: https://stackoverflow.com/questions/4412179/best-way-to-make-javas-modulus-behave-like-it-should-with-negative-numbers
    /**
     * Basic constructor
     * @param dollar
     * @param cent
     */
    public Money(int dollar, int cent) {
        if (cent >= 0) { // for positive cent
            this.dollar = dollar + (cent / 100); // add them up, in case someone enter something over 100 cents
            this.cent = cent % 100; // mod the cent down after adding them to the dollar part
        } else { // for negative cent
            this.dollar = dollar - Math.abs(cent / 100);
            this.cent = (cent % 100 + 100) % 100;
        }
    }

    /**
     * Dollar only constructor
     * @param dollar
     */
    public Money(int dollar) {
        this.dollar=dollar;
        this.cent=0;
    }

    /**
     * Default constructor
     */
    public Money() {
        this.dollar=0;
        this.cent=0;
    }

    /**
     * Money constructor
     * @param money
     */
    public Money(Money money) {
        new Money(money.dollar,money.cent); // construct itself using the first constructor.
    }

    // Methods

    /**
     * Add two moneys
     * @param money
     * @return
     */
    public Money add(Money money) {
        int a = money.getDollar();
        int b = money.getCent();
        a += this.dollar;
        b += this.cent;
        return new Money(a,b);
    }

    /**
     * Minus two moneys
     * @param money
     * @return
     */
    public Money minus(Money money) {
        int a = money.getDollar();
        int b = money.getCent();
        a = this.dollar - a; // subtract them by dollar
        b = this.cent - b; // subtract them by cent
        return new Money(a,b); // construct a new money using the result.
    }

    /**
     * Export dollar, with delimiter
     * @param delimiter
     * @return
     */
    public String toString(String delimiter) {
        if (dollar >= 0) {
            return "$" + dollar + delimiter + String.format("%02d", cent);
        } else {
            return "-$" + Math.abs(dollar) + delimiter + String.format("%02d", cent);
        }
    }

    public String toString() {
        String delimiter = ",";
        if (dollar >= 0) {
            return "$" + dollar + delimiter + String.format("%02d", cent);
        } else {
            return "-$" + Math.abs(dollar) + delimiter + String.format("%02d", cent);
        }
    }

    // Standard getter and setters
    /**
     * Return dollar
     * @return dollar
     */
    public int getDollar() {
        return dollar;
    }

    /**
     * Set dollar
     * @param dollar
     */
    public void setDollar(int dollar) {
        this.dollar = dollar;
    }

    /**
     * Get cents
     * @return
     */
    public int getCent() {
        return cent;
    }

    /**
     * Generate new money when setting cent, only 0 - 99.
     * @param cent
     */
    public void setCent(int cent) {
        if(cent>=0 && cent<=99) {
            this.cent = cent;
        }
    }
}
