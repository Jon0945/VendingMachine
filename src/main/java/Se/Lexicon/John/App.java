package Se.Lexicon.John;

public class App
{
    public static void main( String[] args )
    {
        VendingMachine testMachine = new VendingMachine();
        testMachine.setMoneyPool(100);
        testMachine.endSession();
        System.out.println("You get "+testMachine.getChange() +" SEK back and leave the vending machine"  );
    }
}
