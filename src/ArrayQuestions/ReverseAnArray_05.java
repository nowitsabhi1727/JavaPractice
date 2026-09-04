package ArrayQuestions;

import java.util.Arrays;

public class ReverseAnArray_05 {

    /*
     * Input = {20, 25, 7, 45, 18, 99, 99, 80, 70}
     *
     * Expected = {70, 80, 99, 99, 18, 45, 7, 25, 20}
     *
     * Problem:
     * Reverse the elements of an array in-place.
     */
    public static void main(String[] args) {
        int[] arr = {20, 25, 7, 45, 18, 99, 99, 80, 70};
        int[] reversedArray = reversedArray(arr);
        for (int i = 0; i < reversedArray.length; i++) {
            System.out.println(reversedArray[i]);
        }
        //Option 2 to print exact array
        System.out.println(Arrays.toString(reversedArray));

    }

    public static int[] reversedArray(int[] arr) {

        int left = 0;
        int right = (arr.length - 1);
        while (left < right) {
            int temp = arr[right];
            arr[right] = arr[left];
            arr[left] = temp;
            left++;
            right--;
        }
        return arr;
    }
}



