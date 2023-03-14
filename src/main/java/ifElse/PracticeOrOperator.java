package ifElse;

public class PracticeOrOperator {
    public static void main(String[] args) {
        String menu = "pizza lagman tea bread cake coffee water";
        if (menu.contains("pizza") && menu.contains("soda")) {
            System.out.println("Order pizza and soda");
        }


        if (menu.contains("tea") && menu.contains("coke")) {
            System.out.println("Order desert");
        }


        if (menu.contains("lagman") && menu.contains("tea")) {
            System.out.println("Order lagman and tea,asian is here!");
        }


        if (menu.contains("coffee") || menu.contains("smoothie")) {
            System.out.println("Breakfast time");
        }


        if (menu.contains("pizza") || menu.contains("pasta")) {
            System.out.println("Italian day");
        }


        if (menu.contains("tea") && menu.contains("coffee") && menu.contains("water") &&
                menu.contains("soda")) {
            System.out.println("Order drinks only");
        }

        if (!menu.contains("tea") && !menu.contains("coffee")) {
            System.out.println("water");
        }

    }
}








