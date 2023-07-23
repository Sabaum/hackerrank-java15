package prepare.datastructures;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TwoDimentionalArraysDSTest {

    @Test
    void hourglassSumTestCase0() {
        List<Integer> line1 = List.of(1, 1, 1, 0, 0, 0);
        List<Integer> line2 = List.of(0, 1, 0, 0, 0, 0);
        List<Integer> line3 = List.of(1, 1, 1, 0, 0, 0);
        List<Integer> line4 = List.of(0, 0, 2, 4, 4, 0);
        List<Integer> line5 = List.of(0, 0, 0, 2, 0, 0);
        List<Integer> line6 = List.of(0, 0, 1, 2, 4, 0);

        List<List<Integer>> input = List.of(line1, line2, line3, line4, line5, line6);
        Integer expectedResult = 19;

        assertEquals(expectedResult, TwoDimentionalArraysDS.hourglassSum(input));
    }

    @Test
    void hourglassSumTestCase1() {
        List<Integer> line1 = List.of(1, 1, 1, 0, 0, 0);
        List<Integer> line2 = List.of(0, 1, 0, 0, 0, 0);
        List<Integer> line3 = List.of(1, 1, 1, 0, 0, 0);
        List<Integer> line4 = List.of(0, 9, 2, -4, -4, 0);
        List<Integer> line5 = List.of(0, 0, 0, -2, 0, 0);
        List<Integer> line6 = List.of(0, 0, -1, -2, -4, 0);

        List<List<Integer>> input = List.of(line1, line2, line3, line4, line5, line6);
        Integer expectedResult = 13;

        assertEquals(expectedResult, TwoDimentionalArraysDS.hourglassSum(input));
    }

    @Test
    void hourglassSumTestCase2() {
        List<Integer> line1 = List.of(-9, -9, -9, 1, 1, 1);
        List<Integer> line2 = List.of(0, -9, 0, 4, 3, 2);
        List<Integer> line3 = List.of(-9, -9, -9, 1, 2, 3);
        List<Integer> line4 = List.of(0, 0, 8, 6, 6, 0);
        List<Integer> line5 = List.of(0, 0, 0, -2, 0, 0);
        List<Integer> line6 = List.of(0, 0, 1, 2, 4, 0);

        List<List<Integer>> input = List.of(line1, line2, line3, line4, line5, line6);
        Integer expectedResult = 28;

        assertEquals(expectedResult, TwoDimentionalArraysDS.hourglassSum(input));
    }
}
