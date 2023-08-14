package prepare.algorithms;

import java.math.BigInteger;

public class ExtraLongFactorials {

    /**
     * <a href="https://www.hackerrank.com/challenges/extra-long-factorials">Extra Long Factorials</a>
     * Complete the 'extraLongFactorials' function below.
     * The function accepts INTEGER n as parameter.
     */
    public static void extraLongFactorials(int n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        System.out.println(result);
    }
}
