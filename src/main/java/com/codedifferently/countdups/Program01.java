package com.codedifferently.countdups;

import java.util.Arrays;

public class Program01 {

    public static String countUniqueWords(String input){
        String words[] = input.split(" ");
        int count = 0;

        for(int i=0; i < words.length; i++){
            if(words[0].equals(words[i])){
                count++;
            }
        }

        return Arrays.toString(words) + "\n First Word " +  count+ "";
    }

    public static void main(String[] args) {
        System.out.println(countUniqueWords("if else if if for"));
    }
}
