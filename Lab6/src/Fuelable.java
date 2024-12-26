interface Fuelable {
    void refuel(int liters);
    int getFuelLevel(); //возвр. текущий уровень топлива
    default void refuel(double gallons){
        refuel((int) (gallons * 3.785));
    }
}