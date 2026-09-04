package StringQuestions;

public class CheckIfStringIsPalindrome_04 {

    public static void main(String[] args) {


        /*
         * Input = madam
         * Expected = String is Palindrome!
         *
         * A palindrome reads the same forward and backward.
         */
        String str = "I am ma I";
        boolean result = checkPalindrome(str);
        System.out.println(result);

        if (result) {
            System.out.println("String is Palindrome!");
        } else {
            System.out.println("String is not Palindrome!");
        }

    }

    // Approach 1: Two-pointer approach.
    // Compare characters from both ends and move towards the center.
    public static boolean checkPalindrome(String str) {
        boolean result;
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;

            }
            left++;
            right--;
        }
        return true;
    }


}
