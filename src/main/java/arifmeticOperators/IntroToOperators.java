package arifmeticOperators;

public class IntroToOperators {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int c = a + b;
        System.out.println(c);//15;
        c = a - b;//10-5
        System.out.println(c);//5
        c = a + a + a;//10+10+10
        System.out.println(c);//30
        a = c - b;//30
        System.out.println(c);

        a = 100;
        b = 25;
        c = 10;
        System.out.println(a + "/" + c + "=" + a / c);
        System.out.println(b + "*" + c + "=" + a * c);



    }
}