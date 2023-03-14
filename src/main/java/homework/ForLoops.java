package homework;

import java.util.Scanner;

public class ForLoops {
    public static void main(String[] args) {
        /*
        1. create a loop that prints all December days from 1 to 31:

1 December 2022

2 December 2022

3 December 2022
         */
        for (int day = 1; day <= 31; day++) {
            System.out.println("December " + day);
        }
        /*
        2. create a loop that prints all even numbers from 1 to 200:
         */
        for (int i = 2; i <= 200; i+= 2) {
            System.out.println(i);
        }
        /*
        3. create a loop that prints all odd numbers from 100 to 1:
         */
        for (int i = 99; i >= 1; i -= 2) {
            System.out.println(i);
        }

            /*
            4. create a loop that prints all the values divisible by 7 in the range of 1 to 100 in reverse order.
             */
            for (int i = 100; i >= 1; i--) {
                if (i % 7 == 0) {
                    System.out.println(i);
                }
            }

        }

    }





