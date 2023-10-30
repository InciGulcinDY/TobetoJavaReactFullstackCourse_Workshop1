package org.example.question1;

//Checking whether the number is armstrong or not
public class CheckingNumber {
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
