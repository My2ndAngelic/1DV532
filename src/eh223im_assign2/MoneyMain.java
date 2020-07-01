/**
 * MoneyMain class
 *
 * @version 2.4
 * @author Evan Huynh
 */
package eh223im_assign2;

public class MoneyMain {
    public static void main(String[] args) {

        System.out.print("Money 1 is: ");
        Money money1 = new Money (2,00);
        System.out.println(money1.toString());

        System.out.print("Money 2 is: ");
        Money money2 = new Money (5,05);
        System.out.println(money2.toString());

        System.out.print("Money1' dollar is: ");
        System.out.println(money1.getDollar());
        System.out.print("Money1' cent is: ");
        System.out.println(money1.getCent());
        System.out.print("Money2' dollar is: ");
        System.out.println(money2.getDollar());
        System.out.print("Money2' cent is: ");
        System.out.println(money2.getCent());

        System.out.print("Adding money1 to money2: ");
        Money c = money2.add(money1);
        System.out.println(c.toString());
        System.out.print("Subtracting money1 from money2: ");
        Money d = money2.minus(money1);
        System.out.println(d.toString());

        Money e = new Money(4,-101);
        System.out.print("Money 3 is: "+e.toString());
    }
}
