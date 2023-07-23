package prepare.algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StrangeCounterTest {

    @Test
    void strangeCounterTestCase0() {
        long input = 4;
        long expectedResult = 6;

        assertEquals(expectedResult, StrangeCounter.strangeCounter(input));
    }

    @Test
    void strangeCounterTestCase1() {
        long input = 17;
        long expectedResult = 5;

        assertEquals(expectedResult, StrangeCounter.strangeCounter(input));
    }
}