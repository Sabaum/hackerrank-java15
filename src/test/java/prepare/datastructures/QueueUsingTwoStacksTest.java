package prepare.datastructures;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class QueueUsingTwoStacksTest {

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
    void processCommandsTestCase0() {
        List<String> input = List.of("1 42", "2", "1 14", "3", "1 28", "3", "1 60", "1 78", "2", "2");
        String expectedOutput = """
                14
                14
                """;

        QueueUsingTwoStacks.processCommands(input);

        assertEquals(expectedOutput, outputStreamCaptor.toString());
    }

    @Test
    void processCommandsTestCase1() {
        List<String> input = List.of("1 76", "1 33", "2", "1 23", "1 97", "1 21", "3", "3", "1 74", "3");
        String expectedOutput = """
                33
                33
                33
                """;

        QueueUsingTwoStacks.processCommands(input);

        assertEquals(expectedOutput, outputStreamCaptor.toString());
    }
}