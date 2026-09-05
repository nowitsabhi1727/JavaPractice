package ArrayQuestions;

public class FindMissingNumberInArray_10 {

    /*
     * Input = {1, 2, 3, 5, 6}
     *
     * Expected = 4
     *
     * Problem:
     * Find the missing number from an array containing numbers
     * from 1 to N.
     */
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 6};
        int[] arr1 = {1, 3, 6, 7};
        int missingNumber = findMissingNumber(arr);

        System.out.println("Missing number : " + missingNumber);

        findMissingNumbersMultiple(arr1, 7);

    }

    /*
     * Approach 1: Sum formula.
     *
     * 1. Find N using arr.length + 1 because one number is missing.
     * 2. Calculate the expected sum from 1 to N.
     * 3. Calculate the actual sum of elements present in the array.
     * 4. Subtract actual sum from expected sum to get the missing number.
     *
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */
    private static int findMissingNumber(int[] arr) {

        int length = arr.length + 1;
        int expectedSum = sumOfArray(length);
        int actualSum = actualSum(arr);

        return expectedSum - actualSum;
    }

    private static int actualSum(int[] arr) {

        int actualSum = 0;
        for (int num : arr) {
            actualSum += num;
        }

        return actualSum;
    }

    private static int sumOfArray(int length) {
        //Sum = N * (N + 1) / 2
        return length * (length + 1) / 2;
    }


    //Approach 2 -> Boolean Array
    public static void findMissingNumbersMultiple(int[] arr, int n) {

        boolean[] present = new boolean[n + 1];

        // Mark numbers that are present in the array.
        for (int num : arr) {
            present[num] = true;
        }

        // Numbers still marked false are missing.
        for (int i = 1; i <= n; i++) {
            if (!present[i]) {
                System.out.println("All missing numbers by approach 2: " + i);
            }
        }
    }


}



