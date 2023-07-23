package prepare.datastructures;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ArraysDSTest {

    /**
     * Input (stdin)
     * 4
     * 1 4 3 2
     */
    @Test
    void reverseArray() {
        List<Integer> input = Stream.of(1, 4, 3, 2).collect(Collectors.toList());
        List<Integer> expectedResult = List.of(2, 3, 4, 1);

        assertEquals(expectedResult, ArraysDS.reverseArray(input));
    }
}