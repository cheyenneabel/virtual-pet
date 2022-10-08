package virtual_pet;

public class RoboticCat extends VirtualPet {

    public RoboticCat(String name, boolean dogOrCat, int oil, int maintenance) {
        super(name, !dogOrCat, oil, maintenance);
    }
}
