package prepare.datastructures;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EqualStacksTest {

    @Test
    void equalStacks() {
        List<Integer> stack1 = Stream.of(3, 2, 1, 1, 1).collect(Collectors.toList());
        List<Integer> stack2 = Stream.of(4, 3, 2).collect(Collectors.toList());
        List<Integer> stack3 = Stream.of(1, 1, 4, 1).collect(Collectors.toList());
        Integer expectedResult = 5;

        assertEquals(expectedResult, EqualStacks.equalStacks(stack1, stack2, stack3));
    }
}