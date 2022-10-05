package virtual_pet;

import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {
    Map<String, VirtualPet> pets = new HashMap<>();


    public VirtualPetShelter() {

        VirtualPet yuki = new VirtualPet("Yuki", 10, 10, 10);
        VirtualPet zeppy = new VirtualPet("Zeppy", 10, 10, 10);
        VirtualPet dorian = new VirtualPet("Dorian", 10, 10, 10);
        pets.put("Yuki", yuki);
        pets.put("Zeppy", zeppy);
        pets.put("Dorian", dorian);

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
    }

    public void adoptOut(String choice) {

        pets.remove(choice);
    }

    public void admitPets (String newName) {

        pets.put(newName, new VirtualPet("newName", 10, 10, 10));

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
    }

    public void tick(){
        for (Map.Entry<String, VirtualPet> entry : pets.entrySet()) {
            entry.getValue().tick();
        }

    }

    public void greeting() {
        System.out.println("Welcome to Silly Tails! Our tails may be all different colors and sizes,");
        System.out.println("but they're all silly! 2Sometimes our water or food bowls will get low.");
        System.out.println("We're generally happy pets, but if no one plays with us,");
        System.out.println(" our happiness level goes down.Also sometimes we need help");
        System.out.println(" either being admitted into Silly Tails or adopted into a loving home.");
    }

    public void playerInstructions() {
        System.out.println("Press 1 to admit a new pet to Silly Tails");
        System.out.println("Press 2 to check in on everyone. Stats.");
        System.out.println("Press 3 to have one of us adopted into a new home.");
        System.out.println("Press 4 to exit");
        System.out.println("Press 5 to give us more food.");
        System.out.println("Press 6 to give us more water.");
        System.out.println("Press 7 to play with us");
    }

}



