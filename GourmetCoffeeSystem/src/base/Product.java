package base;

public class Product {
    static String code = "";
    static String description = "";
    static Double price = 0.00;
    public Product(String inicode, String inidescription, Double iniprice){
        this.code=inicode;
        this.description=inidescription;
        this.price=iniprice;
    }
    public static String getCode() {
        return code;
    }

    public static String getDescription() {
        return description;
    }

    public static double getPrice() {
        return price;
    }

    public void setCode(String newCode) {
        code = newCode;
    }

    public void setDescription(String newDescription) {
        description = newDescription;
    }

    public void setPrice(double newPrice) {
        price = newPrice;
    }
    public boolean equals(Object object){
        return object instanceof Product && getCode().equals(((Product)object).getCode());
    }
    public String toString(){
        return getCode()+"_"+getDescription()+"_"+getPrice();
    }
}
