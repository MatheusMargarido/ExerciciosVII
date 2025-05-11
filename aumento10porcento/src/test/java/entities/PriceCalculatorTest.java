package entities;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PriceCalculatorTest {
    @Test
    void testPrecoValido() {
        assertEquals(110.0, PriceCalculator.aplicarAcrescimo(100.0));
    }

    @Test
    void testPrecoInvalido() {
        assertThrows(IllegalArgumentException.class, () -> PriceCalculator.aplicarAcrescimo(0));
        assertThrows(IllegalArgumentException.class, () -> PriceCalculator.aplicarAcrescimo(-50));
    }
}
