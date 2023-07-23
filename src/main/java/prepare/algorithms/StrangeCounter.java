package prepare.algorithms;

public class StrangeCounter {

    /**
     * <a href="https://www.hackerrank.com/challenges/strange-code">Strange Counter</a>
     * Complete the 'strangeCounter' function below.
     * The function is expected to return a LONG_INTEGER.
     * The function accepts LONG_INTEGER t as parameter.
     */
    public static long strangeCounter(long t) {
        var multiplier = 3L;
        var time = 1L;

        while (multiplier + time <= t) {
            time = multiplier + time;
            multiplier = multiplier * 2;
        }
        return multiplier - (t - time);
    }
}
