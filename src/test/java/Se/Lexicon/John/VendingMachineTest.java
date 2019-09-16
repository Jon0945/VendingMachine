package Se.Lexicon.John;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

public class VendingMachineTest
{
    VendingMachine MyMachine;

    @Before
    public void setup() {
        MyMachine = new VendingMachine();
        MyMachine.setMoneyPool(0);
        MyMachine.stockMachine();
    }

    @Test
    public void testAddCurrency_correctAmount() {

        //Arrange
        int expectedResult = 500;

        //Act
        MyMachine.addCurrency(500);

        //Arrange
        assertEquals(expectedResult, MyMachine.getMoneyPool(), 0);
    }

    @Test
    public void testAddCurrency_wrongAmount() {
        //Arrange
        int expectedResult = 0;

        //Act
        MyMachine.addCurrency(300);

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
    public void testProductRequest() {
        //Arrange
        MyMachine.setMoneyPool(20);
        int expectedResult = 5;

        //Act
        MyMachine.productRequest(1);

        //Assert
        assertEquals(expectedResult,MyMachine.getMoneyPool());
    }

    @Test
    public void testGetProducts() {
        //Act
        String[] result = MyMachine.getProducts();

        //Assert
        assertEquals(result.length,MyMachine.getMachineContentLenght());
        assertTrue(Arrays.toString(result).contains("Coca Cola"));
    }
}


