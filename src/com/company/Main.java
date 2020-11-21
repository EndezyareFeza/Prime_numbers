package com.company;


public class Main {

    public static void main(String[] args) {

        final int num_of_primes = 50;
        final int num_primes_per_line = 10;
        int count = 0;
        int number = 2;

        System.out.println("The first fifty prime numbers are: \n");
        while (count < num_of_primes){
            boolean isPrime = true;
            //test whether number is prime
            for(int divisor = 2; divisor <= number / 2; divisor++){
                if(number % divisor == 0){
                    isPrime = false;
                    break;
                }
            }
            //display number and advance to a new line
            if(isPrime){
                count++;
                if(count % num_primes_per_line == 0)
                    System.out.println(number);
                else
                    System.out.print(number + " ");
            }
            number++;
        }
}
}