package ArrayQuestions;

import java.util.Arrays;

public class RemoveDuplicateElementInArray_08 {

    /*
     * Input = {20, 25, 25, 9, 45, 18, 994, 9, 80, 70}
     *
     * Expected = {20, 25, 9, 45, 18, 994, 80, 70}
     *
     * Problem:
     * Remove duplicate elements from an array while maintaining
     * the original order of the unique elements.
     */
    public static void main(String[] args) {
        int[] arr = {20, 25,25, 9, 45, 18, 994, 9, 80, 70};
        int isDupe = checkDuplicateElement(arr);
        int[] result = removeDuplicateElement(arr);
        int isDupeAfter = checkDuplicateElement(result);

        System.out.println(Arrays.toString(result));
        if (isDupe != 0) {
            System.out.println("Duplicate present : " + isDupe);
        } else {
            System.out.println("No Duplicate present");
        }
        if (isDupeAfter != 0) {
            System.out.println("Duplicate present : " + isDupeAfter);
        } else {
            System.out.println("No Duplicate present");
        }

    }

    public static int checkDuplicateElement(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return arr[i];
                }
            }
        }
        return 0;
    }
    /*
     * Approach: Brute-force using nested loops.
     *
     * 1. Take each element from the original array.
     * 2. Compare it with all elements that are already stored
     *    in the result array.
     * 3. If the element is already present, skip it.
     * 4. If it is not present, add it to the result array.
     * 5. Use index to keep track of the next available position
     *    in the result array.
     *
     * Time Complexity: O(n²)
     * Space Complexity: O(n)
     */
    public static int[] removeDuplicateElement(int[] arr) {

        int[] result = new int[arr.length];
        int index = 0;

        for (int i = 0; i < arr.length; i++) {

            boolean alreadyPresent = false;

            for (int j = 0; j < index; j++) {
                if (arr[i] == result[j]) {
                    alreadyPresent = true;
                    break;
                }
            }

            if (!alreadyPresent) {
                result[index] = arr[i];
                index++;
            }
        }

        return Arrays.copyOf(result, index);
    }
}



