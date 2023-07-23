package prepare.datastructures;

import java.util.List;

public class ArraysDS {

    /**
     * <a href="https://www.hackerrank.com/challenges/arrays-ds">Arrays DS</a>
     * Complete the reverseArray function below.
     */
    public static List<Integer> reverseArray(List<Integer> intList) {
        // if a list has only one element, it can be considered its own reversed list
        if (intList.size() <= 1) {
            return intList;
        }

        // remove the element in the head of the list
        Integer currVal = intList.remove(0);

        // recursively reverts the rest of the list
        reverseArray(intList);

        // adds the removed element in the tail of the list
        intList.add(currVal);

        return intList;
    }

}
