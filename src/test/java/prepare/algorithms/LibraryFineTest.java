package prepare.algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LibraryFineTest {

    @Test
    void libraryFineTestCase5() {
        int d1 = 2;
        int m1 = 7;
        int y1 = 1014;
        int d2 = 1;
        int m2 = 1;
        int y2 = 1015;
        int expectedOutput = 0;

        assertEquals(expectedOutput, LibraryFine.libraryFine(d1, m1, y1, d2, m2, y2));
    }
}