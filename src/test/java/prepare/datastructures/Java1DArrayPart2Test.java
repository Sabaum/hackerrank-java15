package prepare.datastructures;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Java1DArrayPart2Test {

    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @AfterEach
    public void tearDown() {
        System.setOut(standardOut);
    }

    @Test
    void canWinTestCase0() {
        List<Integer> leaps = List.of(3, 5, 3, 1);
        List<String> games = List.of("0 0 0 0", "0 0 0 1 1 1", "0 0 1 1 1 0", "0 1 0");

        String expectedOutput = """
                YES
                YES
                NO
                NO
                """;

        Java1DArrayPart2.canWin(leaps, games);

        assertEquals(expectedOutput, outputStreamCaptor.toString());
    }

    @Test
    void canWinTestCase1() {
        List<Integer> leaps = List.of(2, 6, 3);
        List<String> games = List.of("0 1 0 1 0 1", "0 0 1 1 0 0 1 1 0 0", "0 0 1 1 0 0 1 1 0 0");

        String expectedOutput = """
                YES
                NO
                YES
                """;

        Java1DArrayPart2.canWin(leaps, games);

        assertEquals(expectedOutput, outputStreamCaptor.toString());
    }
}