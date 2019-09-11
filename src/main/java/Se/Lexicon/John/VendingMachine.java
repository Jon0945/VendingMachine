package Se.Lexicon.John;
import Se.Lexicon.John.models.IVendingMachine;
import Se.Lexicon.John.models.Product;

public class VendingMachine implements IVendingMachine {
    //Fields
    private int moneyPool;
    private int change;

    //Getters and Setters
    public int getMoneyPool() { return moneyPool; }
    public void setMoneyPool(int moneyPool) { this.moneyPool = moneyPool; }
    public int getChange() { return change; }
    public void setChange(int change) { this.change = change; }

    //Constructor
    public VendingMachine() {}

    @Override
    public void addCurrency(int amount) {
        setMoneyPool(moneyPool+amount);
    }

    @Override
    public int endSession() {
        setChange(getMoneyPool());
        setMoneyPool(0);
        return change;
    }

    @Override
    public String getDescription(int productnumber) {
        return null;
    }

    @Override
    public int getBalance() {
        return moneyPool;
    }


}



