package base;

public class CoffeeBrewer extends Product {
    static model = "";
    static waterSupply = "";
    static int capacity =0;

    public CoffeeBrewer(String inicode, String inidescription, Double iniprice,String inimodel,String iniwaterSupply,int inicapacity) {
        super(inicode, inidescription, iniprice);
        this.model=inimodel;
        this.waterSupply=iniwaterSupply;
        this.capacity=inicapacity;
    }

    //get
    public String getModel(){
        return model;
    }
    public String getWaterSupply(){
        return waterSupply;
    }
    public int getCapacity(){
        return capacity;
    }
    //set
    public void setModel(String newModel){
        model=newModel;
    }
    public void setWaterSupply(String newWaterSupply){
        waterSupply = newWaterSupply;
    }
    public void setCapacity(int newCapacity){
        capacity= newCapacity;
    }

    @Override
    public String toString() {
        return super.toString()+getModel()+"_"+getWaterSupply()+"_"+getCapacity();
    }
}
