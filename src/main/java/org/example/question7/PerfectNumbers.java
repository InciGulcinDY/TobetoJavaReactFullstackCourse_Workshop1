package org.example.question7;

//Write a Java program finds first 10 perfect numbers.
public class PerfectNumbers {

    public void perfectNumberControl(){
        int counter = 1;
        //0 is not a positive integer and 1 is also not a perfect number because its only positive divisor is itself (1)
        long number = 2;

        while(counter <= 10){
            if (number == getSumOfDivisors(number)){
               System.out.println(counter + ". " + number);
                counter++;
            }
            number++;
        }
    }

    public static int getSumOfDivisors(long number) {
        int sum = 1; // 1 is a divisor for all numbers
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
