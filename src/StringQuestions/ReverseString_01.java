package StringQuestions;

public class ReverseString_01 {

    public static void main(String[] args) {
        //Approach1 -> Use loop and method reverseString
        //Approach 2-> Use StringBuilder and then reverse, method reverseStringWithStringBuilder
        //Approach 3-> Use StringBuilder+Loop, method reverseStringWithStringBuilderWithLoop
        //Note: Difference b/w 1 and 3 is string is mutable and everytime in approach 1 it creates new object

        String str = "I am Abhishek";
        String result = reverseString(str);
        System.out.println(result);
        String resultSB = reverseStringWithStringBuilder(str);
        System.out.println(resultSB);
        String resultSBWithoutReverse=reverseStringWithStringBuilderWithLoop(str);
        System.out.println(resultSBWithoutReverse);

    }

    //1
    public static String reverseString(String str) {
        //Brute force
        /*
        1. Take one empty string result and start one loop and
        put end char at start of result string and print result string in the end
         */
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            result = result + str.charAt(i);
        }
        return result;
    }

    //2
    public static String reverseStringWithStringBuilder(String str) {
        StringBuilder resultSB = new StringBuilder(str);
        return resultSB.reverse().toString();
    }

    //3
    public static String reverseStringWithStringBuilderWithLoop(String str) {
        StringBuilder result = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--) {
            result.append(str.charAt(i));
        }
        return result.toString();
    }

}
