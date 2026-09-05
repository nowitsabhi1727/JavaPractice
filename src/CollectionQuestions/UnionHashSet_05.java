package CollectionQuestions;

import java.util.HashSet;
import java.util.Set;

public class UnionHashSet_05 {

    /*
        Array 1 = [10, 20, 30]
        Array 2 = [30, 40, 50]

        Output = [10, 20, 30, 40, 50]
    */
    public static void main(String[] args) {

        int[] arr1 = {10, 20, 30};
        int[] arr2 = {30, 40, 50};

        Set<Integer> unionSet = findUnionOfArray(arr1, arr2);
        System.out.println(unionSet);
    }

    private static Set<Integer> findUnionOfArray(int[] arr1, int[] arr2) {
        Set<Integer> union = new HashSet<>();
        for (int num : arr1) {
            union.add(num);
        }
        for (int num : arr2) {
            union.add(num);
        }
        return union;
    }
}
