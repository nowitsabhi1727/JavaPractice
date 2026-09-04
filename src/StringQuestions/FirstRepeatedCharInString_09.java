package StringQuestions;

public class FirstRepeatedCharInString_09 {

    public static void main(String[] args) {

        /*
         * Input = abababcfc
         *
         * Character occurrences:
         * a = 3  <-- first repeated character
         * b = 3
         * c = 2
         * f = 1
         *
         * Expected = a
         *
         * Problem:
         * Find the first character that occurs more than once in the string.
         * Spaces are ignored.
         */

        String str = "abababcfc";
        char ch = repeatedCharInString(str);
        if(ch!='\0'){
            System.out.println(ch);
        }else {
            System.out.println("No char found!");
        }

        System.out.println("************");

    }

    /*
     * Approach 1: Brute-force using char[] and nested loops.
     *
     * 1. Traverse the string from left to right.
     * 2. For each character, count its occurrences in the entire string.
     * 3. If the count is greater than 1, return that character.
     * 4. Returning immediately ensures we get the FIRST repeated character.
     *
     * Time Complexity: O(n²)
     * Space Complexity: O(n)
     */
    public static char repeatedCharInString(String str) {

        str = str.toLowerCase();
        char[] charArray = str.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            int count = 0;
            // Ignore spaces.
            if (charArray[i] == ' ') {
                continue;
            }


            for (int j = 0; j < charArray.length; j++) {
                if (charArray[i] == charArray[j]) {
                    count++;
                }
            }
            if (count>1) {
                return str.charAt(i);
            }

        }

        return '\0';
    }

}
