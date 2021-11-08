package com.codedifferently.countdups;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program01 {

    public String countUniqueWords(String input){

//        Given a string like that that is is that that is not is not is that it it is wutang
//
//        Count the number of unique words, and how many times the occur.
//
//                The 4 unique words are:
//        that (Seen 5)
//        is (Seen 5)
//        not (Seen 2)
//        wutang (Seen 1)

        String [] splitInput = input.split(" ");

        List<String> uniqueWords = new ArrayList<>(Arrays.asList(splitInput));

        int count = 0;
        for (int i = 1; i < uniqueWords.size(); i++){
            if (splitInput.equals(uniqueWords.get(i))){
                count++;
            }
            for (int j = 0; j<i; j++){
                if (uniqueWords.get(i).equals(uniqueWords.get(j))){
                    uniqueWords.remove(i);
                    i--;
                    break;
                }
            }

        }
        for (String w: uniqueWords){
            System.out.println(w);
        }

        return uniqueWords.toString() + count;
    }

    public static void main(String[] args) {
        Program01 test = new Program01();
        System.out.println(test.countUniqueWords("the game is on"));
    }
}
