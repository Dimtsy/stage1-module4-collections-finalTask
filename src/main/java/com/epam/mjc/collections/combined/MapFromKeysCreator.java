package com.epam.mjc.collections.combined;

import java.util.*;

public class MapFromKeysCreator {
    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {
        Map<Integer, Set<String>> map = new HashMap<>();
        for (Map.Entry<String, Integer> entry : sourceMap.entrySet()) {
            if (map.containsKey(entry.getKey().length())) {
                Set set = map.get(entry.getKey().length());
                set.add(entry.getKey());
                map.put(entry.getKey().length(), set);
            } else {
                Set setFirst = new HashSet();
                setFirst.add(entry.getKey());
                map.put(entry.getKey().length(), setFirst);
            }
        }
        return map;
    }
}
