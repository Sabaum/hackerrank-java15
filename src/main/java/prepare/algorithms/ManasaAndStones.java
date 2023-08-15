package prepare.algorithms;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ManasaAndStones {

    /**
     * <a href="https://www.hackerrank.com/challenges/manasa-and-stones">Manasa And Stones</a>
     * Complete the 'stones' function below.
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER a
     *  3. INTEGER b
     */
    public static List<Integer> stones(int n, int a, int b) {
        Set<Integer> possibleValues = new HashSet<>();

        for (int i = 0; i < n; i++) {
            possibleValues.add((n - 1 - i) * a + i * b);
        }

        return possibleValues.stream().sorted().collect(Collectors.toList());



    }
}
