package objects;


public class Car {
    String model;
    int year;
    int price;
    String color;


   public void drive() { System.out.println(model+"is driving");

   }public  void stop() {
       System.out.println(model + color + year + " Stop" );
   }
       public  void playMusic() {
           System.out.println(model + color + year + " Playing music" );
       }



    public static void main(String[] args) {

        Car car1 = new Car();
        car1.model = " Hyundai ";
        car1.color = " Blue ";
        car1.year = 2023;
        car1.price = 3000;

        Car car2 = new Car();
        car2.model = " Volkswagen ";
        car2.color = " Red ";
        car2.year = 2011;
        car2.price = 120000;

        car1.drive();
        car2.drive();

        car1.stop();
        car2.stop();

        car1.playMusic();
        car1.playMusic();


}



    }

