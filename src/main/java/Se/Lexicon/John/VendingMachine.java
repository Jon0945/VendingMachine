package Se.Lexicon.John;

import Se.Lexicon.John.models.Drink;
import Se.Lexicon.John.models.IVendingMachine;
import Se.Lexicon.John.models.Product;
import Se.Lexicon.John.models.Snacks;
import Se.Lexicon.John.models.Sweet;

import java.util.Arrays;
import java.util.List;


public class VendingMachine implements IVendingMachine {
    //Fields
    private int moneyPool;
    private int change;
    private Product[] machineContent = new Product[8];
    private int[] acceptedDenominations = {1, 5, 10, 20, 50, 100, 500, 1000};

    //Getters and Setters
    public int getMoneyPool() { return moneyPool; }
    public void setMoneyPool(int moneyPool) { this.moneyPool = moneyPool; }
    public int getChange() { return change; }
    public void setChange(int change) { this.change = change; }
    public int getMachineContentLenght() { return machineContent.length; }

    //Constructor
    public VendingMachine() {
    }

    //Stocks the machine with Product objects
    public void stockMachine() {
        machineContent[0] = new Drink("Coca Cola", 15, 42, 330, true);
        machineContent[1] = new Drink("Festis Apelsin", 20, 40, 500, false);
        machineContent[2] = new Snacks("Estrella Salt & Vinegar Chips", 10, 138, "Chips", 75, true);
        machineContent[3] = new Snacks("Bag of Candied Almonds", 30, 474, "Nuts", 75, false);
        machineContent[4] = new Snacks("Bag of Dried Fruit Mix", 24, 275, "Fruit", 100, false);
        machineContent[5] = new Sweet("Extra Chewing Gum",12,247,"Chewing Gum","Cool Mint",30,true);
        machineContent[6] = new Sweet("Kungen av Dannmark",25,395,"Hard Candy","Anise",140,false);
        machineContent[7] = new Sweet("Haribo Matador Mix",19,339,"Soft Candy","Fruit/Liquorice",120,false);
    }

    //Adds money to the moneypool if a valid amount
    @Override
    public void addCurrency(int amount) {
        for (int x : acceptedDenominations) {
            if (amount == x) {
                setMoneyPool(moneyPool + amount);
                break;
            }
        }
    }

    //Ends vending machine session and returns change
    @Override
    public int endSession() {
        setChange(getMoneyPool());
        setMoneyPool(0);
        return change;
    }

    //"Buys" a product based on product number
    @Override
    public Product productRequest(int productNumber) {
        if (moneyPool > machineContent[productNumber -1].getItemCost()) {
            setMoneyPool(getMoneyPool() - (machineContent[productNumber - 1].getItemCost()));
            return machineContent[productNumber - 1];
        }
        else {
            return null;
        }
    }

    //Returns detailed description based on productnumber
    @Override
    public String getDescription(int productnumber) {
        return machineContent[productnumber - 1].productInformation();
    }

    //Shows how much is in the moneypool
    @Override
    public int getBalance() {
        return moneyPool;
    }

    //Returns a list of productnumber and products in the machine
    @Override
    public List getProducts() { return Arrays.asList(machineContent); }
}











