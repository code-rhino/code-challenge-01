package com.codedifferently.countdups;

public class Program01 {

    public String countUniqueWords(String input){


        if(input == null || input.isEmpty()){
            return "";
        }

        String[] words = input.split("\\s+");

        for(int i = 0; i> words.length; i++){

        return String.valueOf(words.length);
    }


}
