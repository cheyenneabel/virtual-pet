package virtual_pet;

import java.util.Objects;
import java.util.Scanner;

public class VirtualPetApplication {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        VirtualPetShelter myShelter= new VirtualPetShelter();

        myShelter.greeting();

        boolean game = true;

        while (game) {
            myShelter.playerInstructions();
            int newKey = input.nextInt();

            if (newKey == 9) {
                myShelter.tick();
                myShelter.roboMaintenance();
                System.out.println("All the robots are oiled up and maintenance levels are 10/10.");
                System.out.println("They're like energizer bunnies.");
            }

            if (newKey == 8) {
                myShelter.tick();
                myShelter.cleanAllCratesAndLitter();
                myShelter.playerInstructions();
            }

            if (newKey == 7) {
                myShelter.tick();
                System.out.println("Would you like to play inside with all the pets, or take the dogs on a walk?");
                System.out.println("Type \"Play\" to stay inside. Type \"Walk\" to walk the dogs.");
                String timeForWalk = input.nextLine();
                System.out.println(input.nextLine());
                if (Objects.equals(timeForWalk, "Play") || Objects.equals(timeForWalk, "play")) {
                    myShelter.giveHappyToPets();
                    System.out.println("The pets LOVED the game. Their happiness increased");
                } if (Objects.equals(timeForWalk, "Walk") || Objects.equals(timeForWalk, "walk")) {
                    myShelter.walkAllTheDogs();
                    System.out.println("The dogs are so much happier after the walk! They got a little thirsty though.");
                }
            }

            if (newKey == 6) {
                myShelter.tick();
                myShelter.waterPets();
                System.out.println("These pets won't be thirsty today! Thanks for the water.");
            }

            if (newKey == 5) {
                myShelter.tick();
                myShelter.feedPets();
                System.out.println("They say thank you for the food.");
                myShelter.playerInstructions();

            }

            if (newKey == 4) {
                game = false;
                myShelter.tick();
                System.out.println("See you later!");
            }

            if (newKey == 3) {
                System.out.println("Which pet has a new home to go live in?");
                System.out.println(input.nextLine());
                String choice = input.nextLine();
                myShelter.adoptOut(choice);
                myShelter.tick();
                myShelter.playerInstructions();

            }
            if (newKey == 2) {
                System.out.println("Who all is here, anyway?");
                System.out.println("Let's check in on their stats.");
                myShelter.tick();
                myShelter.petStats();

            }
            if (newKey == 1) {
                myShelter.tick();
                System.out.println("Another silly tail? What is their name?");
                input.nextLine();
                String newName = input.nextLine();
                System.out.println("Is it a dog? Enter \"false\" for cat or \"true\" for dog.");
                boolean dogOrCat = Boolean.parseBoolean(input.nextLine());
                System.out.println("Is it a robot? Enter \"false\" for organic animal or \"true\" for robot.");
                boolean isItRobo = Boolean.parseBoolean(input.nextLine());
                if(!dogOrCat && !isItRobo) {
                    myShelter.admitPets(newName, false, false);
                }
                if(!dogOrCat && isItRobo) {
                    myShelter.admitPets(newName, false, true);
                }
                if(dogOrCat && !isItRobo) {
                    myShelter.admitPets(newName, true, false);
                }
                if(dogOrCat && isItRobo) {
                    myShelter.admitPets(newName, true, true);
                }
                System.out.println("That name makes me laugh. The new critter is happy to be here.");

            }
        }
    }
}





