package Se.Lexicon.John;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AppTest {
    VendingMachine MyMachine = new VendingMachine();

    @Before
    public void setup() {
        MyMachine.setMoneyPool(0);
    }

    @Test
    public void testAddCurrency() {

        //Arrange
        int expectedResult = 500;

        //Act
        MyMachine.addCurrency(500);

        //Arrange
        assertEquals(expectedResult, MyMachine.getMoneyPool(), 0);
    }

    @Test
    public void testGetBalance() {

        //Arrange
        int expectedResult = 500;
        MyMachine.setMoneyPool(500);

        //Assert
        assertEquals(expectedResult,MyMachine.getBalance(),0);
    }

    @Test
    public void testEndSession() {

        //Arrange
        MyMachine.setMoneyPool(100);
        int expectedResult = 100;

        //Act
        MyMachine.endSession();

        //Assert
        assertEquals(MyMachine.getChange(),expectedResult,0);
        assertNotEquals(MyMachine.getMoneyPool(),expectedResult,0);
    }
}
