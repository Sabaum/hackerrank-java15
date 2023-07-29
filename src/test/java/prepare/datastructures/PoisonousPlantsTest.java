package prepare.datastructures;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PoisonousPlantsTest {

    @Test
    void poisonousPlantsTestCase0() {
        List<Integer> input = Stream.of(6, 5, 8, 4, 7, 10, 9).collect(Collectors.toList());
        Integer expectedResult = 2;

        assertEquals(expectedResult, PoisonousPlants.poisonousPlants(input));
    }

    @Test
    void poisonousPlantsTestCase1() {
        List<Integer> input = Stream.of(3, 2, 5, 4).collect(Collectors.toList());
        Integer expectedResult = 2;

        assertEquals(expectedResult, PoisonousPlants.poisonousPlants(input));
    }

    @Test
    void poisonousPlantsTestCase2() {
        List<Integer> input = Stream.of(4, 3, 7, 5, 6, 4, 2).collect(Collectors.toList());
        Integer expectedResult = 3;

        assertEquals(expectedResult, PoisonousPlants.poisonousPlants(input));
    }
}