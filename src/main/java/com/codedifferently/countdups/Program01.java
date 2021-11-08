package com.codedifferently.countdups;

import java.io.*;

public class Program01 {

    public static String countUniqueWords(String input) {
        final int OUT = 0;
        final int IN = 1;

        int state = OUT;
        int wordCount = 0;
        int i = 0;

        // Scan all characters one by one
        while (i < input.length()) {

            // If next character is a separator, set the
            // state as OUT
            //(?) here we have to chek the uniques of the each word with the equal operator
            if (input.charAt(i) == ' ' || input.charAt(i) == '\n'
                    || input.charAt(i) == '\t')
                state = OUT;


                // If next character is not a word separator
                // and state is OUT, then set the state as IN
                // and increment word count
            else if (state == OUT)
            {
                state = IN;
                ++wordCount;
            }

            // Move to next character
            ++i;
        }
        //(?)we have to return word count, but it required String
        System.out.println(wordCount);
        return input;
    }
            // Driver program to test above functions
            public static void main (String args[])
            {
                String input = "that that is is that that is not is not is that it it is wutang";
                System.out.println("Numbers of words : " + countUniqueWords(input));
            }
        }
