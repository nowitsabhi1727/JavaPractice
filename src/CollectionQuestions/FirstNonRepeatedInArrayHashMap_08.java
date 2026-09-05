package CollectionQuestions;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FirstNonRepeatedInArrayHashMap_08 {

/*
        Input:  [10, 20, 10, 30, 20]
        Output: 30
*/

    public static void main(String[] args) {

        int[] arr = {10, 20, 10, 30, 20};
        int firstNonRepeated = firstNonRepeatedElement(arr);
        System.out.println(firstNonRepeated);

    }

    public static int firstNonRepeatedElement(int[] arr) {

        Map<Integer, Integer> map = new HashMap<>();

        //Count frequency of elements
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int num : arr) {
            if (map.get(num) == 1) {
                return num;
            }

        }
        return -1;
    }

}
