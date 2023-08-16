package prepare.algorithms;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PairsTest {

    @Test
    void pairsTestCase0() {
        List<Integer> input = List.of(1, 5, 3, 4, 2);
        int k = 2;
        int expectedResult = 3;

        assertEquals(expectedResult, Pairs.pairs(k, input));
    }

    @Test
    void pairsTestCase1() {
        List<Integer> input = List.of(363374326, 364147530, 61825163, 1073065718, 1281246024, 1399469912, 428047635, 491595254, 879792181, 1069262793);
        int k = 1;
        int expectedResult = 0;

        assertEquals(expectedResult, Pairs.pairs(k, input));
    }

    @Test
    void pairsTestCase2() {
        List<Integer> input = List.of(1, 3, 5, 8, 6, 4, 2);
        int k = 2;
        int expectedResult = 5;

        assertEquals(expectedResult, Pairs.pairs(k, input));
    }
}