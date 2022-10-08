package virtual_pet;

public class OrganicCat extends VirtualPet implements cleanBathroomMess {

    public OrganicCat(String name, boolean dogOrCat, int happiness, int food, int water, int cageOrLitter) {
        super(name, !dogOrCat, happiness, food, water, cageOrLitter);
    }

    @Override
    public void cleanCageOrLitter() {
        cageOrLitter = 0;
    }
}
