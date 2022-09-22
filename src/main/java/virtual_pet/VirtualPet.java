package virtual_pet;

public class VirtualPet {

    private String name;
    private int happiness = 10;
    private int food = 10;
    private int water = 10;

    public VirtualPet(String name, int happiness, int food, int water) {

        this.name = name;
        this.happiness = happiness;
        this.food = food;
        this.water = water;
    }


    public String getName() {
        return name;
    }
    public int getHappiness() {
        return happiness;
    }
    public int getFood() {
        return food;
    }
    public int getWater() {
        return water;
    }
    public void changeHappiness() {

        happiness += 5;
    }
    public void addFood() {

        food += 5;
    }
    public void addWater() {

        water += 5;
    }

    public void tick() {

        happiness -= 2;
        food -= 1;
        water -= 1;

        System.out.println("My happiness level is " + happiness + ", I have " + food + " meals left, and I have " + water + " remaining servings of water.");

    }
}
