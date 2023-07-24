package prepare.algorithms;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MigratoryBirds {

    /**
     * <a href="https://www.hackerrank.com/challenges/migratory-birds">Migratory Birds</a>
     * Complete the 'migratoryBirds' function below.
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */
    public static int migratoryBirds(List<Integer> arr) {
        Map<Integer, Long> birdFrequencyMap = arr.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        Long frequency = birdFrequencyMap.values().stream().max(Long::compare).get();

        int response = 5;
        for (Integer bird: birdFrequencyMap.keySet()) {
            if (Objects.equals(birdFrequencyMap.get(bird), frequency) && response > bird) {
                response = bird;
            }
        }
        return response;
    }

}
