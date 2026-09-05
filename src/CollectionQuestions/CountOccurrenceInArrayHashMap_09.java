package CollectionQuestions;

import java.util.HashMap;
import java.util.Map;

public class CountOccurrenceInArrayHashMap_09 {

/*
        Input:  [10, 20, 10, 30, 20, 10]
        Output:
            10 : 3
            20 : 2
            30 : 1
*/

    public static void main(String[] args) {

        int[] arr = {10, 20, 10, 30, 20, 10};
        String str = "Abhishek";
        Map<Integer, Integer> map = countOccurrenceHashMap(arr);
        Map<Character, Integer> map2 = countCharacterFrequency(str);
        System.out.println(map);
        System.out.println(map2);

    }

    private static Map<Character, Integer> countCharacterFrequency(String str) {
        str = str.toLowerCase();
        char[] strCharArray = str.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (char ch : strCharArray) {
            if (ch == ' ') {
                continue;
            }
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        return map;
    }

    private static Map<Integer, Integer> countOccurrenceHashMap(int[] arr) {

        Map<Integer, Integer> map = new HashMap<>();
        //Count frequency of elements
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        return map;

    }
}
