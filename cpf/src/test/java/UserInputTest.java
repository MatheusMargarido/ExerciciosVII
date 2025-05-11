import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import entities.UserInput;

public class UserInputTest {
    @Test
    void testValidName() {
        assertTrue(UserInput.isValidName("João"));
        assertFalse(UserInput.isValidName(""));
        assertFalse(UserInput.isValidName("  "));
    }

    @Test
    void testValidCPF() {
        assertTrue(UserInput.isValidCPF("12345678901"));
        assertFalse(UserInput.isValidCPF("1234567890"));
    }

    @Test
    void testValidAge() {
        assertTrue(UserInput.isValidAge(30));
        assertFalse(UserInput.isValidAge(-1));
        assertFalse(UserInput.isValidAge(130));
    }
}
	