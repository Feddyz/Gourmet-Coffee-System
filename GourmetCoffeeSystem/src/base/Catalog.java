package base;

public Catalog() {
  this.products=new ArrayList<Product>();
}
public viod addProduct(Product product){
  this.products.add(product);
}
public Iterator<Product>iterator(){
  return this.products.iterator();
}
product Product getProduct(String code){
  for(Product product:this.products){
    if(product.getCode().equals(code)){
      return product;
    }
  }
  return null;
}
public int getNumberOfProducts(){
  return this.products.size();
}
}
