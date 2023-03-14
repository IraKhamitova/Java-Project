package homework;

public class A {
    public static void main(String[] args) {
        /*
        Write a program that uses variables a and b and prints the sum, difference, product, division of this variables
         */
        int a=100;
        int b=20;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);

        /*
        Write a program that prints the square of variables a and b
         */
        int squareA = a * a;
        int squareB = b * b;
        System.out.println("The square of a is: " + squareA);
        System.out.println("The square of b is: " + squareB);

        /*
        Write a program to print the power of 7 raised to 4.
         */
        int base = 7;
        int exponent = 4;
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        System.out.println("7 raised to the power of 4 is: " + result);

        /*
        Write a program to that takes each digit of number 132 and assigns them to new variables and prints them. (use arithmetic operators)
         */
        int digit=132;
        int digit1 = digit / 100;
        int digit2 = (digit / 10) % 10;
        int digit3 = digit % 10;
        System.out.println("The first digit is: " + digit1);
        System.out.println("The second digit is: " + digit2);
        System.out.println("The third digit is: " + digit3);

        /*
        Write a program that calculates the sum of digits of a number 132;
         */

        int digit5=132;
        int digit6= digit / 100;
        int digit7 = (digit / 10) % 10;
        int digit8 = digit % 10;
        System.out.println(digit6+digit7+digit8);

        /*
       Write a program that reverses the number 132;
         */
        int digit9=132;
        int digit10= digit / 100;
        int digit11 = (digit / 10) % 10;
        int digit12 = digit % 10;
        System.out.println(digit12*100+digit11*10+digit10);




    }
}
