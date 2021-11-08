package com.codedifferently.countdups;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Program01  {


       public String countUniqueWords (String input){


            String[] strArray = input.split(" ");
            List<String> repeatedWords = new ArrayList<>();
            HashSet<String> uniqueWords = new HashSet<>();
            for (String str : strArray) {
                if (!uniqueWords.add(str))
                    repeatedWords.add(str);
            }
            return repeatedWords.toString();
        }
    }
