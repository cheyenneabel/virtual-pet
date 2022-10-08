package virtual_pet;

public class RoboticDog extends RoboticVirtualPet implements walking {


    public RoboticDog(String name, boolean dogOrCat, int oil, int maintenance) {
        super(name, dogOrCat, oil, maintenance);
    }


    @Override
    public void dogWalk() {
        oil = 0;
        maintenance = 0;
    }
}
