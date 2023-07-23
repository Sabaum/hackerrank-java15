package prepare.algorithms;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SimpleArraySumTest {

    @Test
    void simpleArraySum() {
        List<Integer> input = List.of(1, 2, 3, 4, 10, 11);
        Integer expectedResult = 31;

        assertEquals(expectedResult, SimpleArraySum.simpleArraySum(input));
    }
}