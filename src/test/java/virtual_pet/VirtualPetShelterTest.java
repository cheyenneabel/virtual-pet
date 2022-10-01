package virtual_pet;

import org.junit.jupiter.api.Test;

import java.util.Collection;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VirtualPetShelterTest {

    VirtualPetShelter virtualShelterUnderTest = new VirtualPetShelter();
    VirtualPet testPet1 = new VirtualPet("Dorian", 10, 10, 10);

    @Test
    public void canAdoptPet() {
        virtualShelterUnderTest.admitPet(testPet1);
        virtualShelterUnderTest.adoptPets("Dorian");
        Collection<VirtualPet> retrievedCollection = virtualShelterUnderTest.allPets();
        assertEquals(0, virtualShelterUnderTest);
    }
    @Test
    public void canWaterAllPetsInShelter() {
        virtualShelterUnderTest.admitPet(testPet1);
        virtualShelterUnderTest.admitPet(new VirtualPet("Cecil", 10, 10, 10));
        virtualShelterUnderTest.waterAllPets();
        VirtualPet retrievedPet = virtualShelterUnderTest.findPet("Cecil");
        assertEquals(retrievedPet.getWater(), 13);
    }

    @Test
    public void tickShouldSubtractThreeToEachCategory() {
        virtualShelterUnderTest.admitPet(testPet1);
		virtualShelterUnderTest.admitPet(new VirtualPet("Cecil", 10, 10, 10));
		virtualShelterUnderTest.tick();
    VirtualPet retrievedPet = virtualShelterUnderTest.findPet("Cecil");
    assertEquals(retrievedPet.getFood(), 9);
    assertEquals(retrievedPet.getWater(), 9);
    assertEquals(retrievedPet.getHappiness(), 9);
    }
}
