package constructor;
public class Car3 {

    String brand;
    String model;
    int year;

    public Car3(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public Car3() {
        this("Audi", "S10", 2013); 
    } 

    public static void main(String[] args) {
        Car3 car1 = new Car3("Toyota", "Camry", 2022);
        Car3 car2 = new Car3();

        System.out.println("Car 1: " + car1.brand + " " + car1.model + " " + car1.year);
        System.out.println("Car 2: " + car2.brand + " " + car2.model + " " + car2.year);
    }
}
