import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void testSabiranje() {
        String rezultat = Calculator.Run("2+3");
        assertEquals("5.0", rezultat);
    }
}
