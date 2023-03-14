package homework;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        /*
        Write a program that takes a number as input using scanner class and calculates the factorial of a number.
        For example, if the input is 5, the output should be 120 (since 5! = 5 x 4 x 3 x 2 x 1 = 120).
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        int fractional = 1;
        for (int i = num; i >= 1; i--) {
            fractional *= i;
        }
        System.out.println(num + "! = + factorial");



        /*
    Write a program that takes a number as input using scanner class and calculates the sum of the digits of a number.
    For example, if the input is 12345, the output should be 15 (since 1+2+3+4+5=15).
     */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = sc.nextInt();
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        System.out.println("Sum of digits" + sum);

         /*
        3# create a loop that prints all odd numbers from 100 to 1: 99 - odd 97 - odd 1 - odd
         */
        for (int i = 99; i >= 1; i -= 2) {
            System.out.println(i + " - odd");
        }
        /*
        4# create a loop that prints all March days from 1 to 31: 1 March 2023 2 March 2023 3 March 2023 31 March 2023
         */
        for (int day = 1; day <= 31; day++) {
            System.out.println(day + "March 2023");
        }
        /*
        create a loop that prints all the values divisible by 8 in the range of 1 to 50 in reverse order. 48 40 32 8

         */
        for (int i=50; i>=1; i--){
            if (i%8==0){
                System.out.println(i);


            }
        }
    }
}





















