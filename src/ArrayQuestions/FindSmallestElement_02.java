package ArrayQuestions;

public class FindSmallestElement_02 {
    
    /*
     * Input = {10, 25, 7, 45, 18,99}
     *
     * Expected = 7
     *
     * Problem:
     * Find the smallest element present in the array.
     */
    public static void main(String[] args) {
        int[] arr = {10, 25, 7, 45, 18,99};
        int max = smallestElement(arr);
        System.out.println(max);

    }
    public static int smallestElement(int arr[]) {

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

}
