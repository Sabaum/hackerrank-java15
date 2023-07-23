package prepare.algorithms;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NonDivisibleSubsetTest {

    @Test
    void nonDivisibleSubsetTestCase0() {
        int k = 3;
        List<Integer> input = List.of(1, 7, 2, 4);
        Integer expectedResult = 3;

        assertEquals(expectedResult, NonDivisibleSubset.nonDivisibleSubset(k, input));
    }

    @Test
    void nonDivisibleSubsetTestCase1() {
        int k = 7;
        List<Integer> input = List.of(278, 576, 496, 727, 410, 124, 338, 149, 209, 702, 282, 718, 771, 575, 436);
        Integer expectedResult = 11;

        assertEquals(expectedResult, NonDivisibleSubset.nonDivisibleSubset(k, input));
    }
}