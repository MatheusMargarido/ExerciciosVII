package entities;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MediaCalculatorTest {
    @Test
    void testMedia() {
        assertEquals(5.0, MediaCalculator.calcularMedia(4, 6));
        assertEquals(2.5, MediaCalculator.calcularMedia(2, 3));
    }
}
