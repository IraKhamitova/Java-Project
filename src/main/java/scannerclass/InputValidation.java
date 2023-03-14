package scannerclass;

import java.util.Scanner;

public class InputValidation {
    public static void main(String[] args) {
        Scanner month1=new Scanner(System.in);
        System.out.println("Enter months");
        String month=month1.next();

        if (month.equalsIgnoreCase("January") || month.equalsIgnoreCase("February" )
                || month.equalsIgnoreCase("March") ){
            System.out.println("Winter");
        }else if (month.equalsIgnoreCase("April") || month.equalsIgnoreCase("May")
                || month.equalsIgnoreCase("June")){
            System.out.println("spring");
        }else if (month.equalsIgnoreCase("July") || month.equalsIgnoreCase("August")
                || month.equalsIgnoreCase("September")){
            System.out.println("summer");
        }else if (month.equalsIgnoreCase("October") || month.equalsIgnoreCase("November")
                || month.equalsIgnoreCase("December")){
            System.out.println("fall");
        }else {
            System.out.println("invalid season");
        }
    }
}
