package CollectionQuestions;

import java.util.HashSet;
import java.util.Set;

public class IntersectionHashSet_04 {

    /*
        Array 1 = [10, 20, 30, 40]
        Array 2 = [30, 40, 50, 60]

        Output = [30, 40]
    */
    public static void main(String[] args) {

        int[] arr1 = {10, 20, 30, 40};
        int[] arr2 = {30, 40, 50, 60};

        Set<Integer> commonSet = findIntersection(arr1, arr2);
        System.out.println(commonSet);
    }

    private static Set<Integer> findIntersection(int[] arr1, int[] arr2) {

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> common = new HashSet<>();

        for (int num : arr1) {
            set1.add(num);
        }
        for (int num : arr2) {
            if (set1.contains(num)) {
                common.add(num);
            }
        }
        return common;
    }
}
