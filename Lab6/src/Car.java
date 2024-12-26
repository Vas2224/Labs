class Car extends Vehicle implements Fuelable{
    int fuelLevel;
    public Car(String brand, String model){
        super(brand, model); //передает параметры brand и model из Vehicle
        this.fuelLevel = 0; // уровень топлива ноль
    }
    @Override
    public void start(){
        System.out.println("Car" + this + " запущено"); //this вызывает метод toString
    }
    @Override
    public void stop(){
        System.out.println("Car" + this + " остановлено");
    }
    @Override
    public void refuel(int liters){
        fuelLevel += liters; //увелич. кол-во топлива на указ. кол-во
        System.out.println("Car" + this + " заправился " + liters + " литров. Уровень топлива: " + fuelLevel);
    }
    @Override
    public int getFuelLevel(){
        return fuelLevel;
    }
}
