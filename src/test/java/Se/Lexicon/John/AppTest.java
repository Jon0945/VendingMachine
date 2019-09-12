package Se.Lexicon.John;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AppTest {
    VendingMachine MyMachine = new VendingMachine();

    @Before
    public void setup() {
        MyMachine.setMoneyPool(0);
        MyMachine.stockMachine();
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

    @Test
    public void testProductDescription() {
        //Arrange
        String expectedResult = MyMachine.getIndexOfMachineContent(1).productInformation();

        //Act
        String actualResult = MyMachine.getDescription(1);

        //Assert
        assertEquals(expectedResult,actualResult);
    }



    @Test
    public void testProductRequest() {
        //Arrange
        MyMachine.setMoneyPool(20);
        int expectedResult = 5;

        //Act
        MyMachine.productRequest(1);

        //Assert
        assertEquals(expectedResult,MyMachine.getMoneyPool());
    }
}

