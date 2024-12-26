abstract class Vehicle {
    String brand;
    String model;
    public Vehicle(String brand, String model){
        this.brand = brand;
        this.model = model;
    }
    abstract void start();
    abstract void stop();
    @Override
    public String toString() {
        return " бренд: " + brand + ", модель: " + model;
    }
}
