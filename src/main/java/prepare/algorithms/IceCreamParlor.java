package prepare.algorithms;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IceCreamParlor {

    /**
     * <a href="https://www.hackerrank.com/challenges/icecream-parlor">Ice Cream Parlor</a>
     * Complete the 'icecreamParlor' function below.
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER m
     *  2. INTEGER_ARRAY arr
     */
    public static List<Integer> icecreamParlor(int m, List<Integer> arr) {
        Map<Integer, Integer> possibleValues = new HashMap<>();

        for (int i = 0; i < arr.size(); i++) {
            int value = arr.get(i);
            if (possibleValues.containsKey(m - value)) {
                return List.of(possibleValues.get(m - value), i + 1);
            }
            possibleValues.put(value, i + 1);
        }
        return List.of();
    }

}
