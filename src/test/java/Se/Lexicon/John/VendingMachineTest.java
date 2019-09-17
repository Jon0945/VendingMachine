package Se.Lexicon.John;

import static org.junit.Assert.*;

import Se.Lexicon.John.models.Product;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

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
    public void testProductRequestNotEnoughMoney() {
        //Arrange
        MyMachine.setMoneyPool(20);
        int expectedResult = 20;

        //Act
        MyMachine.productRequest(4);

        //Assert
        assertEquals(expectedResult, MyMachine.getMoneyPool());
    }

    @Test
    public void testGetProducts() {
        //Act
        List result = MyMachine.getProducts();

        //Assert
        assertEquals(result.size(),MyMachine.getMachineContentLenght());
        assertTrue(result.toString().contains("Coca Cola"));
    }

    @Test
    public void testProductInformation() {
        //Act
        String result = MyMachine.getDescription(1);

        //Assert
        assertTrue(result.contains("Coca Cola"));
        assertTrue(result.contains("15"));
        assertTrue(result.contains("42"));
        assertTrue(result.contains("330"));
        assertTrue(result.contains("Yes"));
    }
}



