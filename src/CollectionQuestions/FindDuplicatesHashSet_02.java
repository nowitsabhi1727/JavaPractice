package CollectionQuestions;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicatesHashSet_02 {

    public static void main(String[] args) {

        /*
        Input:  [10, 20, 10, 30, 20, 40]
        Output: 10, 20
         */
        int[] arr = {10, 20, 30, 20, 40,40};
        Set<Integer> duplicateSet = findDuplicate(arr);
        for (int num : duplicateSet) {
            System.out.println(num);
        }
    }

    private static Set<Integer> findDuplicate(int[] arr) {
        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();

        for (int num: arr){
            if (!seen.add(num)){
                duplicates.add(num);
            }
        }
        return duplicates;
    }

}
