package com.codedifferently.countdups;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Program01 {

    public String countUniqueWords(String input) {
        int count;

        input = input.toLowerCase();
        String[] w = input.split(" ");
        List<String> wList = Arrays.asList(w);
        HashSet<String> uW = new HashSet<>(wList);

        return null;

        }
    }