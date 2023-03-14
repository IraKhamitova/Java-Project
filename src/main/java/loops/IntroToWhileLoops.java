package loops;

import java.util.Scanner;

public class IntroToWhileLoops {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;




                int i1 = 1;
                while (i <= 10) {
                    System.out.println("Good morning everyone");
                    i++;


                }
            int b = 100;
            while (b >= 1) {
                if (b % 2 != 0) {
                    System.out.println(b);
                }
                b--;

            }
            int k=1;
            while (k<=31){
                System.out.println(k+" January 2023");
                break;

            }k++;

            Scanner input = new Scanner(System.in);
            System.out.print("Enter a number to check if it is prime: ");
            int num1 = input.nextInt();

            boolean isPrime = true;
            int iterator = 2;

            while (iterator <= num1 ) {
                if (num1 % iterator == 0) {
                    isPrime = false;
                    break;
                }
                iterator++;
            }


            if (isPrime) {
                System.out.println(num1 + " is a prime number.");
            }
            else {
                System.out.println(num1 + " is not a prime number.");
            }

        }
    }




            }






