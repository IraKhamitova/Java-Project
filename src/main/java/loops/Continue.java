package loops;

import java.util.Scanner;

public class Continue {
    public static void main(String[] args) {
        for (int i1 = 1; i1 <= 100; i1++) {

            if (i1 % 2 == 0) {
                continue;

            }
            System.out.println(i1);
        }
        for (int a1 = 1; a1 <= 100; a1++) {

            if (a1 % 3 == 0) {
                continue;


            }
            int a = -15;
            int b = 25;
            Scanner sc = new Scanner(System.in);

            int negative = sc.nextInt();
            System.out.println("Enter one positive number");
            int positive = sc.nextInt();
            System.out.println("Enter one negative number");

            for (int i = negative; i <= positive; i++) {

                if (i < 0 && i % 2 == 0) {
                    continue;


                } else if (i>0 && i % 2!=0) {
                    continue;
                }
                    
                }
            }
        }
    }
    
