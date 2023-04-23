package base;

public class OrderItem {
    private static Product product;
    private int quantity = 0;

    public OrderItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }
    public int getQuantity() {
        return quantity;
    }
    public static Product getProduct() {
        return product;
    }
    public void setQuantity(int newQuantity) {
        quantity = newQuantity;
    }
    public double getValue() {
        return quantity * Product.getPrice();
    }

    @Override
    public String toString() {
        return getQuantity()+"_"+getProduct().getCode()+"_"+getProduct().getPrice();
    }
}
