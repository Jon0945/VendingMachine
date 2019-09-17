package Se.Lexicon.John;

import Se.Lexicon.John.models.Snacks;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SnackTest {
    private Snacks testSnack;
    private final String testName = "Test Snack";
    private final int testItemCost = 50;
    private final int testCalorieCount = 40;
    private final String testSnackItemType = "Chips";
    private final int testBagWeight = 120;
    private final boolean testIsSalted = true;


    @Before
    public void fillSnackBag() {
        testSnack = new Snacks (testName,testItemCost,testCalorieCount,testSnackItemType,testBagWeight,testIsSalted);
    }

    @After
    public void emptySnackBag() { testSnack = null; }

    @Test
    public void testBeforeWorks()
    {
        //Arrange
        String expectedName = testName;
        int expectedItemCost = testItemCost;
        int expectedCalorieCount = testCalorieCount;
        String expectedSnackItemType = testSnackItemType;
        int expectedBagWeight = testBagWeight;
        boolean expectedIsSalted = testIsSalted;

        //Act
        // done by @Before

        //Assert
        assertTrue(testSnack.getProductnumber() > 0);
        assertEquals(expectedName, testSnack.getItemName());
        assertEquals(expectedItemCost,testSnack.getItemCost());
        assertEquals(expectedCalorieCount, testSnack.getItemCalorieCount(), 0);
        assertEquals(expectedSnackItemType, testSnack.getSnackItemType());
        assertEquals(expectedBagWeight,testSnack.getBagweight());
        assertEquals(expectedIsSalted, testSnack.isSalted());
    }

    @Test
    public void setTestSnackItemType() {
        //Arrange
        String snacktype = "Chewing Gum";

        //Act
        testSnack.setSnackItemType(snacktype);

        //Assert
        assertEquals(snacktype, testSnack.getSnackItemType());
    }

    @Test
    public void setTestBagWeight() {
        //Arrange
        int bagweight = 120;

        //Act
        testSnack.setBagweight(bagweight);

        //Assert
        assertEquals(bagweight, testSnack.getBagweight());
    }

    @Test
    public void setTestIsSalted() {
        //Arrange
        boolean salted = true;

        //Act
        testSnack.setSalted(salted);

        //Assert
        assertEquals(salted, testSnack.isSalted());
    }

    @Test
    public void ProductContainsData() {

        //Act
        String result = testSnack.productInformation();

        //Assert
        assertTrue(result.contains(testSnack.isSalted() ? "Salty" : "Sweet"));
        assertTrue(result.contains(testSnackItemType));
        assertTrue(result.contains(String.valueOf(testBagWeight)));
        assertTrue(result.contains(String.valueOf(testCalorieCount)));
        assertTrue(result.contains(String.valueOf(testItemCost)));
        assertTrue(result.contains(testName));
    }
}

