package com.codedifferently.countdups;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Program01 {
//separate string array by word
// counter for each word
//return array?
// hashmap - check if the word is there, create it if its not
    public String countUniqueWords(String input){

        String[] wordArray = input.split("[\\.\\!\\s]+");
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i< wordArray.length; i++){
            if(!map.containsKey(wordArray[i])){
                map.put(wordArray[i], 1);
            } else {
                int count = map.get(wordArray[i]);
               count++;
               map.put(wordArray[i], count);
            }
            System.out.println(wordArray[i]);
        }
        int totalWordCount = map.size();
        String answer = "The " + totalWordCount + " unique words are:\n";
        for(String word : map.keySet()){
            answer+= word + " (Seen " + map.get(word) + ")\n";

        }



        return answer;
    }

    //need toString?

    @Override
    public String toString() {
        return "The " + 3 /*var of # of words*/
                +" unique words are:\n"
                /*+ each word & (count) */;
    }
}
