import java.util.Scanner;

public class HelloEverybody {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = scanner.nextLine();

        System.out.print("Enter second string: ");
        String str2 = scanner.nextLine();


        if (str1.length() > str2.length()) {
            System.out.println("Length of the longer string is: " + str1.length());
        } else if (str2.length() > str1.length()) {
            System.out.println("Length of the longer string is: " + str2.length());
        } else {
            System.out.println("Both strings are of equal length: " + str1.length());
        }
            
        }

    }





