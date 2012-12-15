package flexbox;

/**
 * The Order Class represents the quantity of boxes that the user would like to order
 * @author UP616167
 */
public class Order {
    
    private Box box;
    private int quantity;
    
    public Order(Box box, int quantity) {
        this.box = box;
        this.quantity = quantity;
    }
        
    /**
     * Calculates the cost of the box multiplied by its quantity
     * @return the cost of the box multiplied by its quantity
     */
    protected double cost() {
        return box.cost() * quantity;
    }
    
}
