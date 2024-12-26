public class Main {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[]{
                new Car("Toyota", "Camry"),
                new Truck("Volvo", "FH16"),
                new ElectricCar("Porsche", "Taycan 4S")
        };
        for (Vehicle vehicle: vehicles){
            vehicle.start();//вызываем методы start and stop
            vehicle.stop();
            ((Fuelable) vehicle).refuel(30);
            ((Fuelable)vehicle).refuel(5.5); //перегруженная версия метода refuel
            System.out.println("Уровень топлива: " + ((Fuelable)vehicle).getFuelLevel());
        }
    }
}
