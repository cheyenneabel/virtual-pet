package virtual_pet;

 public class VirtualPet {
  public String name;
  public boolean dogOrCat;
  public int happiness;
  public int food;
  public int water;
  public int cageOrLitter;

  public VirtualPet(String name, boolean dogOrCat, int happiness, int food, int water, int cageOrLitter) {
   this.name = name;
   this.dogOrCat = dogOrCat;
   this.happiness = happiness;
   this.food = food;
   this.water = water;
   this.cageOrLitter = cageOrLitter;
  }


  public String getName() {
   return name;
  }

  public boolean getDogOrCat() {
   return dogOrCat;
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

  public int getCageOrLitter() {
   return cageOrLitter;
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
   this.cageOrLitter += 1;
  }


  }





