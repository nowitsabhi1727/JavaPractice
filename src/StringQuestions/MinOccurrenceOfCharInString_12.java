package StringQuestions;

public class MinOccurrenceOfCharInString_12 {

    public static void main(String[] args) {


        /*
         * Input = Java Selenium API
         *
         * After converting to lowercase:
         *
         * Character occurrences:
         * j = 1  <-- minimum occurrence
         * a = 4
         * v = 1
         * s = 1
         * e = 2
         * l = 1
         * n = 1
         * i = 2
         * u = 1
         * m = 1
         * p = 1
         *
         * Expected = j : 1
         *
         * Problem:
         * Find the character that occurs the minimum number of times.
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
     * 4. Compare the count with the current minimum.
     * 5. Update min and minChar when a smaller count is found.
     *
     * Time Complexity: O(n²)
     * Space Complexity: O(1)
     */
    public static void countCharInOccurrence(String str) {

        str = str.toLowerCase();
        int min = Integer.MAX_VALUE;
        char minChar = '\0';
        for (int i = 0; i < str.length(); i++) {
            int count = 0;
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
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }
            if (min > count) {
                min = count;
                minChar = str.charAt(i);
            }
        }
        System.out.println(minChar + " : " + min);
    }
}