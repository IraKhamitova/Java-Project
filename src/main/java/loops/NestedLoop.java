package loops;

public class NestedLoop {
    public static void main(String[] args) {
        for (int a = 1; a <= 15; a++) {
            for (int b = 1; b <= 15; b++) {
                System.out.print((a * b) + " \t");
            }
            System.out.println();

        }
        for (int row = 1; row <= 6; row++) {
            for (int numberOfstars = 1; numberOfstars <= row; numberOfstars++) {
                System.out.print((row * numberOfstars) + " \t");
            }
            System.out.print("*");


        }
        for (int row = 1; row <= 10; row++) {
            for (int numberOfstars = 1; numberOfstars <= row; numberOfstars++) {
                System.out.print("*");
            }
            System.out.println();


        }
        for (int r = 1; r <= 10; r++) {
            for (int n = 1; n <= r; n++) {
                System.out.print("*");
            }
            System.out.println();

        }
        for (int row = 1; row <= 10; row++) {
            for (int numberOfstars = 1; numberOfstars <= row; numberOfstars++) {
                System.out.print("*");
            }
            System.out.println();

        }


        int rows = 6;
        for (int i = rows / 2; i <= rows; i += 2) {
            for (int j = 1; j < rows - i; j += 2) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = rows; i >= 1; i--) {
            for (int j = i; j < rows; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (i * 2) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
