package virtual_pet;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class VirtualPetApplication {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        VirtualPetShelter myShelter= new VirtualPetShelter();
        Map<String, VirtualPet> pets = new HashMap<>();

        myShelter.greeting();

        System.out.println("We currently have one silly tail with us.");
        System.out.println("Her name is Yuki. She is a silly black cat.");

        VirtualPet yuki = new VirtualPet("Yuki", 10, 10, 10);

        pets.put("Yuki", yuki);

        boolean game = true;

        while (game) {
            myShelter.playerInstructions();
            int newKey = input.nextInt();

            if (newKey == 4) {
                game = false;
                System.out.println("See you later!");
            }

            if (newKey == 3) {
                System.out.println("Which pet has a new home to go live in?");
                String choice = input.nextLine();
                pets.remove(choice);
                System.out.println("We'll miss you, funny face.");
                myShelter.tick();

            }
            if (newKey == 2) {
                System.out.println("Who all is here, anyway?");
                System.out.println(pets.keySet());
                System.out.println("Are they happy and hydrated with full bellies?");
                myShelter.tick();
                myShelter.getPets();

            }
            if (newKey == 1) {
                System.out.println("Another silly tail? What is their name?");
                String newName = input.nextLine();
                System.out.println(newName);
                System.out.println("That name makes me laugh.");
                VirtualPet virtualPet = new VirtualPet(newName, 10, 10, 10);
                pets.put(newName, virtualPet);
                myShelter.tick();
            }
        }
    }
}





