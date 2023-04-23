package base;

import java.util.*;
public class Order implements Iterable<OrderItem> {
    private ArrayList<OrderItem> items;

    public Order() {
        this.items = new ArrayList<OrderItem>();
    }

    public void addOrderItem(OrderItem orderItem) {
        this.items.add(orderItem);
    }

    public void removeOrderItem(OrderItem orderItem) {
        this.items.remove(items);
    }

    public OrderItem getOrderItem(Product product) {
        for (OrderItem orderitem: items) {
            if (OrderItem.getProduct().equals(product)) {
                return orderitem;
            }
        }
        return null;
    }
    public int getNumberOfItems() {
        return items.size();
    }
    public double getTotalCost() {
        double totalCost = 0.00;

        for (OrderItem orderItem : items) {
            totalCost += orderItem.getValue();
        }
        return totalCost;
    }

    @Override
    public Iterator<OrderItem> iterator() {
        return this.items.iterator();
    }
}
