package StringQuestions;

public class ReverseOrderOfWords_03 {

    public static void main(String[] args) {


        /*
         * Input = Java Selenium API
         * Expected = API Selenium Java
         * Word order is reversed, but characters within each word remain unchanged.
         */
        String str = "Java Selenium API";
        String result = reverseOrder(str);
        System.out.println(result);
        String resultSB = reverseOrderWithTwoPointers(str);
        System.out.println(resultSB);
    }

    // Approach 1: Two-pointer approach.
    // Swap words from both ends until the left and right pointers meet.
    public static String reverseOrder(String str) {
        String[] arr = str.split(" ");
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            String temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        return String.join(" ", arr);
    }

    // Approach 2: Reverse traversal.
    // Traverse the words from the last index to the first using StringBuilder.
    public static String reverseOrderWithTwoPointers(String str) {
        StringBuilder result = new StringBuilder();
        String[] arr = str.split(" ");
        for (int i = arr.length - 1; i >= 0; i--) {
            result.append(arr[i]);
            if (i > 0) {
                result.append(" ");
            }
        }
        return result.toString();

    }

}
