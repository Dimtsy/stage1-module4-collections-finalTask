package com.epam.mjc.collections.combined;

import java.util.*;

public class DeveloperProjectFinder {
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {
        List<String> list = new ArrayList<>();
        for (Map.Entry<String, Set<String>> entry : projects.entrySet()) {
            if (entry.getValue().contains(developer)) {
                list.add(entry.getKey());
            }
        }
        list.sort((o1, o2) -> {
            int firstCharComparison1 = o2.length() - o1.length();
            int firstCharComparison = o2.charAt(0) - o1.charAt(0);
            return firstCharComparison1 != 0 ? firstCharComparison1 : firstCharComparison;
        });
        return list;
    }
}
