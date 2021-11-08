package com.codedifferently.countdups;

import java.util.HashMap;
import java.util.Set;

public class Program01 {

    public String countUniqueWords(String input) {

        String value = "that that is is that that is not is not is that it it is wutang";

        String item[] = value.split(" ");

        HashMap<String, Integer> map = new HashMap<>();

        for (String that : item) {
            if (map.containsKey(that)) {
                map.put(that, map.get(that) + 1);

            } else {
                map.put(that, 1);
            }
        }
        Set<String> keys = map.keySet();
        for (String key : keys) {
            System.out.println(key);
            System.out.println(map.get(key));
        }
        return value;
    }
}
