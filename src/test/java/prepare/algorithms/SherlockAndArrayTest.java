package prepare.algorithms;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SherlockAndArrayTest {

    @Test
    void balancedSumsTestCase0() {
        List<Integer> input = Stream.of(1, 2, 3).collect(Collectors.toList());
        String expectedResult = "NO";

        assertEquals(expectedResult, SherlockAndArray.balancedSums(input));

        input = Stream.of(1, 2, 3, 3).collect(Collectors.toList());
        expectedResult = "YES";

        assertEquals(expectedResult, SherlockAndArray.balancedSums(input));
    }

    @Test
    void balancedSumsTestCase1() {
        List<Integer> input = Stream.of(1, 1, 4, 1, 1).collect(Collectors.toList());
        String expectedResult = "YES";

        assertEquals(expectedResult, SherlockAndArray.balancedSums(input));

        input = Stream.of(2, 0, 0, 0).collect(Collectors.toList());
        expectedResult = "YES";

        assertEquals(expectedResult, SherlockAndArray.balancedSums(input));

        input = Stream.of(0, 0, 2, 0).collect(Collectors.toList());
        expectedResult = "YES";

        assertEquals(expectedResult, SherlockAndArray.balancedSums(input));
    }
}