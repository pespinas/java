package Coxe;

public class Coche {
    private double fuel;
    private double maxspeed;

    public Coche(){
        this.fuel = 0;
        this.maxspeed = 0;
    }
    public void moverse(){
        this.fuel -= 5;

    }



    public void setFuel(double fuel) {
        this.fuel = fuel;
    }
    public void setMaxspeed(double maxspeed) {
        this.maxspeed = maxspeed;
    }

    public double getFuel() {
        return fuel;
    }
    public double getMaxspeed() {
        return maxspeed;
    }
}
