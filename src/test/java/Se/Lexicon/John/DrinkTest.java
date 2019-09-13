package Se.Lexicon.John;
import static org.junit.Assert.*;

import Se.Lexicon.John.models.Drink;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DrinkTest {
    private Drink testDrink;
    private final String testName = "Test Drink";
    private final int testItemCost = 50;
    private final int testCalorieCount = 40;
    private final int testCanSize = 500;
    private final boolean testIsCarbonate = true;

    @Before
    public void fillDrink() {
        testDrink = new Drink (testName,testItemCost,testCalorieCount,testCanSize,testIsCarbonate);
    }

    @After
    public void emptyDrink() {
        testDrink = null;
    }

    @Test
    public void testBeforeWorks()
    {
        //Arrange
        String expectedName = testName;
        int expectedItemCost = testItemCost;
        int expectedCalorieCount = testCalorieCount;
        int expectedCanSize = testCanSize;
        boolean expectedIsCarbonate = testIsCarbonate;

        //Act
        // done by @Before

        //Assert
        assertTrue(testDrink.getProductnumber() > 0);
        assertEquals(expectedName, testDrink.getItemName());
        assertEquals(expectedItemCost,testDrink.getItemCost());
        assertEquals(expectedCalorieCount, testDrink.getItemCalorieCount(), 0);
        assertEquals(expectedCanSize, testDrink.getCanSize());
        assertEquals(expectedIsCarbonate, testDrink.isCarbonated());
    }

    @Test
    public void setTestCanSize() {
        //Arrange
        int cansize = 250;

        //Act
        testDrink.setCanSize(cansize);

        //Assert
        assertEquals(cansize, testDrink.getCanSize());
    }

    @Test
    public void setTestIsCarbonate() {
        //Arrange
        boolean carbonate = true;

        //Act
        testDrink.setCarbonated(carbonate);

        //Assert
        assertEquals(carbonate, testDrink.isCarbonated());
    }

    @Test
    public void ProductContainsData() {

        //Act
        String result = testDrink.productInformation();

        //Assert
        assertTrue(result.contains(testDrink.isCarbonated() ? "Yes" : "No"));
        assertTrue(result.contains(String.valueOf(testCanSize)));
        assertTrue(result.contains(String.valueOf(testCalorieCount)));
        assertTrue(result.contains(String.valueOf(testItemCost)));
        assertTrue(result.contains(testName));
    }
}



