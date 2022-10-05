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

  public void changeHappiness() {
   happiness += 3;
  }

  public void addFood() {

   food += 3;
  }

  public void addWater() {

   water += 3;
  }

  public void tick() {
   this.food -= 1;
   this.water -= 1;
   this.happiness -= 1;
  }
 }




