package com.codedifferently.countdups;

import java.util.Arrays;

public class Program01 {
//separate string array by word
// counter for each word
//return array?

    public String[] countUniqueWords(String input){

        int count = input.split("\\s").length;
        //counts how many words total with \\s separating by spaces
        System.out.println(count);

        return null;
    }

    //need toString?

    @Override
    public String toString() {
        return "The " + 3 /*var of # of words*/
                +" unique words are:\n"
                /*+ each word & (count) */;
    }
}
