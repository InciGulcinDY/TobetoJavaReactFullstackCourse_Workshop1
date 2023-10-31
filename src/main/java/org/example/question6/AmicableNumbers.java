package org.example.question6;

import java.util.HashMap;
import java.util.Map;

//Write a Java program finds first two amicable pairs. (Output: 1-> 220-284 2: 1184-1210)
public class AmicableNumbers {
    public void amicableNumbers(){
        int counter = 0;
        int[] amicableNumberArray = new int[4];


        int number1 = 0;
        int n = 0;

        // While loop until two matching numbers are found
        while (counter < 2) {
            //Assigning the value of the second number
            int number2 = getSumOfDivisors(number1);
            //Condition for equality and Condition for the sum of division
            if (number1 != number2 && number1 == getSumOfDivisors(number2) ) {
                //Checking whether the amicable number is on the list, or not

                for (int i = 0; i < amicableNumberArray.length; i++){
                    //if the amicable number is already on the list
                    if (number1 == amicableNumberArray[i] || number1 == amicableNumberArray[i+1]){
                        break;
                    }
                    //if the amicable number is not on the list
                    else {
                        System.out.println("Amicable pair found: (" + number1 + ", " + number2 + ")");
                        amicableNumberArray[n] = number1;
                        amicableNumberArray[n+1] = number2;
                        counter++; //Counter for while loop
                        n=+2;   //The value of n is increasing amicable array length
                        break;
                    }
                }
            }
            number1++;
        }
    }

    // Function to calculate the sum of proper divisors of a number
    public static int getSumOfDivisors(int number) {
        int sum = 1; // 1 is a divisor for all numbers
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
