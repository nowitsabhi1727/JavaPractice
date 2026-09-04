package StringQuestions;

public class MaxOccurrenceOfCharInString_11 {

    public static void main(String[] args) {


        /*
         * Input = Java Selenium API
         *
         * Character occurrences:
         * a = 3  <-- maximum occurrence
         * e = 2
         * i = 2
         * ...
         *
         * Expected = a : 3
         *
         * Problem:
         * Find the character that occurs the maximum number of times.
         * Spaces are ignored.
         */
        String str = "Java Selenium API";
        countCharInOccurrence(str);
        System.out.println("************");
    }

    /*
     * Approach 1: Brute-force using String and nested loops.
     *
     * 1. Traverse the string from left to right.
     * 2. Skip spaces and characters already processed.
     * 3. Count the total occurrences of the current character.
     * 4. Compare the count with the current maximum.
     * 5. Update max and maxChar when a higher count is found.
     *
     * Time Complexity: O(n²)
     * Space Complexity: O(1)
     */
    public static void countCharInOccurrence(String str) {

        str = str.toLowerCase();
        int max = 0;
        char maxChar = '\0';
        for (int i = 0; i < str.length(); i++) {
            int count = 1;
            boolean alreadyCounted = false;

            if (str.charAt(i) == ' ') {
                continue;
            }

            // Check whether this character was already counted earlier.
            for (int k = 0; k < i; k++) {
                if (str.charAt(i) == str.charAt(k)) {
                    alreadyCounted = true;
                    break;
                }
            }
            // Skip the character if its occurrence was already calculated.

            if (alreadyCounted) {
                continue;
            }
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }
            if (count > max) {
                max = count;
                maxChar = str.charAt(i);
            }
        }
        System.out.println(maxChar + " : " + max);
    }
}