package virtual_pet;

import java.util.Scanner;
public class VirtualPetApplication {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("What should your pet's name be?");
        String name = input.next();
        System.out.println("Hello, " + name +"!!");

        VirtualPet virtualPet = new VirtualPet(name, 10, 10, 10);

        boolean game = true;

        while(game) {
                System.out.println("Press 1 to play with pet, increasing their happiness, 2 to add food, 3 to add water, 4 to exit");
                int newKey = input.nextInt();

                if (newKey == 4) {
                    game = false;
                    System.out.println("See you later!");
                }

                else if (newKey == 3) {
                    System.out.println("You gave " + name + " 5 servings of water.");
                    virtualPet.addWater();
                    virtualPet.tick();

                }
                if (newKey == 2) {
                    System.out.println("You gave " + name + " 5 servings of food.");
                    virtualPet.addFood();
                    virtualPet.tick();
                }

                if (newKey == 1) {
                    System.out.println("You gave " + name + " 5 units of happiness.");
                    virtualPet.changeHappiness();
                    virtualPet.tick();

                }
        }
    }}
