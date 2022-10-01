package virtual_pet;

 public class VirtualPet {
     public String name;
     public int happiness;
     public int food;
     public int water;

     public VirtualPet(String name, int happiness, int food, int water) {

         this.name = name;
         this.happiness = 10;
         this.food = 10;
         this.water = 10;
     }

     public String getName() {
         return name;
     }

     public int getHappiness() {
         return happiness;
     }

     public int getFood() {
         return food;
     }

     public int getWater() {
         return water;
     }

     public void changeHappiness(int numberToAdd) {
         happiness = happiness + numberToAdd;
     }

     public void addFood(int numberToAdd) {

         food = food + numberToAdd;
     }

     public void addWater(int numberToAdd) {

         water = water + numberToAdd;
     }

     public void tick() {
         this.food -= 1;
         this.water -= 1;
         this.happiness -= 1;

     }

     public void shareStatus() {
         System.out.println(name + "has a happy level of " + happiness + ", has " + food + " servings of food left");
         System.out.println("and " + " servings of water left.");
     }
 }





