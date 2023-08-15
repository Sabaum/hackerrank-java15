package prepare.algorithms;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ManasaAndStonesTest {

    @Test
    void stonesTestCase0() {
        int n = 3;
        int a = 1;
        int b = 2;
        List<Integer> expectedOutput = List.of(2, 3, 4);

        assertEquals(expectedOutput, ManasaAndStones.stones(n, a, b));

        n = 4;
        a = 10;
        b = 100;

        expectedOutput = List.of(30, 120, 210, 300);
        assertEquals(expectedOutput, ManasaAndStones.stones(n, a, b));
    }

    @Test
    void stonesTestCase1() {
        int n = 7;
        int a = 9;
        int b = 11;
        List<Integer> expectedOutput = List.of(54, 56, 58, 60, 62, 64, 66);

        assertEquals(expectedOutput, ManasaAndStones.stones(n, a, b));

        n = 4;
        a = 8;
        b = 16;

        expectedOutput = List.of(24, 32, 40, 48);
        assertEquals(expectedOutput, ManasaAndStones.stones(n, a, b));
    }
}