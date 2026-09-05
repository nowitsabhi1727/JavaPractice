package CollectionQuestions;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesHashSet_01 {

    public static void main(String[] args) {

        /*
        Input:  [10, 20, 10, 30, 20, 40]
        Output: [10, 20, 30, 40]
         */

        int[] arr = {10, 20, 30, 20, 40};
        Set<Integer> updatedSet = removeDuplicate(arr);
        for (int num : updatedSet) {
            System.out.println(num);
        }
    }

    public static Set<Integer> removeDuplicate(int[] arr) {

        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }
        return set;
    }
}
