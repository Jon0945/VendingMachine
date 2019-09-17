package Se.Lexicon.John.models;

public class Sweet extends Product {
    private String sweetType;
    private String sweetFlavor;
    private int bagweight;
    private boolean isSugarFree;

    public Sweet(String itemName, int itemCost, int caloriecount, String sweetType, String sweetFlavor, int bagweight, boolean isSugarFree) {
        super(itemName, itemCost, caloriecount);
        this.sweetType = sweetType;
        this.sweetFlavor = sweetFlavor;
        this.bagweight = bagweight;
        this.isSugarFree = isSugarFree;
    }

    //Getters & Setters
    public String getSweetType() { return sweetType; }
    public void setSweetType(String sweetType) { this.sweetType = sweetType; }
    public String getSweetFlavor() { return sweetFlavor; }
    public void setSweetFlavor(String sweetFlavor) { this.sweetFlavor = sweetFlavor; }
    public int getBagweight() { return bagweight; }
    public void setBagweight(int bagweight) { this.bagweight = bagweight; }
    public boolean isSugarFree() { return isSugarFree; }
    public void setSugarFree(boolean sugarFree) { isSugarFree = sugarFree; }

    @Override
    public String productInformation() {
        StringBuilder productInfo = new StringBuilder();
        productInfo.append("-- Product Information --").append("\n");
        productInfo.append("Productnumber: ").append(getProductnumber()).append("\n");
        productInfo.append("Product name: ").append(getItemName()).append("\n");
        productInfo.append("Cost (SEK): ").append(getItemCost()).append("\n");
        productInfo.append("Calories per 100 g: ").append(getItemCalorieCount()).append("\n");
        productInfo.append("Type of Sweet: ").append(sweetType).append("\n");
        productInfo.append("Flavor: ").append(sweetFlavor).append("\n");
        productInfo.append("Bag size (g): ").append(bagweight).append("\n");
        productInfo.append("Sugarfree: ").append(isSugarFree ? "Yes" : "No").append("\n");
        return productInfo.toString();
    }

    @Override
    public String toString() {
        return "\nProductnumber: " + getProductnumber() +
                "\nName: " + getItemName();

    }
}


