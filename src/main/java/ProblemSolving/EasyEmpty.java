package ProblemSolving;

import java.util.Scanner;

public class EasyEmpty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();


        if (input.isEmpty()) {
            System.out.println(" Empty");
        } else {
            System.out.println(" Not Empty");
        }
    }
}

