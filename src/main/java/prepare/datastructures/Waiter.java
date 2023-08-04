package prepare.datastructures;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Waiter {

    /**
     * <a href="https://www.hackerrank.com/challenges/waiter">Waiter</a>
     * Complete the 'waiter' function below.
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY number
     *  2. INTEGER q
     */
    public static List<Integer> waiter(List<Integer> number, int q) {
        List<Integer> primes = calculatePrimes(q);
        List<Integer> result = new ArrayList<>(number.size());

        Stack<Integer> remainingPlateStack = new Stack<>();
        for (Integer plate : number) {
            remainingPlateStack.push(plate);
        }

        for (int i = 0; i < q; i++) {
            Stack<Integer> divisibleStack = new Stack<>();
            Stack<Integer> nonDivisibleStack = new Stack<>();
            Integer currentPrime = primes.get(i);

            while (!remainingPlateStack.empty()) {
                Integer currentPlate = remainingPlateStack.pop();
                if (currentPlate % currentPrime == 0) {
                    divisibleStack.push(currentPlate);
                } else {
                    nonDivisibleStack.push(currentPlate);
                }
            }

            while (!divisibleStack.empty()) {
                result.add(divisibleStack.pop());
            }

            remainingPlateStack = nonDivisibleStack;
        }

        while (!remainingPlateStack.empty()) {
            result.add(remainingPlateStack.pop());
        }
        return result;
    }

    private static List<Integer> calculatePrimes(int numberOfPrimes) {
        return IntStream.iterate(2, possiblePrime -> possiblePrime + 1)
                .filter(number -> isPrime(number))
                .limit(numberOfPrimes)
                .boxed()
                .collect(Collectors.toList());
    }

    private static boolean isPrime(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

}
