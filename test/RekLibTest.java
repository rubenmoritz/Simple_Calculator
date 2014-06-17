
import calculator.LibCalculator;
import static org.junit.Assert.*;
import org.junit.Test;

public class RekLibTest {

    private final Double INPUT_1 = 1.0;
    private final Double INPUT_2 = 2.0;
    private final Double INPUT_0 = 0.0;
    private final Double SOM = 3.0;
    private final Double VERSCHIL = -1.0;
    private final Double MODULO = 1.0;
    private final Double PRODUCT = 2.0;
    private final Double QUOT = 2.0;
    private final Double QUOT2 = 0.5;

    @Test
    public void somTest() {
        LibCalculator r = new LibCalculator();
        Double uit = r.som(INPUT_1, INPUT_2);
        assertEquals(SOM, uit);
    }

    @Test
    public void verschilTest() {
        LibCalculator r = new LibCalculator();
        Double uit = r.verschil(INPUT_1, INPUT_2);
        assertEquals(VERSCHIL, uit);
    }

    @Test
    public void productTest() {
        LibCalculator r = new LibCalculator();
        Double uit = r.product(INPUT_1, INPUT_2);
        assertEquals(PRODUCT, uit);
    }

    @Test
    public void moduloTest() {
        LibCalculator r = new LibCalculator();
        try {
            Double uit = r.modulo(INPUT_2, INPUT_1);
            assertEquals(INPUT_0, uit);
            uit = r.modulo(INPUT_1, INPUT_2);
            assertEquals(INPUT_1, uit);
        } catch (Exception e) {
            fail();
        }

        try {
            Double uit = r.modulo(INPUT_2, INPUT_0);
        } catch (Exception e) {
            assertTrue(true);
        }
    }

    @Test
    public void quotientTest() {
        LibCalculator r = new LibCalculator();
        try {
            Double uit = r.quotient(INPUT_2, INPUT_1);
            assertEquals(QUOT, uit);
            uit = r.quotient(INPUT_1, INPUT_2);
            assertEquals(QUOT2, uit);
        } catch (Exception e) {
            fail();
        }
    }

    @Test
    public void quotientTestException() throws Exception {
        LibCalculator r = new LibCalculator();
        Double uit = r.quotient(INPUT_2, INPUT_0);
    }
}
