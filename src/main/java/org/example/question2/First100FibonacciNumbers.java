package org.example.question2;

import java.math.BigInteger;
//Write a Java function to print first 100 numbers in Fibonacci series?
public class First100FibonacciNumbers {
    public void fibonacciNumbers() {
        int n = 100;
        BigInteger[] fibonacciSeries = new BigInteger[n];

        //Assigning first and second fibonacci numbers into Fibonacci Series manual
        fibonacciSeries[0] = BigInteger.ONE;
        fibonacciSeries[1] = BigInteger.ONE;

        //Assigning Fibonacci numbers into Fibonacci Series
        for (int i = 2; i < n; i++){
            fibonacciSeries[i] = fibonacciSeries[i-1].add(fibonacciSeries[i-2]);
        }

        // Writing first 100 Fibonacci numbers on the console
        for(int i = 0; i < n; i++){
            System.out.println(fibonacciSeries[i]);
        }
    }
}

