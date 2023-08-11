package prepare.algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SuperReducedStringTest {

    @Test
    void superReducedStringTestCase0() {
        String input = "aaabccddd";
        String expectedOutput = "abd";

        assertEquals(expectedOutput, SuperReducedString.superReducedString(input));
    }

    @Test
    void superReducedStringTestCase1() {
        String input = "aa";
        String expectedOutput = "Empty String";

        assertEquals(expectedOutput, SuperReducedString.superReducedString(input));
    }

    @Test
    void superReducedStringTestCase2() {
        String input = "baab";
        String expectedOutput = "Empty String";

        assertEquals(expectedOutput, SuperReducedString.superReducedString(input));
    }
}