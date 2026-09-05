package CollectionQuestions;

import java.util.HashSet;
import java.util.Set;

public class MissingNumbersInArrayHashSet_06 {

    /*
        Input:  [1, 3, 6, 7]
        Range:  1 to 7

        Output: 2, 4, 5
    */
    public static void main(String[] args) {

        int[] arr = {1, 3, 6, 7,11};

        Set<Integer> unionSet = findMissingNumbersOfArray(arr);
        System.out.println(unionSet);
    }

    private static Set<Integer> findMissingNumbersOfArray(int[] arr) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> missingSet = new HashSet<>();

        for (int num:arr){
            set.add(num);
        }

        // Find maximum value
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }

        for (int i=1;i<= max;i++){
            if (!set.contains(i)){
                missingSet.add(i);
            }
        }
        return missingSet;
    }
}
