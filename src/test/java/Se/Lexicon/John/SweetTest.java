package Se.Lexicon.John;

import Se.Lexicon.John.models.Sweet;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SweetTest {
    private Sweet testSweet;
    private final String testName = "Test Sweet";
    private final int testItemCost = 50;
    private final int testCalorieCount = 40;
    private final String testSweetType = "Hard Test Candy";
    private final String testSweetFlavor = "Test taste";
    private final int testBagWeight = 120;
    private final boolean testIsSugarFree = true;


    @Before
    public void fillSweetBag() {
        testSweet = new Sweet (testName,testItemCost,testCalorieCount,testSweetType,testSweetFlavor,testBagWeight,testIsSugarFree);
    }

    @After
    public void emptyDrink() { testSweet = null; }

    @Test
    public void testBeforeWorks()
    {
        //Arrange
        String expectedName = testName;
        int expectedItemCost = testItemCost;
        int expectedCalorieCount = testCalorieCount;
        String expectedSweetType = testSweetType;
        String expectedSweetFlavor = testSweetFlavor;
        int expectedBagWeight = testBagWeight;
        boolean expectedIsSugarFree = testIsSugarFree;

        //Act
        // done by @Before

        //Assert
        assertTrue(testSweet.getProductnumber() > 0);
        assertEquals(expectedName, testSweet.getItemName());
        assertEquals(expectedItemCost,testSweet.getItemCost());
        assertEquals(expectedCalorieCount, testSweet.getItemCalorieCount(), 0);
        assertEquals(expectedSweetType, testSweet.getSweetType());
        assertEquals(expectedSweetFlavor,testSweet.getSweetFlavor());
        assertEquals(expectedBagWeight,testSweet.getBagweight());
        assertEquals(expectedIsSugarFree, testSweet.isSugarFree());
    }

    @Test
    public void setTestSweetType() {
        //Arrange
        String sweettype = "Chewing Gum";

        //Act
        testSweet.setSweetType(sweettype);

        //Assert
        assertEquals(sweettype, testSweet.getSweetType());
    }

    @Test
    public void setTestSweetFlavor() {
        //Arrange
        String sweetflavor = "Tutti Frutti";

        //Act
        testSweet.setSweetFlavor(sweetflavor);

        //Assert
        assertEquals(sweetflavor, testSweet.getSweetFlavor());
    }


    @Test
    public void setTestBagWeight() {
        //Arrange
        int bagweight = 120;

        //Act
        testSweet.setBagweight(bagweight);

        //Assert
        assertEquals(bagweight, testSweet.getBagweight());
    }

    @Test
    public void setTestIsSugarFree() {
        //Arrange
        boolean sugarfree = true;

        //Act
        testSweet.setSugarFree(sugarfree);

        //Assert
        assertEquals(sugarfree, testSweet.isSugarFree());
    }

    @Test
    public void ProductContainsData() {

        //Act
        String result = testSweet.productInformation();

        //Assert
        assertTrue(result.contains(testSweet.isSugarFree() ? "Yes" : "No"));
        assertTrue(result.contains(testSweetType));
        assertTrue(result.contains(testSweetFlavor));
        assertTrue(result.contains(String.valueOf(testBagWeight)));
        assertTrue(result.contains(String.valueOf(testCalorieCount)));
        assertTrue(result.contains(String.valueOf(testItemCost)));
        assertTrue(result.contains(testName));
    }
}

