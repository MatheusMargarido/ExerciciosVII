package entities;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class TemperatureConverterTest {
	@Test
	void testConversao() {
		assertEquals(0.0, TemperatureConverter.fahrenheitToCelsius(32), 0.001);
		assertEquals(100.0, TemperatureConverter.fahrenheitToCelsius(212), 0.001);
	}
}
