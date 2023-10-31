package org.example.question4;

import org.example.question3.CharacterCounting;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

//How to check if two Strings are anagrams of each other?
public class AnagramTextControl {
    public void anagramControl(String text1, String text2){
        //Converting all text to lowercase
        text1.toLowerCase();
        text2.toLowerCase();

        //Removing spaces
        text1.replaceAll(" ", "");
        text2.replaceAll(" ", "");

        //1. Compare the number of characters in both texts
        if (text1.length() != text2.length()){
            System.out.println("The texts are not anagrams of each other! ");
        }

        //2. Check if each character has an equal frequency of occurrence in both texts.
        Map<Character, Integer> charCountMap1 = new HashMap<>();
        Map<Character, Integer> charCountMap2 = new HashMap<>();

        // HashMap Collection-1  Iterate through the characters in the text
        for (int i = 0; i < text1.length(); i++) {
            char character = text1.charAt(i);
            // Update the character count in the map
            charCountMap1.put(character, charCountMap1.getOrDefault(character, 0) + 1);
        }

        // HashMap Collection-2 Iterate through the characters in the text
        for (int i = 0; i < text2.length(); i++) {
            char character = text2.charAt(i);
            // Update the character count in the map
            charCountMap2.put(character, charCountMap2.getOrDefault(character, 0) + 1);
        }

        //Compare the collections
        int counter = 0;
        for (Map.Entry<Character, Integer> entry1 : charCountMap1.entrySet()) {
            for (Map.Entry<Character, Integer> entry2 : charCountMap2.entrySet()){
                if (entry1.getKey() == entry2.getKey() && entry1.getValue() == entry2.getValue()){
                    counter+=entry2.getValue();
                }
            }
        }

        //Print the results
        if (counter==text2.length()){
            System.out.println("The entered texts are anagrams of each other.");
        }else {
            System.out.println("The entered texts are not anagrams of each other");
        }
    }
}
