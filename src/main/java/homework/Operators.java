package homework;

public class Operators {
    public static void main(String[] args) {
        int a = 100;
        int b = 200;
        int sum = a + b;
        System.out.println("The sum of " + a + " and " + b + " is " + sum);

        int q = 5;
        int w = 9;
        int e = 10;
        int sum1 = q + w + e;
        System.out.println("Sum of all three variables: " + sum1);

        int a1 = 1;
        int b1 = 2;
        int c = 3;
        int d = 4;
        int e1 = 8;
        int f = 7;
        System.out.println(a1 + " + " + b + " = " + (a + b1));
        System.out.println(c + " - " + a1 + " = " + (c - a1));
        System.out.println(d + " * " + a1+ " = " + (d * a1));
        System.out.println(d + " / " + a1+ " = " + (d / a1));
        System.out.println(e1 + " + " + f + " = " + (e1 + f));
        System.out.println(e1+ " % " + f + " = " + (e1 % f));

        int length = 9;
        int width = 15;
        int area = length * width;
        int perimeter = 2 * (length + width);
        System.out.println("The area of a rectangle is: " + area);
        System.out.println("The perimeter of a rectangle is: " + perimeter);

        int num = 2345;
        int result = (num + 8) / 3 % 5 * 5;
        System.out.println("Final result: " + result);

        int num11 = 2345;
        num += 8;
        num /= 3;
        num %= 5;
        num *= 5;
        System.out.println("Final result using assignment operators: " + num);

        int num1 = 23;
        int num2 = 45;
        if(num1 == num2) {
            System.out.println("Numbers are equal.");
        } else {
            System.out.println("Numbers are not equal.");


        }

        int num10  = -10;
        int num20   = 10;
        if(num10 == num20) {
            System.out.println("Numbers are equal.");
        } else {
            System.out.println("Numbers are not equal.");
        }









    }
}
