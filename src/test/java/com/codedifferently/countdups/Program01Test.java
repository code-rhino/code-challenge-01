package com.codedifferently.countdups;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Program01Test {
    private Program01 solution;

    @BeforeEach
    public void setup(){
        solution = new Program01();
    }

    @Test
    public void countUniqueWordsTest1(){
        String input = "Hello Java. Hello World. Hello Java!";
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
