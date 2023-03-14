package scannerclass;

import java.util.Scanner;

public class Multiplication {

    public static void main(String[] args) {
        Scanner scanner1=new Scanner(System.in);
        System.out.println("Enter number1");
        double d1= scanner1.nextDouble();

        System.out.println("Enter number2");
        double d2= scanner1.nextDouble();

        System.out.println("Enter number3");
        double d3= scanner1.nextDouble();
        System.out.println("thanks for your input!");
        System.out.println("The result is:"+(d1*d2*d3));


    }
}
