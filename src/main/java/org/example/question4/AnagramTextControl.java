package org.example.question4;

import java.util.Arrays;

//How to check if two Strings are anagrams of each other?
public class AnagramTextControl {
    public void anagramControl(String text1, String text2) throws Exception {
        //Converting all text to lowercase, Removing spaces
        text1 = text1.toLowerCase().replaceAll("//s", "");
        text2 = text2.toLowerCase().replaceAll("//s", "");

        //1. Compare the number of characters in both texts
        if (text1.length() != text2.length()){
            throw new Exception("The texts are not anagrams of each other!");
        }

        //2. Check if each character has an equal frequency of occurrence in both texts.
        String[] arrOfStr1 = text1.toLowerCase().split("");
        Arrays.sort(arrOfStr1);

        String[] arrOfStr2 = text2.toLowerCase().split("");
        Arrays.sort(arrOfStr2);

        if (Arrays.equals(arrOfStr1,arrOfStr2)){
            System.out.println("GREAT! Two Strings are anagrams of each other");
        }
        else{
            System.out.println("OPPS! Two Strings are NOT anagrams of each other");
        }
    }
}
