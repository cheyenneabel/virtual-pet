package virtual_pet;

import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {
    Map<String, VirtualPet> pets = new HashMap<>();

    public VirtualPetShelter() {
        OrganicCat yuki = new OrganicCat("Yuki", false, false, 10, 10, 10, 0);
        OrganicCat zeppy = new OrganicCat("Zeppy", false, false, 10, 10, 10, 0);
        OrganicDog dorian = new OrganicDog("Dorian", true, false, 10, 10, 10, 0);
        RoboticCat lucy = new RoboticCat("Lucy", false, true, 20, 20);
        RoboticDog maggie = new RoboticDog("Maggie", true, true, 20, 20);
        RoboticDog orson = new RoboticDog("Orson", true, true, 20, 20);
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
            if (virtualPet instanceof OrganicCat superOrganicCat) {
                System.out.println(superOrganicCat.getName() + " is at a " + superOrganicCat.getHappiness() + " happy level,");
                System.out.println("has " + superOrganicCat.getFood() + " servings of food, has " + superOrganicCat.getWater());
                System.out.println(" servings of water left, and their litter box has a dirty level of ");
                System.out.println(superOrganicCat.getCageOrLitter() + "/10.");
            }
            if (virtualPet instanceof OrganicDog superOrganicDog) {
                System.out.println(superOrganicDog.getName() + " is at a " + superOrganicDog.getHappiness() + " happy level,");
                System.out.println("has " + superOrganicDog.getFood() + " servings of food, has " + superOrganicDog.getWater());
                System.out.println(" servings of water left, and their crate has a dirty level of ");
                System.out.println(superOrganicDog.getCageOrLitter() + "/10.");
            }
            if (virtualPet instanceof RoboticDog superRoboticDog) {
                System.out.println(superRoboticDog.getName() + " has an oil level " + superRoboticDog.getOil());
                System.out.println("and their maintenance level is " + superRoboticDog.getMaintenance());
            }
            if (virtualPet instanceof RoboticCat superRoboticCat) {
                System.out.println(superRoboticCat.getName() + " has an oil level " + superRoboticCat.getOil());
                System.out.println("and their maintenance level is " + superRoboticCat.getMaintenance());
            }
        }
    }

    public void adoptOut(String choice) {
        pets.remove(choice);
        System.out.println("We'll miss you, funny face.");
    }

    public void admitPets(String newName, boolean dogOrCat, boolean isItRobo) {

        if (dogOrCat && !isItRobo) {
            OrganicDog virtualPet = new OrganicDog(newName, true, false, 10, 10, 10, 0);
            pets.put(newName, new OrganicDog(newName, true, false, 10, 10, 10, 0));
        }
        if (isItRobo && dogOrCat) {
            RoboticDog virtualPet = new RoboticDog(newName, true, true, 20, 20);
            pets.put(newName, new RoboticDog(newName, true, true, 20, 20));
        }
        if (!isItRobo && !dogOrCat) {
            OrganicCat virtualPet = new OrganicCat(newName, false, false, 10, 10, 10, 0);
            pets.put(newName, new OrganicCat(newName, false, false, 10, 10, 10, 0));
        }
        if (isItRobo && !dogOrCat) {
            RoboticCat virtualPet = new RoboticCat(newName, false, true, 20, 20);
            pets.put(newName, new RoboticCat(newName, false, true, 20, 20));
        }

    }

    public void feedPets() {
        for (Map.Entry<String, VirtualPet> entry : pets.entrySet()) {
            VirtualPet virtualPet = entry.getValue();
            if (virtualPet instanceof OrganicDog superOrganicDog) {
                superOrganicDog.addFood();
            }
            if (virtualPet instanceof OrganicCat superOrganicCat) {
                superOrganicCat.addFood();
            }
        }
    }

    public void waterPets() {
        for (Map.Entry<String, VirtualPet> entry : pets.entrySet()) {
            VirtualPet virtualPet = entry.getValue();
            if (virtualPet instanceof OrganicDog superOrganicDog) {
                superOrganicDog.addWater();
            }
            if (virtualPet instanceof OrganicCat superOrganicCat) {
                superOrganicCat.addWater();
            }
        }
    }

    public void giveHappyToPets() {
        for (Map.Entry<String, VirtualPet> entry : pets.entrySet()) {
            VirtualPet virtualPet = entry.getValue();
            if (virtualPet instanceof OrganicCat superOrganicCat) {
                superOrganicCat.addHappiness();
            }
            if (virtualPet instanceof OrganicDog superOrganicDog) {
                superOrganicDog.addHappiness();
            }
        }
        System.out.println("The robots didn't seem to have interest in playtime, but that's okay.");
        System.out.println("The cats and dogs were entertained.");
    }

    public void tick() {
        for (Map.Entry<String, VirtualPet> entry : pets.entrySet()) {
            VirtualPet virtualPet = entry.getValue();
            if (virtualPet instanceof OrganicDog superOrganicDog) {
                superOrganicDog.tick();
            }
            if (virtualPet instanceof OrganicCat superOrganicCat) {
                superOrganicCat.tick();
            }
            if (virtualPet instanceof RoboticDog superRoboticDog) {
                superRoboticDog.tick();
            }
            if (virtualPet instanceof RoboticCat superRoboticCat) {
                superRoboticCat.tick();
            }
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

    public void roboMaintenance() {
        for (Map.Entry<String, VirtualPet> entry : pets.entrySet()) {
            VirtualPet virtualPet = entry.getValue();
            if (virtualPet instanceof RoboticDog superRoboticDog) {
                superRoboticDog.robotMaintenance();
            }
            if (virtualPet instanceof RoboticCat superRoboticCat) {
                superRoboticCat.robotMaintenance();
            }
        }
    }
    public void cleanAllCratesAndLitter() {
        for (Map.Entry<String, VirtualPet> entry : pets.entrySet()) {
            VirtualPet virtualPet = entry.getValue();
            if (virtualPet instanceof OrganicDog superOrganicDog) {
                superOrganicDog.cleanCageOrLitter();
            }
            if (virtualPet instanceof OrganicCat superOrganicCat) {
                superOrganicCat.cleanCageOrLitter();
            }
            System.out.println("This shelter has never smelled better. All crates and litter boxes are clean.");
        }
    }


    public void walkAllTheDogs() {
        for (Map.Entry<String, VirtualPet> entry : pets.entrySet()) {
            VirtualPet virtualPet = entry.getValue();
            if (virtualPet instanceof OrganicDog superOrganicDog) {
                superOrganicDog.dogWalk();
                superOrganicDog.tick();
            }
            if (virtualPet instanceof walking) {
                if (virtualPet instanceof RoboticDog superRoboticDog) {
                    superRoboticDog.dogWalk();
                    superRoboticDog.tick();
                    System.out.println("The organic dogs got to use the bathroom outside and they're happier!");
                    System.out.println("It made them a little hungry, though");
                    System.out.println("The robotic dogs came along, but it didn't seem to affect them too much.");
                }

            }
        }
    }
}




