package prepare.datastructures;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WaiterTest {

    @Test
    void waiterTestCase0() {
        List<Integer> input = Stream.of(3, 4, 7, 6, 5).collect(Collectors.toList());
        int q = 1;
        List<Integer> expectedOutput = List.of(4, 6, 3, 7, 5);

        assertEquals(expectedOutput, Waiter.waiter(input, q));
    }

    @Test
    void waiterTestCase1() {
        List<Integer> input = Stream.of(3, 3, 4, 4, 9).collect(Collectors.toList());
        int q = 2;
        List<Integer> expectedOutput = List.of(4, 4, 9, 3, 3);

        assertEquals(expectedOutput, Waiter.waiter(input, q));
    }

    @Test
    void waiterTestCase2() {
        List<Integer> input = Stream.of(80, 37, 86, 79, 8, 39, 43, 41, 15, 33, 30, 15, 45, 55, 61, 74,
                49, 49, 20, 66, 77, 19, 85, 44, 81, 82, 27, 5, 36, 83, 91, 45, 39, 44, 19, 44, 71, 49, 8, 66,
                81, 40, 29, 60, 35, 31, 44).collect(Collectors.toList());
        int q = 21;
        List<Integer> expectedOutput = List.of(80, 86, 8, 30, 74, 20, 66, 44, 82, 36, 44, 44, 8, 66,
                40, 60, 44, 81, 39, 45, 27, 81, 45, 15, 33, 15, 39, 55, 85, 5, 35, 49, 91, 77, 49, 49, 19, 19,
                29, 31, 37, 41, 43, 61, 71, 79, 83);

        assertEquals(expectedOutput, Waiter.waiter(input, q));
    }
}