package ArrayQuestions;

public class FindSecondSmallestElement_04 {

    /*
     * Input = {10, 25, 7, 45, 18, 99, 99, 80, 70}
     *
     * Expected = 18
     *
     * Problem:
     * Find the second-smallest distinct element present in the array.
     * Duplicate values of the smallest element should be ignored.
     */
    public static void main(String[] args) {
        int[] arr = {20, 25, 7, 45, 18, 99, 99, 80, 70};
        int secondMin = secondSmallestElement(arr);
        System.out.println(secondMin);

    }

    public static int secondSmallestElement(int arr[]) {

        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                secondMin = min;
                min = arr[i];
            } else if (arr[i]<secondMin && arr[i]>min ) {
                secondMin=arr[i];
            }
        }
        return secondMin;
    }

}
