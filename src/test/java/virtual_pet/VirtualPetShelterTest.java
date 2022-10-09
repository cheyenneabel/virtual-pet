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

        myShelter.admitPets("Teddy", true, false);

        assertTrue(myShelter.getPets().containsKey("Teddy"));
    }

    @Test
    public void shelterCanAdoptOut() {
        VirtualPetShelter myShelter = new VirtualPetShelter();

        myShelter.adoptOut("Orson");

        assertFalse(myShelter.getPets().containsKey("Orson"));
    }

    @Test
    public void tick() {
        VirtualPetShelter myShelter = new VirtualPetShelter();

        myShelter.tick();

        assertEquals(myShelter.getPets().get("Yuki"), 9);
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

    @Test
    public void canOilRoboticPets() {

        VirtualPetShelter myShelter = new VirtualPetShelter();

        myShelter.givePetsOil();

        assertEquals(myShelter.getPets().get("Orson").getOil(), 13);

    }

    @Test
    public void canPerformMaintenanceOnRoboPets() {

        VirtualPetShelter myShelter = new VirtualPetShelter();

        myShelter.roboMaintenance();

        assertEquals(myShelter.getPets().get("Maggie").getMaintenance(), 13);
    }

    @Test
    public void canCleanAllTheBathroomMess() {
        VirtualPetShelter myShelter = new VirtualPetShelter();

        myShelter.tick();
        myShelter.cleanAllCratesAndLitter();

        assertEquals(myShelter.getPets().get("Yuki").getCrateOrLitter(), 0);
    }

    @Test
    public void canWalkAllDogs() {
        VirtualPetShelter myShelter = new VirtualPetShelter();

        myShelter.walkAllTheDogs();

        assertEquals(myShelter.getPets().get("Dorian").getWater(), 9);

    }
}



