package my_map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapHW {

    public static int countSpecificWords(String stringIn, String word) {
        Map<String, Integer> wordCounts = new HashMap<>();
        for (String wordInString : stringIn.split(" ")) {
            if (!wordCounts.containsKey(wordInString))
                wordCounts.put(wordInString, 1);
            else
                wordCounts.put(wordInString, wordCounts.get(wordInString) + 1);
        }
        return wordCounts.getOrDefault(word, 0);
    }

    public static void iteration(Map<Integer, String> map, WayOfIteration way) {
        if (way == WayOfIteration.FOR) {
            System.out.println("FOR iteration:");
            for (Map.Entry<Integer, String> mapEntry : map.entrySet()) {
                System.out.println("Key: " + mapEntry.getKey() + " Value: " + mapEntry.getValue());
            }
        } else {
            System.out.println("WHILE iteration:");
            Iterator<Map.Entry<Integer, String>> iterator = map.entrySet().iterator();
            while (iterator.hasNext()) {
                Map.Entry<Integer, String> entry = iterator.next();
                System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
            }
        }
    }

    public static void main(String[] args) {
        //1
        String stringIn = "Hello my name is Hello hello Hello";
        int counterOfSpecificWords = countSpecificWords(stringIn, "Hello");
        System.out.println(counterOfSpecificWords);
        System.out.println("-----------------------");
        //2
        Map<Integer, String> myMap = new HashMap<>();
        myMap.put(1, "Hello");
        myMap.put(2, "my");
        myMap.put(3, "name");
        myMap.put(4, "is");
        myMap.put(5, "Jenya");
        iteration(myMap, WayOfIteration.FOR);
        iteration(myMap, WayOfIteration.WHILE);
    }
}
