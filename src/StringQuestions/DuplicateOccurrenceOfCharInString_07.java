package StringQuestions;

public class DuplicateOccurrenceOfCharInString_07 {

    public static void main(String[] args) {


        /*
         * Input = automation
         *
         * Expected:
         *          a
         *          t
         *          o
         *
         * Problem:
         * Count how many times each character occurs in the string.
         * Spaces are ignored.
         */
        String str = "Automation";
        duplicateCharInOccurrence(str);
        System.out.println("************");

    }


    public static void duplicateCharInOccurrence(String str) {

        str = str.toLowerCase();
        char[] charArray = str.toCharArray();

        for (int i = 0; i < charArray.length; i++) {

            int count = 1;
            boolean alreadyProcessed = false;
            // Ignore spaces.
            if (charArray[i] == ' ') {
                continue;
            }
            for (int k = 0; k < i; k++) {
                if (charArray[i] == charArray[k]) {
                    alreadyProcessed=true;
                    break;
                }
            }
            if (alreadyProcessed) {
                continue;
            }

            for (int j = i + 1; j < charArray.length; j++) {
                if (charArray[i] == charArray[j]) {
                    System.out.println(charArray[i]);

                }
            }
        }

    }


}
