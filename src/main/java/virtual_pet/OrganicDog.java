package virtual_pet;

public class OrganicDog extends VirtualPet implements walking, cleanBathroomMess {

    public OrganicDog(String name, boolean dogOrCat, int happiness, int food, int water, int cageOrLitter) {
        super(name, dogOrCat);
    }

    @Override
    public void dogWalk() {
        happiness += 4;
        water -= 1;
        food -= 1;
        cageOrLitter -=3;
    }

    @Override
    public void cleanCageOrLitter() {
        cageOrLitter = 0;
    }
}
