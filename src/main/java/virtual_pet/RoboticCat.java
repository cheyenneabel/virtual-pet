package virtual_pet;


public class RoboticCat extends VirtualPet implements MaintenanceAndOil {
    int oil;
    int maintenance;

    public RoboticCat(String name, boolean dogOrCat, boolean isItRobo, int oil, int maintenance) {
        super(name, !dogOrCat, isItRobo);
        this.oil = oil;
        this.maintenance = maintenance;
    }

    public static int getOil() {
        return oil;
    }

    public static int getMaintenance() {
        return maintenance;
    }

    public void roboTick() {
        maintenance -= 1;
        oil -= 1;
    }

    @Override
    public void robotMaintenance() {
        oil = 10;
        maintenance = 10;
    }
}
