package prepare.algorithms;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MigratoryBirdsTest {

    @Test
    void migratoryBirdsTestCase0() {
        List<Integer> input = List.of(1, 4, 4, 4, 5, 3);
        Integer expectedResult = 4;

        assertEquals(expectedResult, MigratoryBirds.migratoryBirds(input));
    }

    @Test
    void migratoryBirdsTestCase1() {
        List<Integer> input = List.of(1, 2, 3, 4, 5, 4, 3, 2, 1, 3, 4);
        Integer expectedResult = 3;

        assertEquals(expectedResult, MigratoryBirds.migratoryBirds(input));
    }

}