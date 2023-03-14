import java.util.Scanner;

public class AscendingOrders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ascending");
        int aa= scanner.nextInt();
        System.out.println("Enter first number");
        int bb=scanner.nextInt();
        System.out.println("Enter second number");
        int cc=scanner.nextInt();
        System.out.println("Enter third number");
        int dd= scanner.nextInt();
        System.out.println("Forth number");

        if (aa>bb && aa>cc && aa>dd){
            System.out.println(aa+bb+cc+dd);
            
        } else if (dd>cc&& cc>bb && bb>aa) {
            System.out.println(dd+cc+bb+aa);

            
        }


    }
}
