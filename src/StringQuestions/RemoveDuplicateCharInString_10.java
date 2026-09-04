package StringQuestions;

public class RemoveDuplicateCharInString_10 {

    public static void main(String[] args) {

        /*
         * Input = abababcfc
         *
         * Expected = abcf
         *
         * Problem:
         * Remove duplicate characters from the string.
         * Keep only the first occurrence of each character.
         * Preserve the original order of characters.
         * Spaces are ignored.
         */

        String str = "abababcfc";
        String result = removeDuplicateCharacters(str);
        System.out.println(result);
        System.out.println("************");

    }

    /*
     * Approach 1: Use StringBuilder to store unique characters.
     *
     * 1. Traverse the string from left to right.
     * 2. Check whether the current character is already present in result.
     * 3. If it is not present, append it to result.
     * 4. If it is already present, skip it.
     *
     * StringBuilder.indexOf() returns:
     * - index >= 0 → character is already present
     * - -1 → character is not present
     *
     * Time Complexity: O(n²)
     * Space Complexity: O(n)
     */
    public static String removeDuplicateCharacters(String str) {

        str = str.toLowerCase();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {

            // Ignore spaces
            if (str.charAt(i) == ' ') {
                continue;
            }

            // Check whether character is already present in result
            if (result.indexOf(String.valueOf(str.charAt(i))) == -1) {
                result.append(str.charAt(i));
            }

        }

        return result.toString();
    }

}
