package homework;

import java.util.Scanner;

public class SquarePerimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the width of the square: ");
        int width = sc.nextInt();
        System.out.println("calculate the area or perimeter: ");
        String areaOrPerimeter = sc.next();

        switch (areaOrPerimeter.toLowerCase()) {
            case "area":
                int area = width * width;
                System.out.println("The area of the square is:" + area);
                break;
            case "perimeter":
                int perimeter = 4 * width;
                System.out.println("The perimeter of square " + perimeter + " and the area of the square");
                break;
            default:
                System.out.println("Invalid input.");
                break;
        }

    }

}

