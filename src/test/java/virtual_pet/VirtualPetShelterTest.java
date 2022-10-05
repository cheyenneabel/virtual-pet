package virtual_pet;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class VirtualPetShelterTest {

    @Test
    public void shelterHasPets() {
        VirtualPetShelter myShelter = new VirtualPetShelter();

        myShelter.petStats();

        assertTrue(myShelter.getPets().containsKey("Yuki"));
    }

    @Test
    public void shelterCanAdmitPets() {
        VirtualPetShelter myShelter = new VirtualPetShelter();

        myShelter.admitPets("Teddy");

        assertTrue(myShelter.getPets().containsKey("Teddy"));
    }

    @Test
    public void shelterCanAdoptOut(){
       VirtualPetShelter myShelter = new VirtualPetShelter();

       myShelter.adoptOut("Dorian");

       assertFalse(myShelter.getPets().containsKey("Dorian"));

    }

    @Test
    public void tick() {
        VirtualPetShelter myShelter = new VirtualPetShelter();

        myShelter.tick();

        assertEquals(myShelter.getPets().get("Yuki").getWater(), 9);
    }
}

