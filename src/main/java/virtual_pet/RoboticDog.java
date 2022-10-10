package virtual_pet;

public class RoboticDog extends VirtualPet implements walking, MaintenanceAndOil {
    int oil;
    int maintenance;

    public RoboticDog(String name, boolean dogOrCat, boolean isItRobo,  int oil, int maintenance) {
        super(name, dogOrCat, isItRobo);
        this.oil = oil;
        this.maintenance = maintenance;
    }

    public int getOil() {
        return oil;
    }

    public int getMaintenance() {
        return maintenance;
    }

    public void tick() {
        maintenance -= 1;
        oil -= 1;
    }

    @Override
    public void dogWalk() {
        oil -= 1;
        maintenance -= 1;
    }

    @Override
    public void robotMaintenance() {
        oil = 10;
        maintenance = 10;
    }
}
