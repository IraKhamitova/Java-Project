import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any word:");
        String word = sc.nextLine();

        if(word.toLowerCase().contains("java")){
            System.out.println("YES, contains Java");
        }else{
            System.out.println("NO, doesn't contain Java");
        }
        }
    }

