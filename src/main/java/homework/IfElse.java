package homework;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        /*
        Write a Java program that asks the user to enter a grade and checks if it is A, B, C, D or F
using if-else statement.
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your grade");
        String grade = sc.nextLine();
        if (grade.equals("A") || grade.equals("B") || grade.equals("C") || grade.equals("D") || grade.equals("F")) {
            System.out.println("Valid grade!");

        } else {
            System.out.println("Invalid grade");
        }
         /*
    Write a Java program that takes a character as input and checks if it is uppercase or lowercase
using if-else statement and logical operators.
     */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Uppercase");
        char ch = scanner.next().charAt(0);
        if (ch >= 'A' && ch <= 'Z') {
            System.out.println(ch + " is an uppercase character");
        } else if (ch >= 'a' && ch <= 'z') {
            System.out.println(ch + " is a lowercase character");
        } else {
            System.out.println(ch + " is not a letter");


        }
        /*
        Write a Java program that asks the user to enter their age and checks if they are eligible
to vote or not using if-else statement.
         */

        Scanner age=new Scanner(System.in);
        System.out.println("Enter your age");
        int age1= sc.nextInt();
        if (age1>=18){
            System.out.println("You are eligible for vote!");
            
        } else if (age1<=18) {
            System.out.println("You are not eligible for vote!");
            
        }

        /*
         Write a Java program that asks the user to enter two strings and checks if they are equal or not
using if-else statement.
         */
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String str1 = input.nextLine();

        System.out.print("Enter the second string: ");
        String str2 = input.nextLine();

        if (str1.equals(str2)) {
            System.out.println("The two strings are equal.");
        } else {
            System.out.println("The two strings are not equal.");
        }

        input.close();


    }
}






