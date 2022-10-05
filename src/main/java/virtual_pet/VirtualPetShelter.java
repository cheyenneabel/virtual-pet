package virtual_pet;

import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {

    Map<String, VirtualPet> pets = new HashMap<>();

    public void getPets() {
        for (Map.Entry<String, VirtualPet> entry : pets.entrySet()) {
            VirtualPet virtualPet = entry.getValue();
            System.out.println(virtualPet.getName() + "is at a " + virtualPet.getHappiness() + " happy level");
            System.out.println("has " + virtualPet.getFood() + " servings of food, and " + virtualPet.getWater());
            System.out.println(" servings of water left.");
        }
    }


    public void tick(){
        for (Map.Entry<String, VirtualPet> entry : pets.entrySet()) {
            VirtualPet virtualPet = entry.getValue();
            virtualPet.tick();
        }

    }

    public void greeting() {
        System.out.println("Welcome to Silly Tails! Our tails may be all different colors and sizes,");
        System.out.println("but they're all silly! Sometimes our water or food bowls will get low.");
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



