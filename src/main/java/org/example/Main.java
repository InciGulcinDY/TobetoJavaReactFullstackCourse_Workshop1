package org.example;

import org.example.question1.CheckingNumber;
import org.example.question2.First100FibonacciNumbers;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        CheckingNumber checkingNumber = new CheckingNumber();

        //Checking whether the number is armstrong or not
        //System.out.print("Please, enter a number: ");
        //int number = scan.nextInt() ;
       // checkingNumber.checkingNumber(number);

        //Fibonacci Numbers
        First100FibonacciNumbers first100FibonacciNumbers = new First100FibonacciNumbers();
        first100FibonacciNumbers.fibonacciNumbers();
    }

}