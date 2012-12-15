package flexbox;

import java.util.ArrayList;

/**
 * The OrderManager Class represents the orders placed by the user
 * @author UP616167
 */
public class OrderManager {
    
    private static ArrayList<Order> orders;
    
    public OrderManager() {
        orders = new ArrayList<>();
    }
    
    /**
     * Adds an order to the system
     * @param order the order placed by the user
     */
    protected void addOrder(Order order)
    {
        orders.add(order);
    }
    
    /**
     * Removes an order from the system
     * @param order the order placed by the user
     */
    protected void removeOrder(Order order)
    {
        orders.remove(order);
    }
    
    /**
     * Removes an order from the system by its id
     * @param orderID the id of the order placed by the user
     */
    
    protected void removeOrderByID(int orderID)
    {
        orders.remove(orderID);
    }
    
    
    /**
     * Calculates the total cost of all orders
     * @return the total cost of all orders
     */
    protected double cost() {
    
        double cost = 0;
        for(Order order:orders)
        {
            cost = cost + order.cost();
        }
        return cost;
    }
    
}
