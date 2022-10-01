package virtual_pet;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class virtualPetTest {
    @Test
    public void makeName() {
        //assignment
        String cat;
        VirtualPet Puffy = new VirtualPet("Puffy", 10, 10, 10);
        //action
        String name = Puffy.getName();
        //assertion
        assertEquals("Puffy", name);
    }

    @Test
    public void happinessLevel() {
        //assignment
        VirtualPet Puffy = new VirtualPet("Puffy", 10, 10, 10);
        //action
        int happiness = Puffy.getHappiness();
        //assertion
        assertEquals(10, happiness);
    }
    @Test
    public void foodLevel() {
        //assignment
        VirtualPet Puffy = new VirtualPet("Puffy", 10, 10, 10 );
        //action
        int food = Puffy.getFood();
        //assertion
        assertEquals(10, food);
    }
    @Test
    public void waterLevel() {
        //assignment
        VirtualPet Puffy = new VirtualPet("Puffy", 10, 10, 10);
        //action
        int water = Puffy.getWater();
        //assertion
        assertEquals(10, water);
    }

    @Test
    public void changeHappiness() {
        //assignment
        VirtualPet Puffy = new VirtualPet("Puffy", 10, 10, 10);
        //action
        Puffy.changeHappiness(5);
        int happiness = Puffy.getHappiness();
        //assertion
        assertEquals(15, happiness);
    }

    @Test
    public void addFood() {
        //assignment
        VirtualPet Puffy = new VirtualPet("Puffy",10,10, 10);
        //action
        Puffy.addFood(5);
        int food = Puffy.getFood();
        //assertion
        assertEquals(15, food);

    }
    @Test
    public void addWater() {
        //assignment
        VirtualPet Puffy = new VirtualPet("Puffy",10, 10, 10);
        //action
        Puffy.addWater(5);
        int water = Puffy.getWater();
        //assertion
        assertEquals(15, water);
    }


}

