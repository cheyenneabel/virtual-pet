package virtual_pet;

public class RoboticDog extends VirtualPet implements walking {
    int oil;
    int maintenance;

    public RoboticDog(String name, boolean dogOrCat, boolean isItRobo,  int oil, int maintenance) {
        super(name, dogOrCat, isItRobo);
    }

    @Override
    public void dogWalk() {
        oil -= 1;
        maintenance -= 1;
    }
}
