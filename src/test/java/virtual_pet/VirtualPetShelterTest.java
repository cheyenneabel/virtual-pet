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

    @Test
    public void canFeedPets() {
        VirtualPetShelter myShelter = new VirtualPetShelter();

        myShelter.feedPets();

        assertEquals(myShelter.getPets().get("Yuki").getFood(), 13);
    }

    @Test
    public void canWaterPets() {
        VirtualPetShelter myShelter = new VirtualPetShelter();

        myShelter.waterPets();

        assertEquals(myShelter.getPets().get("Yuki").getWater(), 13);
    }
    @Test
    public void canGivePetsHappiness() {
        VirtualPetShelter myShelter = new VirtualPetShelter();

        myShelter.giveHappyToPets();

        assertEquals(myShelter.getPets().get("Yuki").getHappiness(), 13);
    }
}

