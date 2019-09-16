package Se.Lexicon.John;
import static org.junit.Assert.*;
import Se.Lexicon.John.models.Drink;
import Se.Lexicon.John.models.Product;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

public class ProductTest {
    private Product testProduct;
    private final String testName = "Test Product";
    private final int testItemCost = 25;
    private final int testCalorieCount = 50;

    @Before
    public void makeProduct() {
        testProduct = new Product(testName, testItemCost, testCalorieCount) {
        };
    }

    @Test
    public void testBeforeWorks()
    {
        //Arrange
        String expectedName = testName;
        int expectedItemCost = testItemCost;
        int expectedCalorieCount = testCalorieCount;

        //Act
        // done by @Before

        //Assert
        assertTrue(testProduct.getProductnumber() > 0);
        assertEquals(expectedName, testProduct.getItemName());
        assertEquals(expectedItemCost,testProduct.getItemCost());
        assertEquals(expectedCalorieCount, testProduct.getItemCalorieCount(), 0);

    }

    @Test
    public void testSetItemName() {
        //Arrange
        String itemname = "Testy Mc Product";

        //Act
        testProduct.setItemName(itemname);

        //Assert
        assertEquals(itemname, testProduct.getItemName());
    }

    @Test
    public void testSetItemCost() {
        //Arrange
        int itemcost = 35;

        //Act
        testProduct.setItemCost(itemcost);

        //Assert
        assertEquals(itemcost, testProduct.getItemCost());
    }

    @Test
    public void testSetCalorieCount() {
        //Arrange
        int caloriecount = 44;

        //Act
        testProduct.setItemCalorieCount(caloriecount);

        //Assert
        assertEquals(caloriecount, testProduct.getItemCalorieCount());
    }

    @Test
    public void ProductContainsData() {

        //Act
        String result = testProduct.productInformation();

        //Assert
        assertTrue(result.contains(String.valueOf(testCalorieCount)));
        assertTrue(result.contains(String.valueOf(testItemCost)));
        assertTrue(result.contains(testName));
    }


}

