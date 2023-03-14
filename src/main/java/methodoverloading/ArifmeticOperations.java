package methodoverloading;

public class ArifmeticOperations {
    public int SumOfNumbers(int a, int b) {
        return a + b;

    }

    public int sum(int a, int b, int c) {
        int sum = a + b + c;
        return sum;
    }

    public int average(int a, int b, int c, int d) {
        return (a + b + c + d) / 4;
    }

    public int average(int a, int b, int c, int d, int e, int f) {
        return (a + b + c + d + e + f) / 4;
    }

    /*
    create 2 getAreaOfTriangle methods
1. int base, int height
(1/2 * base * height)

2. int a, int b, int c

int s = (a + b + c) / 2
int area = sqrt(s (s-a)(s-b)(s-c))
Math.sqrt()
     */
    public double PerimeterOfTriangle(int base, int height) {
        int erea = 1 / 2 * base * height;
        return erea;


    }

    public double PerimeterOfTriangle(int a, int b, int c) {
        double semiPerimeter = (a + b + c) / 2;
        return Math.sqrt(semiPerimeter * (semiPerimeter - a) * (semiPerimeter - b) * (semiPerimeter - c));
    }
}
