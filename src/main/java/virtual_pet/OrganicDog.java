package virtual_pet;

public class OrganicDog extends VirtualPet implements walking, cleanBathroomMess {

    public int happiness;
    public int food;
    public int water;
    public int cageOrLitter;

    public OrganicDog(String name, boolean dogOrCat, boolean isItRobo, int happiness, int food, int water, int cageOrLitter) {
        super(name, dogOrCat, isItRobo);

        this.happiness = happiness;
        this.food = food;
        this.water = water;
        this.cageOrLitter = cageOrLitter;
    }

    public static int getHappiness() {
        return happiness;
    }

    public static int getFood() {
        return food;
    }

    public static int getWater() {
        return water;
    }

    public int getCageOrLitter() {
        return cageOrLitter;
    }

    public void addFood() {
        food += 5;
    }

    public void addWater() {
        water += 5;
    }

    public void addHappiness() {
        happiness += 5;
    }

    @Override
    public void dogWalk() {
        happiness += 4;
        water -= 1;
        food -= 1;
        cageOrLitter -= 3;
    }

    @Override
    public void cleanCageOrLitter() {
        cageOrLitter = 0;
    }

    public void tick() {
        this.food -= 1;
        this.water -= 1;
        this.happiness -= 1;
        this.cageOrLitter += 1;

    }
}
