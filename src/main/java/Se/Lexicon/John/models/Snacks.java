package Se.Lexicon.John.models;

public class Snacks extends Product {
    private String snackItemType;
    private int bagweight;
    private boolean isSalted;

    public Snacks(String itemName, int itemCost, int caloriecount, String snackItemType, int bagweight, boolean isSalted)
    {
        super(itemName, itemCost, caloriecount);
        this.snackItemType = snackItemType;
        this.bagweight = bagweight;
        this.isSalted = isSalted;
    }

    //Getters & Setters
    public String getSnackItemType () { return snackItemType; }
    public void setSnackItemType ( String snackitemtype){ this.snackItemType = snackitemtype; }
    public int getBagweight() { return bagweight; }
    public void setBagweight(int bagweight) { this.bagweight = bagweight; }
    public boolean isSalted () { return isSalted; }
    public void setCarbonated ( boolean salted){ isSalted = salted; }

    @Override
    public String productInformation () {
        StringBuilder productInfo = new StringBuilder();
        productInfo.append("-- Product Information --").append("\n");
        productInfo.append("Productnumber: ").append(getProductnumber()).append("\n");
        productInfo.append("Product name: ").append(getItemName()).append("\n");
        productInfo.append("Cost (SEK): ").append(getItemCost()).append("\n");
        productInfo.append("Calories per 100 g: ").append(getItemCalorieCount()).append("\n");
        productInfo.append("Type of Snack: ").append(snackItemType).append("\n");
        productInfo.append("Bag size (g): ").append(bagweight).append("\n");
        productInfo.append("Flavor: ").append(isSalted ? "Salty" : "Sweet").append("\n");
        return productInfo.toString();
    }

    @Override
    public String toString () {
        return "\nProductnumber: " + getProductnumber() +
                "\nName " + getItemName();

    }

}
