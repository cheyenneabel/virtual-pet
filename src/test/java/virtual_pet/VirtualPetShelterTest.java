package virtual_pet;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class VirtualPetShelterTest {
    @Test
    public void shelterHasPets() {
        VirtualPetShelter myShelter = new VirtualPetShelter();

        myShelter.getPets();

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

        OrganicCat superOrganicCat = new OrganicCat("Yuki", false, false, 10, 10, 10, 0);
        superOrganicCat.tick();


        assertEquals(superOrganicCat.getWater(), 9);
    }
}








