package base;

import java.util.*;
public class Order {
	private ArrayList<OrderItem> orderItems;
	
	public Order() {
		this.orderItems = new ArrayList<OrderItem>();
	}
	
	public void addOrderItem(OrderItem orderItem) {
		this.orderItems.add(orderItem);
	}
	
	public void removeOrderItem(OrderItem orderItem) {
		this.orderItems.remove(orderItems);
	}
	
	public OrderItem getOrderItem(product:Product) {
		for (OrderItem orderitem:orderItems) {
			if (orderItem.getProduc().equals(product)) {
				return orderItem;
			}
		}
		return null;
	}
	public int getNumberOfItems() {
		return orderItems.size();
	}
	public double getTotalCost() {
		double totalCost = 0.00;
		
		for (OrderItem orderItem : orderItems) {
			totalCost += orderItem.getValue();
		}
		return totalCost;
	}
}
