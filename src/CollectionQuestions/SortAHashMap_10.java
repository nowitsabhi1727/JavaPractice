package CollectionQuestions;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortAHashMap_10 {

    /*
Input
    A : 40
    B : 10
    C : 30
    D : 20
Output
    B : 10
    D : 20
    C : 30
    A : 40
    *
    * */
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        Map<String, Integer> sortedMap = new HashMap<>();

        map.put("A", 40);
        map.put("B", 10);
        map.put("C", 30);
        map.put("D", 20);

        map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(entry ->
                        System.out.println(entry.getKey() + " : " + entry.getValue()));

        sortedMap = map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (a, b) -> a, LinkedHashMap::new));

        System.out.println(sortedMap);

        for (Map.Entry<String,Integer>entry: sortedMap.entrySet()){
            System.out.println(entry.getKey()+" : "+ entry.getValue());
        }

    }
}
