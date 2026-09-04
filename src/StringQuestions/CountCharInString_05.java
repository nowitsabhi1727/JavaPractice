package StringQuestions;

public class CountCharInString_05 {

    public static void main(String[] args) {


        /*
         * Input = Selenium
         * Expected = 8
         *
         * Input = Java Selenium
         * Expected = 13
         *
         * Count the total number of characters present in the string.
         */
        String str = "Java Selenium";
        int count = countCharInStringWithLength(str);
        System.out.println(count);
        int countCustom = countCharInString(str);
        System.out.println(countCustom);
        int countWithOutSpace = countCharInStringIgnoringSpace(str);
        System.out.println(countWithOutSpace);

    }

    // Approach 1: Use the built-in length() method to get the total number of characters.
    public static int countCharInStringWithLength(String str) {
        return str.length();
    }

    // Approach 2: Manually count each character using a loop.
    public static int countCharInString(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            count++;
        }
        return count;
    }

    // Approach 3: Count characters using a loop while ignoring spaces.
    public static int countCharInStringIgnoringSpace(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                count++;
            }
        }
        return count;
    }

}
