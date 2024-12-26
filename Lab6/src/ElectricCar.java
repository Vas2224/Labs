class ElectricCar extends Vehicle implements Fuelable {
    double batteryLevel; //double - тип данных для работы с др. знач

    public ElectricCar(String brand, String model) {
        super(brand, model);
        this.batteryLevel = 0;
    }

    @Override
    public void start() {
        System.out.println("ElectricCar" + this + " запущено");
    }

    @Override
    public void stop() {
        System.out.println("ElectricCar" + this + " остановлено");
    }

    @Override
    public void refuel(int percent) {
        batteryLevel += percent;
        if (batteryLevel > 100) {
            batteryLevel = 100;
            System.out.println("ElectricCar" + this + " заряжен полностью");
        } else {
            System.out.println("ElectricCar " + " заряжен до " + batteryLevel + "%");
        }
    }
    @Override
    public int getFuelLevel() { //возвр. текущий уровень заряда батареи
        return (int) batteryLevel;
    }
}