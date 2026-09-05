package CollectionQuestions;

import java.util.HashSet;
import java.util.Set;

public class FirstRepeatedInArrayHashSet_07 {


/*
    Input:  [10, 10, 50, 30, 20, 40]
    Output: 10
*/

    public static void main(String[] args) {

        int[] arr = {10, 10, 50, 30, 20, 40};
        int firstRepeated = firstRepeatedElement(arr);
        System.out.println(firstRepeated);

    }

    public static int firstRepeatedElement(int[] arr) {

        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            if (!set.add(num)) {
                return num;
            }
        }
        return -1;
    }

}
