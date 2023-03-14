package loops;

public class PracticeLoops {
    public static void main(String[] args) {
        for (int x = 10; x > 1; x--) {
            System.out.println(x);
        }
        for (int b = 10; b >= 0; b -= 2) {
            System.out.println(b);
        }
        int sum = 0;
        for (int c = 1; c >= 10; c++) {
            System.out.println(c);
            sum = sum + c;

        }
        System.out.println("The result is" + sum);

        int s =0;
        for ( int s1 = 0; s<=100 ; s+=2){
            System.out.println(s);
            sum = sum+s;
        }

        System.out.println("The result is "+sum);

    }







    }

