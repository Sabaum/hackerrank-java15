package prepare.algorithms;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NewYearChaosTest {

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
    void minimumBribesTestCase0() {
        List<Integer> input1 = Stream.of(2, 1, 5, 3, 4).collect(Collectors.toList());
        List<Integer> input2 = Stream.of(2, 5, 1, 3, 4).collect(Collectors.toList());
        String expectedOutput = """
            3
            Too chaotic
            """;

        NewYearChaos.minimumBribes(input1);
        NewYearChaos.minimumBribes(input2);

        assertEquals(expectedOutput, outputStreamCaptor.toString());
    }

    @Test
    void minimumBribesTestCase1() {
        List<Integer> input1 = Stream.of(5, 1, 2, 3, 7, 8, 6, 4).collect(Collectors.toList());
        List<Integer> input2 = Stream.of(1, 2, 5, 3, 7, 8, 6, 4).collect(Collectors.toList());
        String expectedOutput = """
            Too chaotic
            7
            """;

        NewYearChaos.minimumBribes(input1);
        NewYearChaos.minimumBribes(input2);

        assertEquals(expectedOutput, outputStreamCaptor.toString());
    }

    @Test
    void minimumBribesTestCase2() {
        List<Integer> input = Stream.of(1, 2, 5, 3, 4, 7, 8, 6).collect(Collectors.toList());
        String expectedOutput = """
            4
            """;

        NewYearChaos.minimumBribes(input);

        assertEquals(expectedOutput, outputStreamCaptor.toString());
    }
}