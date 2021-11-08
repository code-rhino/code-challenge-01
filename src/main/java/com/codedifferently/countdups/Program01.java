package com.codedifferently.countdups;

public class Program01 {

    public String countUniqueWords(String input){
        // provide a string
        int seen = 0;
        String output = "";

        // change string input into an array
        String[] uniqueWords = input.split(" ");

        //look for unique words that repeat
        for (int i = 0; i < uniqueWords.length; i++) {
            // compare and count how many times you see each unique word
            for (int j = i + 1; j < uniqueWords.length; j++){
                if (uniqueWords[i].equals(uniqueWords[j])){
                    seen += 1;
                    uniqueWords[j] = "0";
                    output = uniqueWords[i] + "(Seen " + seen + ")";
                }
            }
        }
        // return total amount of times seen
        return output;
    }
}
