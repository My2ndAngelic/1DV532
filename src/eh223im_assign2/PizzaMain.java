/**
 * Pizza Main
 *
 * @version 2.3
 * @author Evan Huynh
 */
package eh223im_assign2;

import java.util.Scanner;

public class PizzaMain {
    public static void main(String[] args) {
        System.out.println(java.util.Calendar.getInstance().getTime());  // Idea: https://www.javatpoint.com/java-get-current-date

        Scanner s = new Scanner(System.in);
        String a = "";
        String b = "";
        int c = -1;

        System.out.println("\nWelcome to the Café LNU!\n");

        System.out.print("Please enter size of your pizza [small, medium, or large]: ");
        while (!a.toLowerCase().equals("small") && !a.toLowerCase().equals("medium") && !a.toLowerCase().equals("large")) {
            a = s.next();
        }

        System.out.print("Please enter type of topping [cheese, pepperoni, ham]: ");
        while (!b.toLowerCase().equals("cheese") && !b.toLowerCase().equals("pepperoni") && !b.toLowerCase().equals("ham")) {
            b = s.next();
        }
        System.out.print("Please enter number of toppings you want: ");
        while (c<=0) {
            c = s.nextInt();
        }
        Pizza pizza = new Pizza(a,b,c);
        System.out.print("\nThank you. ");
        System.out.println(pizza.getDescription());
        System.out.print("\nEnjoy your food.");
    }
}
