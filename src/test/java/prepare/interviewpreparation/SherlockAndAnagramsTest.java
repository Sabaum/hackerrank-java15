package prepare.interviewpreparation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SherlockAndAnagramsTest {

    @Test
    void sherlockAndAnagramsTestCase0() {
        String input1 = "abba";
        String input2 = "abcd";
        Integer expectedResult1 = 4;
        Integer expectedResult2 = 0;

        assertEquals(expectedResult1, SherlockAndAnagrams.sherlockAndAnagrams(input1));
        assertEquals(expectedResult2, SherlockAndAnagrams.sherlockAndAnagrams(input2));
    }

    @Test
    void sherlockAndAnagramsTestCase1() {
        String input1 = "ifailuhkqq";
        String input2 = "kkkk";
        Integer expectedResult1 = 3;
        Integer expectedResult2 = 10;

        assertEquals(expectedResult1, SherlockAndAnagrams.sherlockAndAnagrams(input1));
        assertEquals(expectedResult2, SherlockAndAnagrams.sherlockAndAnagrams(input2));
    }

    @Test
    void sherlockAndAnagramsTestCase2() {
        String input = "cdcd";
        Integer expectedResult = 5;

        assertEquals(expectedResult, SherlockAndAnagrams.sherlockAndAnagrams(input));
    }
}