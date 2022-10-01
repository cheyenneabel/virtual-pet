package virtual_pet;

import java.util.Scanner;

public class VirtualPetApplication {

    public static void main(String[] args) {
        VirtualPetShelter myShelter = new VirtualPetShelter();
        Scanner input = new Scanner(System.in);
        myShelter.greeting();

        System.out.println("We currently have one silly tail with us.");
        System.out.println("Her name is Yuki. She is a silly black cat.");
        myShelter.admitPet(new VirtualPet("Yuki", 10, 10, 10));

        boolean game = true;

        while (game) {
            myShelter.playerInstructions();
            int newKey = input.nextInt();
            String name;
            String petDescription;

            if (newKey == 4) {
                game = false;
                System.out.println("See you later!");
            }

            if (newKey == 3) {
                System.out.println("Which pet has a new home to go live in?");
                String choice = input.nextLine();
                myShelter.adoptPets(choice);
                myShelter.tick();

            }
            if (newKey == 2) {
                System.out.println("Who all is here, anyway? Are they happy with full bellies?");
                System.out.println(myShelter.displayStatus());
                myShelter.tick();
            }
            if (newKey == 1) {
                System.out.println("Another silly tail? What is their name?");
                String newName = input.nextLine();
                myShelter.admitPet(new VirtualPet(newName, 10, 10, 10));
                System.out.println("Welcome, " + newName + "!!!");
                myShelter.tick();
            }
            if (newKey == 5) {
                myShelter.feedAllPets();
                System.out.println("They say thank you for the food.");
                myShelter.tick();
            }
            if (newKey == 6) {
                myShelter.waterAllPets();
                System.out.println("They say thank you for the water");
                myShelter.tick();
            }
            if (newKey == 7) {
                System.out.println("Which pet do you want to play with?");
                String petChoice = input.nextLine();
                myShelter.makePetHappy(petChoice);
                System.out.println("They are soooooo happy now.");
            }
        }
    }
}






