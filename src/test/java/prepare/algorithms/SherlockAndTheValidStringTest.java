package prepare.algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SherlockAndTheValidStringTest {

    @Test
    void isValidTestCase0() {
        String input = "aabbcd";
        String expectedResponse = "NO";

        assertEquals(expectedResponse, SherlockAndTheValidString.isValid(input));
    }

    @Test
    void isValidTestCase1() {
        String input = "aabbccddeefghi";
        String expectedResponse = "NO";

        assertEquals(expectedResponse, SherlockAndTheValidString.isValid(input));
    }

    @Test
    void isValidTestCase2() {
        String input = "abcdefghhgfedecba";
        String expectedResponse = "YES";

        assertEquals(expectedResponse, SherlockAndTheValidString.isValid(input));
    }
}
