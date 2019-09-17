package Se.Lexicon.John.models;

import java.util.List;

public interface IVendingMachine {
    void addCurrency(int amount); //Add to the deposit pool
    Product productRequest(int productNumber); //Buy a product
    int endSession(); //Return change and reset deposit pool
    String getDescription(int productNumber); //View a product description
    int getBalance(); //Return the deposit pool amount
    List getProducts(); //Returns all names and produkt numbers
}
