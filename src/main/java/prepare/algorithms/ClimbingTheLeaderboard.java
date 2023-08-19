package prepare.algorithms;

import java.util.*;
import java.util.stream.Collectors;

public class ClimbingTheLeaderboard {

    /**
     * <a href="https://www.hackerrank.com/challenges/climbing-the-leaderboard">Climbing the Leaderboard</a>
     * Complete the 'climbingLeaderboard' function below.
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY ranked
     *  2. INTEGER_ARRAY player
     */
    public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {
        List<Integer> sanitizedRanked = ranked.stream().distinct().collect(Collectors.toList());
        Stack<Integer> stack = new Stack<>();
        List<Integer> result = new ArrayList<>();
        for (int rank : sanitizedRanked) {
            stack.push(rank);
        }

        for (int play : player) {
            while (!stack.isEmpty() && play >= stack.peek()) {
                stack.pop();
            }
            result.add(stack.size() + 1);
        }
        return result;
    }

}
