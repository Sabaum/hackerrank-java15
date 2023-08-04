package prepare.datastructures;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TruckTourTest {

    @Test
    void truckTour() {
        List<List<Integer>> input = List.of(
                List.of(1, 5),
                List.of(10, 3),
                List.of(3,4)
        );
        int expectedResult = 1;

        assertEquals(expectedResult, TruckTour.truckTour(input));
    }
}