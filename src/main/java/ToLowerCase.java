import java.util.Scanner;

public class ToLowerCase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter word");
        String str= sc.next();
        System.out.println(str.toLowerCase());
    }
}
