package homework;

import java.util.Scanner;

public class DaysOfWeek {
    public static void main(String[] args) {
        /*
        Write a program that takes a day of the week (Monday, Tuesday, etc.) as input from user using Scanner
        class and prints out whether it is a weekday or a weekend day using switch case.
         */
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter days of week");
        String day= sc.nextLine();
        switch (day.toLowerCase()){
            case "monday":
            case "tuesday":
            case "wednesday":
            case "thursday":
            case "friday":
                System.out.println(day+"is weekday.");
                break;
            case "saturday":
            case "sanday":
                System.out.println(day+"weekend day.");
                break;
            default:
                System.out.println("Invalid input.");
                break;


        }


    }
}
