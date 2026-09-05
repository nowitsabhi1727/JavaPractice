package ArrayQuestions;

public class CountOccurrenceOfElementInArray_09 {

    /*
     * Input = {10, 20, 10, 30, 20, 10, 40,99}
     *
     * Expected = 10 = 3
                  20 = 2
                  30 = 1
                  40 = 1
     *
     * Problem:
     * Count occurrence of each element
     */
    public static void main(String[] args) {
        int[] arr = {10, 20, 10, 30, 20, 10, 40,99};
        countOccurrence(arr);
    }

    /*
     * Approach 1: Brute-force using nested loops.
     *
     * 1. Traverse each element of the array.
     * 2. Count how many times the current element occurs in the array.
     * 3. Before counting, check whether the same element appeared
     *    at an earlier index.
     * 4. If it was already processed, skip it to avoid printing
     *    the same element multiple times.
     * 5. Print the element along with its occurrence count.
     *
     * Time Complexity: O(n²)
     * Space Complexity: O(1)
     */

    public static void countOccurrence(int[] arr) {



        for (int i = 0; i < arr.length; i++) {

            int count = 0;
            boolean isAlreadyProcessed= false;
            for (int j = 0; j < arr.length; j++) {

                if (arr[i] == arr[j] && j < i) {
                    isAlreadyProcessed=true;
                    break;
                }

                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (isAlreadyProcessed){
                continue;
            }
            System.out.println(arr[i] + " : " + count);
        }

    }


}



