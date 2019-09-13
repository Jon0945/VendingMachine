package Se.Lexicon.John;

import Se.Lexicon.John.models.Drink;
import Se.Lexicon.John.models.IVendingMachine;
import Se.Lexicon.John.models.Product;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class VendingMachine implements IVendingMachine {
    //Fields
    private int moneyPool;
    private int change;
    private Product[] machineContent = new Product[2];
    private int[] acceptedDenominations = {1, 5, 10, 20, 50, 100, 500, 1000};

    //Getters and Setters
    public int getMoneyPool() { return moneyPool; }
    public void setMoneyPool(int moneyPool) { this.moneyPool = moneyPool; }
    public int getChange() { return change; }
    public void setChange(int change) { this.change = change; }
    public int getMachineContentLenght() {return machineContent.length;}
    public Product getIndexOfMachineContent(int num) { return machineContent[num - 1]; }


    //Constructor
    public VendingMachine() { }

    public void stockMachine() {
        machineContent[0] = new Drink("Coca Cola", 15, 42, 330, true);
        machineContent[1] = new Drink("Festis Apelsin", 20, 40, 500, false);

    }

    @Override
    public void addCurrency(int amount) {
        for (int x : acceptedDenominations) {
            if (amount == x) {
                    setMoneyPool(moneyPool + amount);
                    break;
            }
        }
    }

    @Override
    public int endSession() {
        setChange(getMoneyPool());
        setMoneyPool(0);
        return change;
    }

    @Override
    public Product productRequest(int productNumber) {
        setMoneyPool (getMoneyPool() - (machineContent[productNumber-1].getItemCost()));
        return machineContent[productNumber-1];
    }

    @Override
    public String getDescription(int productnumber) {
        return  machineContent[productnumber-1].productInformation();
    }

    @Override
    public int getBalance() {
        return moneyPool;
    }

    @Override
    public String[] getProducts() {
        String[] result = new String[machineContent.length];
        for (int i = 0; i < machineContent.length; i++) {
            result[i] = machineContent[i]+"\n";

        }
        return result;
    }


}









