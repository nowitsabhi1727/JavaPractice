package ArrayQuestions;

import java.util.Arrays;

public class SortAnArray_06 {

    /*
     * Input = {20, 25, 7, 45, 18, 99, 99, 80, 70}
     *
     * Expected = {7, 18, 20, 25, 45, 70, 80, 99, 99}
     *
     * Problem:
     * Sort the elements of an array in ascending order.
     */
    public static void main(String[] args) {
        int[] arr = {20, 25, 7, 45, 18, 99, 99, 80, 70};
        int[] sortedArray = sortedArray(arr);
        for (int i = 0; i < sortedArray.length; i++) {
            System.out.println(sortedArray[i]);
        }
        //Option 2 to print exact array
        System.out.println(Arrays.toString(sortedArray));


        int[] sortedArrayDirect = sortedArray(arr);
        System.out.println(Arrays.toString(sortedArrayDirect));


    }

    public static int[] sortedArray(int[] arr) {


        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static int[] sortedArrayByBuiltInMethod(int[] arr){

        Arrays.sort(arr);
        return arr;
    }

}



