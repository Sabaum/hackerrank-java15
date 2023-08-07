package prepare.algorithms;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PickingNumbersTest {

    @Test
    void pickingNumbersTestCase0() {
        List<Integer> input = List.of(4, 6, 5, 3, 3, 1);
        int expectedResult = 3;

        assertEquals(expectedResult, PickingNumbers.pickingNumbers(input));
    }

    @Test
    void pickingNumbersTestCase1() {
        List<Integer> input = List.of(1, 2, 2, 3, 1, 2);
        int expectedResult = 5;

        assertEquals(expectedResult, PickingNumbers.pickingNumbers(input));
    }
}