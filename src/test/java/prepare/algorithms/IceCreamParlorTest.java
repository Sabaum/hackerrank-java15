package prepare.algorithms;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class IceCreamParlorTest {

    @Test
    void icecreamParlorTestCase0() {
        List<Integer> input = List.of(1, 4, 5, 3, 2);
        int m = 4;
        List<Integer> expectedResult = List.of(1, 4);

        assertEquals(expectedResult, IceCreamParlor.icecreamParlor(m, input));


        input = List.of(2, 2, 4, 3);
        m = 4;
        expectedResult = List.of(1, 2);

        assertEquals(expectedResult, IceCreamParlor.icecreamParlor(m, input));
    }

    @Test
    void icecreamParlorTestCase1() {
        List<Integer> input = List.of(1, 3, 4, 6, 7, 9);
        int m = 9;
        List<Integer> expectedResult = List.of(2, 4);

        assertEquals(expectedResult, IceCreamParlor.icecreamParlor(m, input));


        input = List.of(1, 3, 4, 4, 6, 8);
        m = 8;
        expectedResult = List.of(3, 4);

        assertEquals(expectedResult, IceCreamParlor.icecreamParlor(m, input));


        input = List.of(1, 2);
        m = 3;
        expectedResult = List.of(1, 2);

        assertEquals(expectedResult, IceCreamParlor.icecreamParlor(m, input));
    }
}