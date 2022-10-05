package virtual_pet;

import java.util.Scanner;

public class VirtualPetApplication {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        VirtualPetShelter myShelter= new VirtualPetShelter();

        myShelter.greeting();

        System.out.println("We currently have three silly tails with us.");
        System.out.println("Three cats named Yuki, Zeppy, and Dorian");

        boolean game = true;

        while (game) {
            myShelter.playerInstructions();
            int newKey = input.nextInt();

            if (newKey == 7) {
                myShelter.giveHappyToPets();
                System.out.println("We like when you play with us! We have a higher level of happiness now.");
                myShelter.tick();
            }

            if (newKey == 6) {
                myShelter.waterPets();
                System.out.println("These pets won't be thirsty today! Thanks for the water.");
                myShelter.tick();
            }

            if (newKey == 5) {
                myShelter.feedPets();
                System.out.println("They say thank you for the food.");
                myShelter.tick();
            }

            if (newKey == 4) {
                game = false;
                System.out.println("See you later!");
            }

            if (newKey == 3) {
                System.out.println("Which pet has a new home to go live in?");
                System.out.println(input.nextLine());
                String choice = input.nextLine();
                myShelter.adoptOut(choice);
                System.out.println("We'll miss you, funny face.");
                myShelter.tick();

            }
            if (newKey == 2) {
                System.out.println("Who all is here, anyway?");
                System.out.println("Are they happy and hydrated with full bellies?");
                myShelter.tick();
                myShelter.petStats();

            }
            if (newKey == 1) {
                System.out.println("Another silly tail? What is their name?");
                input.nextLine();
                String newName = input.nextLine();
                myShelter.admitPets(newName);
                System.out.println("That name makes me laugh.");
                myShelter.tick();
            }
        }
    }
}





