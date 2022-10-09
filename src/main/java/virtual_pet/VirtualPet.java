package virtual_pet;

 public class VirtualPet {
  public String name;
  public boolean dogOrCat;
  public  boolean isItRobo;



  public VirtualPet(String name, boolean dogOrCat, boolean isItRobo) {
   this.name = name;
   this.dogOrCat = dogOrCat;
   this.isItRobo = isItRobo;

  }

  public String getName() {
   return name;
  }

  public boolean getDogOrCat() {
   return dogOrCat;
  }

  public boolean getIsItRobo() { return isItRobo; }

  }






