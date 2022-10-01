package virtual_pet;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class VirtualPetShelter {
    private Map<String, VirtualPet> pets = new HashMap<>();

    public void admitPet(VirtualPet pet) {
        this.pets.put(pet.getName(), pet);
    }

    public Collection<VirtualPet> allPets() {
        return this.pets.values();
    }

    public VirtualPet findPet(String name) {
        return this.pets.get(name);
    }

    public void adoptPets(String name) {
        this.pets.remove(name);
    }

    public void feedAllPets() {
        for (Entry<String, VirtualPet> fedPet : pets.entrySet()) {
            fedPet.getValue().addFood(3);
        }
    }

    public void waterAllPets() {
        for (Entry<String, VirtualPet> wateredPet : pets.entrySet()) {
            wateredPet.getValue().addWater(3);
        }
    }

    public void makePetHappy(String name) {
        this.pets.get(name).changeHappiness(5);
    }

    public void tick() {
        for (Entry<String, VirtualPet> tickedPet : pets.entrySet()) {
            String key = tickedPet.getKey();
            pets.get(key).tick();
        }
    }

    public String displayStatus() {
        String petStats = "";
        for (Entry<String, VirtualPet> eachPet : pets.entrySet()) {

        }return petStats;
    }

        public void greeting () {
            System.out.println("Welcome to Silly Tails! Our tails may be all different colors and sizes,");
            System.out.println("but they're all silly! Sometimes our water or food bowls will get low.");
            System.out.println("We're generally happy pets, but if no one plays with us,");
            System.out.println(" our happiness level goes down.Also sometimes we need help");
            System.out.println(" either being admitted into Silly Tails or adopted into a loving home.");
        }
        public void playerInstructions () {
            System.out.println("Press 4 to exit");
            System.out.println("Press 1 to admit a new pet to Silly Tails");
            System.out.println("Press 2 to check in on everyone. Stats.");
            System.out.println("Press 3 to have one of us adopted into a new home.");
            System.out.println("Press 5 to give us more food.");
            System.out.println("Press 6 to give us more water.");
            System.out.println("Press 7 to play with us");
        }
    }



