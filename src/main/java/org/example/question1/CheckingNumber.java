package org.example.question1;

//Write a Java program to check if the entered number is Armstrong number?
//Armstrong Numbers are the numbers having the sum of digits raised to power no. of digits is equal to a given number.

public class CheckingNumber {
    //Checking whether the number is armstrong or not
    public void checkingNumber(int number){
        String numberString = String.valueOf(number);
        int result = 0;

        for (int i = 0; i < numberString.length(); i++){
            char n = numberString.charAt(i);
            result += Math.pow(Integer.parseInt(String.valueOf(n)), numberString.length());
        }

        //Checking the result
        if(number == result){
            System.out.println("The number is an Armstrong Number!");
        }else {
            System.out.println("The number is not an Armstrong Number!");
        }
    }
    }
