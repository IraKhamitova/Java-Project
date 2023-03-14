package scannerclass;

import java.util.Scanner;

public class IntroToScanner {
     public static void main(String[] args) {


         Scanner sc=new Scanner(System.in);
         System.out.println("Enter first name");
         int num1=sc.nextInt();

         System.out.println("Enter second");
         int num2=sc.nextInt();
         System.out.println("The sum:"+(num1+num2));


    }
}
