package Se.Lexicon.John;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

import java.util.Arrays;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        String[] test = {"Test"};
        App.main(test);
        assertTrue(Arrays.toString(test).contains("Test"));
    }
}