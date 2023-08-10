package prepare.algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AppendAndDeleteTest {

    @Test
    void appendAndDeleteTestCase0() {
        String inputS = "hackerhappy";
        String inputT = "hackerrank";
        int inputK = 9;
        String expectedOutput = "Yes";

        assertEquals(expectedOutput, AppendAndDelete.appendAndDelete(inputS, inputT, inputK));
    }

    @Test
    void appendAndDeleteTestCase1() {
        String inputS = "aba";
        String inputT = "aba";
        int inputK = 7;
        String expectedOutput = "Yes";

        assertEquals(expectedOutput, AppendAndDelete.appendAndDelete(inputS, inputT, inputK));
    }

    @Test
    void appendAndDeleteTestCase2() {
        String inputS = "aaaaaaaaaa";
        String inputT = "aaaaa";
        int inputK = 7;
        String expectedOutput = "Yes";

        assertEquals(expectedOutput, AppendAndDelete.appendAndDelete(inputS, inputT, inputK));
    }

    @Test
    void appendAndDeleteTestCase4() {
        String inputS = "qwerasdf";
        String inputT = "qwerbsdf";
        int inputK = 6;
        String expectedOutput = "No";

        assertEquals(expectedOutput, AppendAndDelete.appendAndDelete(inputS, inputT, inputK));
    }

    @Test
    void appendAndDeleteTestCase5() {
        String inputS = "y";
        String inputT = "yu";
        int inputK = 2;
        String expectedOutput = "No";

        assertEquals(expectedOutput, AppendAndDelete.appendAndDelete(inputS, inputT, inputK));
    }
}