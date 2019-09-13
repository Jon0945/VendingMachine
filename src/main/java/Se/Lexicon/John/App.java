package Se.Lexicon.John;

import java.util.Arrays;

public class App
{
    public static void main( String[] args )
    {
        VendingMachine testMachine = new VendingMachine();
        testMachine.stockMachine();
        System.out.println(Arrays.toString(testMachine.getProducts()));

    }


}
