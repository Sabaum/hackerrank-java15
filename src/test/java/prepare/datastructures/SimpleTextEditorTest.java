package prepare.datastructures;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SimpleTextEditorTest {

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
    void processCommands() {
        List<String> input = List.of("1 abc", "3 3", "2 3", "1 xy", "3 2", "4", "4", "3 1");
        String expectedOutput = """
                c
                y
                a
                """;

        SimpleTextEditor.processCommands(input);

        assertEquals(expectedOutput, outputStreamCaptor.toString());
    }
}