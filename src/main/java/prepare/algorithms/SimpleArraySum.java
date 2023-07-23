package prepare.algorithms;

import java.util.List;

public class SimpleArraySum {

    /**
     * <a href="https://www.hackerrank.com/challenges/simple-array-sum">Simple Array Sum</a>
     * Complete the 'simpleArraySum' function below.
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY ar as parameter.
     */
    public static int simpleArraySum(List<Integer> ar) {
        return ar.parallelStream().reduce(0, Integer::sum);
    }
}
