package org.example;

import org.example.question1.CheckingNumber;
import org.example.question2.First100FibonacciNumbers;
import org.example.question3.CharacterCounting;
import org.example.question4.AnagramTextControl;
import org.example.question5.UniqueCharactersControl;
import org.example.question6.AmicableNumbers;
import org.example.question7.PerfectNumbers;

import java.util.Scanner;

public class Main {
    /*
    TOBETO Workshop-1
1-Write a Java program to check if the entered number is Armstrong number?
2-Write a Java function to print first 100 numbers in Fibonacci series?
3-Write a Java program gives character counts in a string Ex: Tobeto -> t:2, o:2, b:1, e:1
4-How to check if two Strings are anagrams of each other?
5-How to determine if the string has all unique characters.
6-Write a Java program finds first two amicable pairs. (Output: 1-> 220-284 2: 1184-1210)
7-Write a Java program finds first 10 perfect numbers.
     */
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);

        //Question-1: Checking whether the number is armstrong or not
        System.out.print("Please, enter a number: ");
        int number = scan.nextInt() ;
        CheckingNumber checkingNumber = new CheckingNumber();
        checkingNumber.checkingNumber(number);

        //Question-2: Fibonacci Numbers
        First100FibonacciNumbers first100FibonacciNumbers = new First100FibonacciNumbers();
        first100FibonacciNumbers.fibonacciNumbers();

        //Question-3: Character Counting
        System.out.print("Text: ");
        String text = scan.nextLine();
        CharacterCounting characterCounting = new CharacterCounting();
        characterCounting.characterCount(text);

        //Question-4: Anagram
        System.out.print("Text-1: ");
        String text1 = scan.nextLine();

        System.out.print("Text-2: ");
        String text2 = scan.nextLine();

        AnagramTextControl anagramTextControl = new AnagramTextControl();
        anagramTextControl.anagramControl(text1, text2);

        //Question-5: Unique Characters
        System.out.print("Text: ");
        String textForUnique = scan.nextLine();
        UniqueCharactersControl uniqueCharactersControl = new UniqueCharactersControl();
        uniqueCharactersControl.uniqueCharacterControl(textForUnique);

        //Question-6: Amicable Numbers
        AmicableNumbers amicableNumbers = new AmicableNumbers();
        amicableNumbers.amicableNumbers();

        //Question-7: Perfect Numbers
        PerfectNumbers perfectNumbers = new PerfectNumbers();
        perfectNumbers.perfectNumberControl();

    }

}