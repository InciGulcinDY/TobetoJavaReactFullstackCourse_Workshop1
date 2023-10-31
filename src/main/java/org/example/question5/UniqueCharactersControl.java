package org.example.question5;

import java.util.HashMap;
import java.util.Map;

//How to determine if the string has all unique characters.
public class UniqueCharactersControl {
    public void uniqueCharactersControl(String text){
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

        // Print the unique characters
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() == 1){
                System.out.print(entry.getKey() + " ");
            }
        }

    }
}
