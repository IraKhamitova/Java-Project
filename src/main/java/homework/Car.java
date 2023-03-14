package homework;

public class Car {
        private int tires;
        private int wheels;
        private int windows;
        private int lights;
        private String color;
        private int year;
        private double price;

    public Car(int tires, int wheels, int windows, int lights, String color, int year, double price) {
        this.tires = tires;
        this.wheels = wheels;
        this.windows = windows;
        this.lights = lights;
        this.color = color;
        this.year = year;
        this.price = price;
    }

    public int getTires() {
        return tires;
    }

    public void setTires(int tires) {
        this.tires = tires;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public int getWindows() {
        return windows;
    }

    public void setWindows(int windows) {
        this.windows = windows;
    }

    public int getLights() {
        return lights;
    }

    public void setLights(int lights) {
        this.lights = lights;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}



