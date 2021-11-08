package com.codedifferently.countdups;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class Program01Test {
    private Program01 solution;

    @BeforeEach
    public void setup(){
        solution = new Program01();
    }

    @Test
    public void countUniqueWordsTest1(){
        String input = "Hello Java. Hello World. Hello Java!";
        int stringLength = input.length()-1;
        ArrayList<String> listWords = new ArrayList<>();
        String x = " ";
        String y = " ";
        int counter = 0;

        String [] words = input.split(" ");

        for(int i =0; i< input.length()-1; i++){
            listWords.add(words[i]+" ";)

            //if container x has the same word as input string then count it and add to container y
            if(listWords.contains((words[i])){

                y += x + "seen" + counter++;

            }
            //if it doesnt have the same word then continue
            else{
                continue;
            }

        }


        String expected =   "The 3 unique words are:\n" +
                "Hello (Seen 3)\n" +
                "World (Seen 1)\n" +
                "Java (Seen 2)";



        String actual = solution.countUniqueWords(input);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void countUniqueWordsTest2(){
        String input = "that that is is that that is not is not is that it it is wutang";
        String expected =   "The 4 unique words are:\n" +
                "that (Seen 5)\n" +
                "is (Seen 5)\n" +
                "not (Seen 2)\n"+
                "wutang (Seen 1)";
        String actual = solution.countUniqueWords(input);
        Assertions.assertEquals(expected, actual);
    }

}
