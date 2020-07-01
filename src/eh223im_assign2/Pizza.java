/**
 * Pizza calculator for exercise 3
 *
 * @version 2.3
 * @author Evan Huynh
 */

package eh223im_assign2;

public class Pizza {

    // Field
    private String size;
    private int cheese;
    private int pepperoni;
    private int ham;

    // Constructor
    public Pizza(String size, String type, int topping) {
        this.size = size;

        switch (type.toLowerCase()) {
            case "cheese":
                this.cheese = topping;
                break;
            case "pepperoni":
                this.pepperoni = topping;
                break;
            case "ham":
                this.ham = topping;
                break;
        }
    }

    // Methods

    /**
     * Pizza cost
     * @return how much it cost
     */
    public double calcCost() {
        double base = 0; double top = 0;
        switch (size.toLowerCase()) {
            case "small":
                base = 10;
                top = 3;
                break;
            case "medium":
                base = 15;
                top = 2.5;
                break;
            case "large":
                base = 20;
                top = 2;
                break;
        }
        return base+top*cheese+top*pepperoni+top*ham; // Assuming multiple topping
    }

    /**
     * Pizza description
     * @return description
     */
    public String getDescription() {
        return "You ordered a "+ getSize().toLowerCase()+" pizza with " +getTopping()+" "+ getType().toLowerCase()+ " toppings. Your bill is "+String.format("%.02f",calcCost())+ " kr.";
    }

    /**
     * Return type, only one type allowed from cheese to ham.
     * @return whatever available first
     */
    public String getType() {
        String a = "";
        if (cheese > 0) {
            a += "cheese";
        } else if (pepperoni > 0) {
            a += "pepperoni";
        } else if (ham > 0) {
            a += "ham";
        }
        return a;
    }

    // Paperwork methods
    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        if (size.toLowerCase().equals("small") || size.toLowerCase().equals("medium") || size.toLowerCase().equals("large")) {
            this.size = size;
        }
    }

    /**
     * Return topping type
     * @return
     */
    public int getTopping() {
        // Since pizza only contains one topping.
        if (cheese > 0) {
            return cheese;
        } else if (pepperoni > 0) {
            return pepperoni;
        } else if (ham > 0) {
            return ham;
        }
        return 0;
    }

}
