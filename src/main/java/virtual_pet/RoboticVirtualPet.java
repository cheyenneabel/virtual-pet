package virtual_pet;

public class RoboticVirtualPet {
    String name;
    boolean dogOrCat;
    int oil;
    int maintenance;

    RoboticVirtualPet(String name, boolean dogOrCat, int oil, int maintenance) {

        this.name = name;
        this.dogOrCat = dogOrCat;
        this.oil = oil;
        this.maintenance = maintenance;
}
    public String getName() {
        return name;
    }

    public int getMaintenance() {
        return maintenance;
    }

    public int getOil() {
        return oil;
    }
    public void addOil() {
        oil += 3;
    }

    public void doMaintenance() {
        maintenance += 3;
    }

    public void tickForRobos() {
        maintenance -= 1;
        oil -=1;
    }

}