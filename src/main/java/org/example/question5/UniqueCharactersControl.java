package org.example.question5;

import java.util.HashSet;
import java.util.Set;

//How to determine if the string has all unique characters.
public class UniqueCharactersControl {
    public void uniqueCharacterControl(String text){
        Boolean isUnique = hasAllUniqueChars(text);
        if(isUnique){
            System.out.println("The string has all unique characters.");
        }else {
            System.out.println("Opps! The string has not all unique characters.");
        }
    }
    public static boolean hasAllUniqueChars(String text) {
        Set<Character> seenChars = new HashSet<>();
        for (char c : text.toCharArray()) {
            if (seenChars.contains(c)) {
                return false;
            }
            seenChars.add(c);
        }
        return true;
    }
}

