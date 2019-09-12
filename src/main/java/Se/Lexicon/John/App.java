package Se.Lexicon.John;

public class App
{
    public static void main( String[] args )
    {
        VendingMachine testMachine = new VendingMachine();
        testMachine.stockMachine();
        System.out.println(testMachine.getDescription(1));

    }


}
