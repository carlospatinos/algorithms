package com.algorithms;

import java.util.Scanner;

/**
 * Created by developer on 10/9/17.
 */
public class LongWordFinder {
    public static String find(String fullString) {
        fullString = fullString.replaceAll("[^a-zA-Z0-9 ]", "");
        String[] array = fullString.split("\\s+");
        String longestWord = "";
        int maxLenght = 0;
        for(String current: array) {
            int currentLength = current.length();
            if(currentLength > maxLenght) {
                maxLenght = currentLength;
                longestWord = current;
            }
        }
        return longestWord;

    }
}
