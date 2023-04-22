package base;
import java.util.*;

public class OrderItem {
	private Product product;
	private int quantity = 0;
	
	public OrderItem(Product product,int quantity) {
		this.product = product;
		this.quantity = quantity;
	}
	public int getQuantity() {
		return quantity;
	}
	public Product getProduct() {
		return product;
	}
	public void setQuantity(int Quantity) {
		quantity = newQuantity;
	}
	public double getValue() {
		return quantity * coffeeAccessory.getPrice();
	}
}
