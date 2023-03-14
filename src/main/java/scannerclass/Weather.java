package scannerclass;

import java.util.Scanner;

public class Weather {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter temperature");
        double temp = scanner.nextDouble();

        System.out.println("Is it raining? true/false ");
        boolean isRaining = scanner.nextBoolean();

        if (temp < 0) {
            System.out.println("It's freezing outside! Wear a heavy coat, gloves, and a hat.");
        } else if (isRaining && temp >= 0 && temp <= 10) {
            System.out.println("It's chilly and rainy! Wear a raincoat, boots, and a scarf.");
        }


        if (temp >= 0 && temp <= 10 && !isRaining) {
            System.out.println("It's chilly outside! Wear a jacket, gloves, and a hat.");
        } else if (temp >= 11 && temp <= 20 && isRaining) {
            System.out.println("It's cool and rainy! Wear a light jacket, boots, and a scarf.");
        }


        if (temp >= 11.0 && temp <= 20.0 && !isRaining) {
            System.out.println("It's cool outside! Wear a light jacket and comfortable shoes.");
        } else if (temp > 20.0 && isRaining) {
            System.out.println("It's warm and rainy! Wear a light jacket, shorts, and sandals.");
        } else if (temp > 20.0 && !isRaining) {
            System.out.println("It's warm outside! Wear a t-shirt, shorts, and comfortable shoes.");
        } else {
            System.out.println("The weather does not match the specified conditions.");
        }


    }


}








