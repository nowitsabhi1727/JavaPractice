package ArrayQuestions;

public class FindDuplicateElementInArray_07 {

    /*
     * Input = {20, 25, 7, 45, 18, 99, 99, 80, 70}
     *
     * Expected = 99
     *
     * Problem:
     * Find the duplicate element of an array.
     */
    public static void main(String[] args) {
        int[] arr = {20, 25, 9, 45, 18, 994, 9, 80, 70};
        int isDupe = checkDuplicateElement(arr);
        if (isDupe != 0) {
            System.out.println("Duplicate present : " + isDupe);
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

}



