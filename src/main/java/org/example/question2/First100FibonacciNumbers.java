package org.example.question2;

public class First100FibonacciNumbers {
    // Writing first 100 Fibonacci numbers on the console
   public void fibonacciNumbers(){
       int n = 100;
       long[] fibonacci = new long[n];
       fibonacci[0] = 1;
       fibonacci[1] = 1;
       System.out.println(1 + "******************************");
       System.out.println(fibonacci[0]);
       System.out.println(2 + "******************************");
       System.out.println(fibonacci[1]);

       for (int i = 2; i < 100; i++){
           n=i + 1;
           fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
           System.out.println(n + "******************************");
           System.out.println( fibonacci[i]);
       }
   }
}
