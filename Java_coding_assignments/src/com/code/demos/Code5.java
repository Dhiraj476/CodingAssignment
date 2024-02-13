package com.code.demos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Code5 {
    public static <K, V> Map<V, List<K>> groupByValue(Map<K, V> inputMap) {
        Map<V, List<K>> resultMap = new HashMap<>();

        // Iterate through the input map
        for (Map.Entry<K, V> entry : inputMap.entrySet()) {
            K key = entry.getKey();
            V value = entry.getValue();

            // Check if the value already exists in the result map
            if (!resultMap.containsKey(value)) {
                // If not, create a new list for the value
                resultMap.put(value, new ArrayList<>());
            }

            // Add the key to the list corresponding to the value
            resultMap.get(value).add(key);
        }

        return resultMap;
    }

    public static void main(String[] args) {
        Map<String, Integer> inputMap = new HashMap<>();
        inputMap.put("13", 10);
        inputMap.put("13-c", 15);
        inputMap.put("342-r", 10);
        inputMap.put("146-Q", 10);
        inputMap.put("27", 15);
        inputMap.put("29-A", 12);
        inputMap.put("215-U", 12);
        inputMap.put("27-E1", 15);
        inputMap.put("13J", 12);
        inputMap.put("SBS-D34G", 10);
        

        System.out.println("Input Map: " + inputMap);

        Map<Integer, List<String>> groupedMap = groupByValue(inputMap);

        System.out.println("Grouped Map:");
        for (Map.Entry<Integer, List<String>> entry : groupedMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
