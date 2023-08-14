package prepare.algorithms;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ExtraLongFactorialsTest {

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
    void extraLongFactorialsTestCase0() {
        int input = 25;
        String expectedOutput = """
            15511210043330985984000000
            """;

        ExtraLongFactorials.extraLongFactorials(input);

        assertEquals(expectedOutput, outputStreamCaptor.toString());
    }

    @Test
    void extraLongFactorialsTestCase1() {
        int input = 45;
        String expectedOutput = """
            119622220865480194561963161495657715064383733760000000000
            """;

        ExtraLongFactorials.extraLongFactorials(input);

        assertEquals(expectedOutput, outputStreamCaptor.toString());
    }
}