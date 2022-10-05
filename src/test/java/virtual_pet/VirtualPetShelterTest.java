package virtual_pet;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class VirtualPetShelterTest {

    @Test
    public void shelterCanAdmitPets() {
        Map<String, VirtualPet> pets = new HashMap<>();
        VirtualPet puffy = new VirtualPet("Puffy", 10, 10, 10);

        pets.put("Puffy", puffy);

        assertTrue(pets.containsKey("Puffy"));
    }

    @Test
    public void shelterCanAdoptOut(){
        Map<String, VirtualPet> pets = new HashMap<>();
        VirtualPet puffy = new VirtualPet("Puffy", 10, 10, 10);
        VirtualPet dorian = new VirtualPet("Dorian", 10, 10, 10);
        pets.put("Puffy", puffy);
        pets.put("Dorian", dorian);

        pets.remove("Dorian", dorian);

        assertFalse(pets.containsKey("Dorian"));

    }

    @Test
    public void tick() {
        Map<String, VirtualPet> pets = new HashMap<>();
        VirtualPet puffy = new VirtualPet("Puffy", 10, 10, 10);
        VirtualPet dorian = new VirtualPet("Dorian", 10, 10, 10);
        pets.put("Puffy", puffy);

        puffy.tick();
        int water = puffy.getWater();

        assertEquals(9, water);

    }
}

