package loops;

import java.util.Scanner;

public class BreakPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int number = sc.nextInt();
        int number2 = sc.nextInt();


        int sum = number + number2;

        for (int i1 = 2; i1 <= sum; i1++) {

            if (i1 == 45) {
                break;
            }
            System.out.println(i1);

        }
    }
}

