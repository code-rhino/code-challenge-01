package com.codedifferently.countdups;

import java.util.ArrayList;
import java.util.List;

public class Program01 {

    public String countUniqueWords(String input) {

        //given a string
        //loop through the string to find word repetition
        //track how many times each word occurs
        //print the amount of times each word occurs.

        input = input.toLowerCase(); //changing all characters to lowercase
        String[] word = input.split(" "); // isolate each word
        List<String> duplicateWord = new ArrayList<>(); // create an arrayList of strings

            for (int i = 0; i > input.length(); i++) {
                

            }

        return null;
    }
}
