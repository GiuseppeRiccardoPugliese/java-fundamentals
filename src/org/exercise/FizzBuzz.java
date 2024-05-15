package org.exercise;

public class FizzBuzz {
    public static void main(String[] args) {
        //Stampare un numero da 1 a 100
        //Per il multipli di 3 stampare Fizz
        //Per il multipli di 5 stampare Buzz
        //Per i numeri che sono sia multipli di 3 che di 5 stampi FizzBuzz.

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0){
                System.out.println("Fizz");
            }
            if (i % 5 == 0) {
                System.out.println("Buzz");
            }
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            }
            System.out.println(i);
        }
    }
}
