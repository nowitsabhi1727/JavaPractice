package ArrayQuestions;

public class FindSecondLargestElement_03 {

    /*
     * Input = {10, 25, 7, 45, 18, 99, 99, 80, 70}
     *
     * Expected = 80
     *
     * Problem:
     * Find the second largest distinct element present in the array.
     * Duplicate values of the largest element should be ignored.
     */
    public static void main(String[] args) {
        int[] arr = {10, 25, 7, 45, 18, 99, 99, 80, 70};
        int secondMax = secondLargestElement(arr);
        System.out.println(secondMax);

    }

    public static int secondLargestElement(int arr[]) {

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            } else if (arr[i] > secondMax && arr[i] < max) {
                secondMax = arr[i];
            }
        }
        return secondMax;
    }

}
