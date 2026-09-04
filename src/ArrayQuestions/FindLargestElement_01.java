package ArrayQuestions;

public class FindLargestElement_01 {

    /*
     * Input = {10, 25, 7, 45, 18,99}
     *
     * Expected = 99
     *
     * Problem:
     * Find the largest element present in the array.
     */
    public static void main(String[] args) {
        int[] arr = {10, 25, 7, 45, 18,99};
        int max = largestElement(arr);
        System.out.println(max);

    }
    public static int largestElement(int arr[]) {

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

}
