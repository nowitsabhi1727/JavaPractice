package CollectionQuestions;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicateHashSet_03 {

    /*
    Input:  [10, 20, 30, 40]
    Output: false

    Input:  [10, 20, 30, 10]
    Output: true
    */
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 50, 60,40};
        boolean duplicateSet = containsDuplicate(arr);
            System.out.println(duplicateSet);

    }

    private static boolean containsDuplicate(int[] arr) {

        Set<Integer> set= new HashSet<>();
        for (int num: arr){
            if (!set.add(num)){
                return true;
            }
        }
        return false;


    }
}
