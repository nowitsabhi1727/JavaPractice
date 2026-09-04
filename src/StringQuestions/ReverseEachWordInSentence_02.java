package StringQuestions;

public class ReverseEachWordInSentence_02 {
    /*
     * Input=Java Selenium API
     * Expected=avaJ muineleS IPA
     * Word position does not change here.
     *  */

    public static void main(String[] args) {

        String str = "Java Selenium API";
        String result = reverseSentence(str);
        System.out.println(result);
        String resultSB = reverseSentenceWithStringBuilder(str);
        System.out.println(resultSB);
        String resultSBwithoutReverse = reverseSentenceWithStringBuilderWithoutReverse(str);
        System.out.println(resultSBwithoutReverse);
    }

    // Approach 1: Split sentence into words and reverse each word using nested loops.
    // Uses String concatenation, so it is less efficient for larger strings.
    public static String reverseSentence(String str) {

        String[] arr = str.split(" ");
        String result = "";
        for (int i = 0; i < arr.length; i++) {
            for (int j = arr[i].length() - 1; j >= 0; j--) {
                result = result + arr[i].charAt(j);
            }
            if (i < arr.length - 1) {
                result = result + " ";
            }
        }
        return result;
    }

    // Approach 2: Use StringBuilder.reverse() to reverse each word.
    // One StringBuilder maintains the final result; a temporary builder reverses each word.
    public static String reverseSentenceWithStringBuilder(String str) {
        String[] arr = str.split(" ");
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            StringBuilder sb = new StringBuilder(arr[i]);
            result.append(sb.reverse());
            if (i < arr.length - 1) {
                result.append(" ");
            }
        }
        return result.toString();
    }

    // Approach 3: Use StringBuilder with a loop; no reverse() method.
    // Traverse each word from the last character to the first and append to the result.
    public static String reverseSentenceWithStringBuilderWithoutReverse(String str) {

        String[] arr = str.split(" ");
        StringBuilder result = new StringBuilder();
        for (String word : arr) {
            for (int j = word.length() - 1; j >= 0; j--) {
                result.append(word.charAt(j));
            }
            result.append(" ");
        }
        return result.toString().trim();
    }

}
