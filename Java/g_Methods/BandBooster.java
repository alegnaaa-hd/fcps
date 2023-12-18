package Java.g_Methods;

public class BandBooster {
    private String name;
    private int boxesSold;
    
    // Constructor
    public BandBooster (String aName) {
        name = aName;
        boxesSold = 0;
    }
    
    public void updateSales (int newSales) {
        boxesSold = boxesSold + newSales;  
    }
    
    // returns name of Band Booster
    public String getName() {
        return name;
    }
    
    // returns name and # of boxes sold
    public String toString() {
        return name + ": " + boxesSold + " boxes";
    }
}
