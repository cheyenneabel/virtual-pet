package virtual_pet;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class VirtualPetShelter {
    Map<String, VirtualPet> pets = new HashMap<String, VirtualPet>();

    public VirtualPetShelter() {

        OrganicCat yuki = new OrganicCat("Yuki",false , 10, 10, 10, 0);
        OrganicCat zeppy = new OrganicCat("Zeppy",  false,10, 10, 10, 0);
        OrganicDog dorian = new OrganicDog("Dorian", true,  10, 10, 10, 0);
        RoboticCat lucy = new RoboticCat("Lucy", false, 10, 10);
        RoboticDog maggie = new RoboticDog("Maggie", true, 10, 10);
        RoboticDog orson = new RoboticDog("Orson", true, 10, 10);
        pets.put("Yuki", yuki);
        pets.put("Zeppy", zeppy);
        pets.put("Dorian", dorian);
        pets.put("Lucy", lucy);
        pets.put("Maggie", maggie);
        pets.put("Orson", orson);

    }

    public Map<String, VirtualPet> getPets() {
        return pets;
    }


    public void petStats() {
        for (Map.Entry<String, VirtualPet> entry : pets.entrySet()) {
            VirtualPet virtualPet = entry.getValue();
            System.out.println(virtualPet.getName() + " is at a " + virtualPet.getHappiness() + " happy level,");
            System.out.println("has " + virtualPet.getFood() + " servings of food, and " + virtualPet.getWater());
            System.out.println(" servings of water left.");
        }
        for (Map.Entry<String, VirtualPet> entry : pets.entrySet()) {
            RoboticVirtualPet roboticVirtualPet = entry.getValue();
            System.out.println(RoboticVirtualPet).getName() + " has an oil level " + RoboticVirtualPet.getOil() + "/10");
            System.out.println("and their maintenance level is " + roboticVirtualPet.getMaintenance() + "/10");
        }
    }
    public void adoptOut(String choice) {

            pets.remove(choice);
        System.out.println("We'll miss you, funny face.");
    }

    public void admitPets(String newName,boolean dogOrCat, boolean isItRobo) {


        if (!isItRobo && dogOrCat) {
            VirtualPet virtualPet = new OrganicDog(newName, true, 10, 10, 10, 0);
            pets.put(newName, new OrganicDog(newName, true, 10, 10, 10, 0));
        }
        if (isItRobo && dogOrCat) {
            RoboticVirtualPet virtualPet = new RoboticDog(newName, true, 10, 10);
            pets.put(newName, new RoboticDog(newName, true, 10, 10));
        }
        if (!isItRobo && !dogOrCat) {
            VirtualPet virtualPet = new OrganicCat(newName, false, 10, 10, 10, 0);
            pets.put(newName, new OrganicCat(newName, false, 10, 10, 10, 0));
        }
        if (isItRobo && !dogOrCat) {
            RoboticVirtualPet virtualPet = new RoboticCat(newName, false, 10, 10);
            pets.put(newName, new RoboticCat(newName, false, 10, 10));
        }

    }

    public void feedPets() {
        for (Map.Entry<String, VirtualPet> entry : pets.entrySet()) {
            entry.getValue().addFood();
        }
    }

    public void waterPets() {
        for (Map.Entry<String, VirtualPet> entry : pets.entrySet()) {
            entry.getValue().addWater();
        }
    }

    public void giveHappyToPets() {
        for (Map.Entry<String, VirtualPet> entry : pets.entrySet()) {
            entry.getValue().changeHappiness();
        }
        System.out.println("The robots didn't seem to have interest in playtime, but that's okay.");
        System.out.println("The cats and dogs were entertained.");
    }

    public void tick() {
        for (Map.Entry<String, VirtualPet> entry : pets.entrySet()) {
            entry.getValue().tick();
        }
    }

    public void greeting() {
        System.out.println("Welcome to Silly Tails! The silliest dog and cat shelter in town.");
        System.out.println("Thanks for volunteering.");
        System.out.println("Some of our funding is due to our ongoing research with robotic pets.");
        System.out.println("There are a few of us on the premise. Feel free to interact with us as you like.");
        System.out.println("Sometimes the pets need help being adopted out to a new home");
        System.out.println("or a new pet may need admitted into Silly Tails.");
    }

    public void playerInstructions() {
        System.out.println("Press 1 to admit a new pet to Silly Tails or 2 to check in on everyone. Stats.");
        System.out.println("Press 3 to have one of us adopted into a new home, or 4 to exit the game entirely.");
        System.out.println("Press 5 to give us more food or 6 to give us more water.");
        System.out.println("Press 7 to play with us or 8 if our litter boxes and crates need to be cleaned.");
        System.out.println("Press 9 to maintain and oil our robotic critters.");
    }

    public void givePetsOil() {
        for (Map.Entry<String, RoboticVirtualPet> entry : pets.entrySet()) {
            entry.getValue().addOil();
        }
    }

    public void roboMaintenance() {
        for (Map.Entry<String, VirtualPet> entry : pets.entrySet()) {
            entry.getValue();
            if (getPets().containsValue(VirtualPet.RoboticVirtualPet));
        }
    }
    public void cleanAllCratesAndLitter() {

        if (dogOrCat instanceof VirtualPet) {
            ((OrganicDog)pets).cleanCageOrLitter();
        }
        if(OrganicCat instanceof VirtualPet) {
            ((OrganicCat)pets).cleanCageOrLitter(); }
        System.out.println("This shelter has never smelled better. All crates and litter boxes are clean.");
    }

    public void walkAllTheDogs() {
        if (OrganicDog instanceof VirtualPet) {
            ((OrganicDog)pets).dogWalk();
        }
        if (RoboticDog instanceof pets) {
            ((RoboticDog)pets).dogWalk();
        }
    }
}



