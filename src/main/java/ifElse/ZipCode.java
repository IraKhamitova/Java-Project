package ifElse;

import java.util.Scanner;

public class ZipCode {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter 5 digits zipcode");
        int ZipCode= scanner.nextInt();
        String zip=ZipCode+"";

        if (zip.length()==5&&!zip.contains("9")&&!zip.startsWith("0"));




    }
}
