package base;

import java.util.ArrayList;
import java.util.Iterator;

public class Catalog implements Iterable<Product>{
    private ArrayList<Product> products;
    public  Catalog(){
        this.products=new ArrayList<Product>();
    }
    public void addProduct(Product product){
        this.products.add(product);
    }
    public Iterable<Product> itertor(){
        return (Iterable<Product>) this.products.iterator();
    }
    public Product getProduct(String code){
        for (Product product:this.products){
            if (product.getCode().equals(code)){
                return product;
            }

        }
        return null;
    }
    public int getNumberofProducts(){
        return this.products.size();
    }

    @Override
    public Iterator<Product> iterator() {
        return this.products.iterator();
    }

    public void removeProduct(Product removeCA) {
        this.products.remove(removeCA);
    }
}
