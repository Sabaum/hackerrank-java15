package prepare.algorithms;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClimbingTheLeaderboardTest {

    @Test
    void climbingLeaderboardTestCase0() {
        List<Integer> ranked = List.of(100, 100, 50, 40, 40, 20, 10);
        List<Integer> player = List.of(5, 25, 50, 120);
        List<Integer> expectedResult = List.of(6, 4, 2, 1);

        assertEquals(expectedResult, ClimbingTheLeaderboard.climbingLeaderboard(ranked, player));
    }

    @Test
    void climbingLeaderboardTestCase1() {
        List<Integer> ranked = List.of(100, 90, 90, 80, 75, 60);
        List<Integer> player = List.of(50, 65, 77, 90, 102);
        List<Integer> expectedResult = List.of(6, 5, 4, 2, 1);

        assertEquals(expectedResult, ClimbingTheLeaderboard.climbingLeaderboard(ranked, player));
    }
}