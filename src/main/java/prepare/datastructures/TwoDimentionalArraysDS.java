package prepare.datastructures;

import java.util.List;

public class TwoDimentionalArraysDS {

    /**
     * <a href="https://www.hackerrank.com/challenges/2d-array">2D-Arrays DS</a>
     * Complete the 'hourglassSum' function below.
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */
    public static int hourglassSum(List<List<Integer>> arr) {
        int greaterSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.size() - 2; i++) {
            for (int j = 0; j < arr.size() - 2; j++) {
                List<Integer> firstLine = arr.get(i);
                Integer secondLineValue = arr.get(i+1).get(j+1);
                List<Integer> thirdLine = arr.get(i+2);

                int sum = firstLine.get(j) + firstLine.get(j+1) + firstLine.get(j+2) + secondLineValue
                        + thirdLine.get(j) + thirdLine.get(j+1) + thirdLine.get(j+2);

                if (sum > greaterSum) {
                    greaterSum = sum;
                }
            }
        }

        return greaterSum;
    }

}
