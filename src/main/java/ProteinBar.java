public class ProteinBar {
    private String Name;
    private String productID;
    private double fett;
    private double energy;
    private double kalhydrate;
    private double protein;
    private double fiber;
    private String revName;
    private String revDate;
    private int revRate;

    public ProteinBar(){}

    public String getName() {
        return Name;
    }

    public ProteinBar(String name, String productID, double fett, double energy, double kalhydrate, double protein, double fiber) {
        Name = name;
        this.productID = productID;
        this.fett = fett;
        this.energy = energy;
        this.kalhydrate = kalhydrate;
        this.protein = protein;
        this.fiber = fiber;
    }

    public ProteinBar(String name, String productID, double fett, double energy, double kalhydrate, double protein, double fiber, String revName, String revDate, int revRate) {
        Name = name;
        this.productID = productID;
        this.fett = fett;
        this.energy = energy;
        this.kalhydrate = kalhydrate;
        this.protein = protein;
        this.fiber = fiber;
        this.revName = revName;
        this.revDate = revDate;
        this.revRate = revRate;
    }

    public String getRevName() {
        return revName;
    }

    public void setRevName(String revName) {
        this.revName = revName;
    }

    public String getRevDate() {
        return revDate;
    }

    public void setRevDate(String revDate) {
        this.revDate = revDate;
    }

    public int getRevRate() {
        return revRate;
    }

    public void setRevRate(int revRate) {
        this.revRate = revRate;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public double getFett() {
        return fett;
    }

    public void setFett(double fett) {
        this.fett = fett;
    }

    public double getEnergy() {
        return energy;
    }

    public void setEnergy(double energy) {
        this.energy = energy;
    }

    public double getKalhydrate() {
        return kalhydrate;
    }

    public void setKalhydrate(double kalhydrate) {
        this.kalhydrate = kalhydrate;
    }

    public double getProtein() {
        return protein;
    }

    public void setProtein(double protein) {
        this.protein = protein;
    }

    public double getFiber() {
        return fiber;
    }

    public void setFiber(double fiber) {
        this.fiber = fiber;
    }
    @Override
    public String toString(){
        return Name+": "+productID+"\n"+"Fett: "+fett+"\nEnergy: "+energy+"\nkalhydrate: "+kalhydrate+"\nprotein: "+protein
                +"\nfiber: "+fiber;
        //return Name+": "+productID+"\n"+"Fett: "+fett+"\nEnergy: "+energy+"\nkalhydrate: "+kalhydrate+"\nprotein: "+protein
           //     +"\nfiber: "+fiber+"\nreviewerName: "+revName+"\nReview Date: "+revDate+"\nRate: "+revRate;
    }
}

