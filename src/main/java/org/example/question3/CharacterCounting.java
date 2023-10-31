package org.example.question3;
import java.util.HashMap;
import java.util.Map;

// Write a Java program gives character counts in a string Ex: Tobeto -> t:2, o:2, b:1, e:1
public class CharacterCounting {

    public void characterCount(String text) {
            // Create a HashMap Collection to store character counts
            Map<Character, Integer> charCountMap = new HashMap<>();

            // Convert the input text to lowercase to ensure case-insensitive counting
            text = text.toLowerCase();

            //Removing spaces
            text = text.replaceAll(" ", "");

            // Iterate through the characters in the text
            for (int i = 0; i < text.length(); i++) {
                char character = text.charAt(i);
                // Update the character count in the map
                charCountMap.put(character, charCountMap.getOrDefault(character, 0) + 1);
            }

            // Print the character counts
            //Not: Map.Entry returns Map Objects
            for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
}
