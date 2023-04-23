package base;

public class Coffee extends Product {
    String origin = "";
    String roast = "";
    String flavor = "";
    String aroma = "";
    String acidity = "";
    String body = "";
    String smallCharge ="";

    public Coffee(String inicode, String inidescription, Double iniprice,String iniorigin,String iniroast,String iniflavor,String iniaroma,String iniacidity,String inibody,String inismallCharge) {
        super(inicode, inidescription, iniprice);
        this.origin=iniorigin;
        this.roast=iniroast;
        this.flavor=iniflavor;
        this.aroma=iniaroma;
        this.acidity=iniacidity;
        this.body=inibody;
        this.smallCharge=inismallCharge;
    }

    //get
    public String getOrigin(){
        return origin;
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
        origin = newOrigin;
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
    }

    @Override
    public String toString() {
        return super.toString()+"_"+getOrigin()+"_"+getRoast()+"_"+getFlavor()+"_"+getSmallCharge()+"_"+getAroma()+"_"+getAcidity()+"_"+getBody();
    }
}
