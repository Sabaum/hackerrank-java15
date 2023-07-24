package prepare.algorithms;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DivisibleSumPairsTest {

    @Test
    void divisibleSumPairs() {
        int k = 3;
        List<Integer> input = List.of(1, 3, 2, 6, 1, 2);
        Integer expectedResult = 5;

        assertEquals(expectedResult, DivisibleSumPairs.divisibleSumPairs(input.size(), k, input));
    }
}