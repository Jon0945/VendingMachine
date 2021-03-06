package Se.Lexicon.John.models;

public abstract class Product {
    //Static Field
    private static int productCounter = 0;
    //Fields
    private int productnumber;
    private String itemName;
    private int itemCost;
    private int itemCalorieCount;

    //Getters & Setters
    public int getProductnumber() { return productnumber; }
    public String getItemName() { return itemName; }
    public void setItemName(String itemName) { this.itemName = itemName; }
    public int getItemCost() { return itemCost; }
    public void setItemCost(int itemCost) { this.itemCost = itemCost; }
    public int getItemCalorieCount() { return itemCalorieCount; }
    public void setItemCalorieCount(int itemCalorieCount) { this.itemCalorieCount = itemCalorieCount; }

    //Constructor
    public Product(String itemName, int itemCost, int itemCalorieCount) {
        productnumber = ++productCounter;
        this.itemName = itemName;
        this.itemCost = itemCost;
        this.itemCalorieCount = itemCalorieCount;
    }

    public String productInformation () {
        StringBuilder productInfo = new StringBuilder();
        productInfo.append("-- Product Information --").append("\n");
        productInfo.append("Productnumber: ").append(getProductnumber()).append("\n");
        productInfo.append("Product name: ").append(getItemName()).append("\n");
        productInfo.append("Cost (SEK): ").append(getItemCost()).append("\n");
        productInfo.append("Calories per 100 g: ").append(getItemCalorieCount()).append("\n");
        return productInfo.toString();
    }
}

