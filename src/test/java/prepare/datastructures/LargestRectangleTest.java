package prepare.datastructures;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LargestRectangleTest {

    @Test
    void largestRectangleTestCase0() {
        List<Integer> input = List.of(1, 2, 3, 4, 5);
        int expectedResult = 9;

        assertEquals(expectedResult, LargestRectangle.largestRectangle(input));
    }

    @Test
    void largestRectangleTestCase1() {
        List<Integer> input = List.of(1, 3, 5, 9, 11);
        int expectedResult = 18;

        assertEquals(expectedResult, LargestRectangle.largestRectangle(input));
    }

    @Test
    void largestRectangleTestCase2() {
        List<Integer> input = List.of(11, 11, 10, 10, 10);
        int expectedResult = 50;

        assertEquals(expectedResult, LargestRectangle.largestRectangle(input));
    }
}