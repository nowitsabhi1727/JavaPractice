package StringQuestions;

public class CountOccurrenceOfCharInString_06 {

    public static void main(String[] args) {


        /*
         * Input = Java Selenium
         *
         * Expected =
         * J = 1
         * a = 2
         * v = 1
         * S = 1
         * e = 2
         * l = 1
         * n = 1
         * i = 1
         * u = 1
         * m = 1
         *
         * Problem:
         * Count how many times each character occurs in the string.
         * Spaces are ignored.
         */
        String str = "Java Selenium";
        countCharInOccurrence(str);
        System.out.println("************");
        countCharInOccurrenceAnotherMethod(str);


    }

    /*
     * Approach 1: Brute-force using String and nested loops.
     *
     * 1. Take one character at a time.
     * 2. Check whether the character was already processed.
     * 3. If not, count its occurrences in the remaining string.
     * 4. Print the character and its count.
     *
     * Time Complexity: O(n²)
     * Space Complexity: O(1)
     */
    public static void countCharInOccurrence(String str) {

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

            System.out.println(str.charAt(i) + " = " + count);
        }

    }

    /*
     * Approach 2: Convert the String into a character array.
     *
     * 1. Convert String to char[] for easier character traversal.
     * 2. Take one character at a time.
     * 3. If the same character appeared at an earlier index, stop processing it.
     * 4. Otherwise, count its total occurrences.
     *
     * Time Complexity: O(n²)
     * Space Complexity: O(n) because of the character array.
     */
    public static void countCharInOccurrenceAnotherMethod(String str) {

        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            int count = 0;
            // Ignore spaces.
            if (charArray[i] == ' ') {
                continue;
            }
            for (int j = 0; j < charArray.length; j++) {
                // If this character was already processed earlier,
                // stop counting it again.
                if (charArray[i] == charArray[j] && j < i) {
                    break;
                }
                // Count the occurrence of the current character.
                if (charArray[i] == charArray[j]) {
                    count++;
                }
            }
            if (count > 0) {
                System.out.println( charArray[i]+ " : " +  count);
            }
        }

    }
}
