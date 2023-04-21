package base;

public class Coffee extends CoffeeAccessory {
    String countryoforigin = "";
    String roast = "";
    String flavor = "";
    String aroma = "";
    String acidity = "";
    String body = "";
    String smallCharge ="";

//get
    public String getOrigin(){
        return countryoforigin;
    }
    public String getRoast(){
        return roast;
    }
    public String getFlavor(){
        return flavor;
    }
    public String getSmallCharge(){
        return smallCharge;
    }
    public String getAroma(){
        return aroma;
    }
    public String getAcidity(){
        return acidity;
    }
    public String getBody(){
        return body;
    }
    //set
    public void setOrigin(String newOrigin){
        countryoforigin = newOrigin;
    }
    public void setRoast(String newRoast){
        roast = newRoast;
    }
    public void setFlavor(String newFlavour){
        flavor= newFlavour;
    }
    public void setSmallCharge(String newSmallCharge){
        smallCharge = newSmallCharge;
    }
    public void setAroma(String newAroma){
        aroma = newAroma;
    }
    public void setAcidity(String newAcidity){
        acidity = newAcidity;
    }
    public void setBody(String newBody){
        body = newBody;
        ;
    }




}
