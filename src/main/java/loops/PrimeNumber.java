package loops;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = sc.nextInt();

        boolean isPrime = true;
        for (int i = 2; i < number; i++) {

            if (number % i == 0) ;
            isPrime = false;
            break;

        }
        if (isPrime) {
            System.out.println();
        } else {
            System.out.println("Number is not prime");


        }
    }
}

