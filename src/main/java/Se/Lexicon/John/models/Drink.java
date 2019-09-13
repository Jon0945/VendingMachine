package Se.Lexicon.John.models;

public class Drink extends Product {
    private int canSize;
    private boolean isCarbonated;

    public Drink (String itemName, int itemCost, int caloriecount, int canSize, boolean isCarbonated ) {
        super (itemName,itemCost,caloriecount);
        this.canSize = canSize;
        this.isCarbonated = isCarbonated;
    }

    @Override
    public String productInformation () {
        StringBuilder productInfo = new StringBuilder();
        productInfo.append("-- Product Information --").append("\n");
        productInfo.append("Productnumber: ").append(getProductnumber()).append("\n");
        productInfo.append("Product name: ").append(getItemName()).append("\n");
        productInfo.append("Cost (SEK): ").append(getItemCost()).append("\n");
        productInfo.append("Calories per 100 g: ").append(getItemCalorieCount()).append("\n");
        productInfo.append("Can size (ml): ").append(canSize).append("\n");
        productInfo.append("Carbonated: ").append(isCarbonated ? "Yes" : "No").append("\n");
        return productInfo.toString();
    }

    @Override
    public String toString() {
        return "\nProductnumber: " + getProductnumber() +
                "\nName " + getItemName();

    }
}



