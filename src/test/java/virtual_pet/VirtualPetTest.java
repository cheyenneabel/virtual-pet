package virtual_pet;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VirtualPetTest {
        @Test
        public void makeName() {
            //assignment
            OrganicCat Puffy = new OrganicCat("Puffy", false, false, 10, 10, 10, 0);
            //action
            String name = Puffy.getName();
            //assertion
            assertEquals("Puffy", name);
        }

        @Test
        public void happinessLevel() {
            //assignment
            OrganicCat Puffy = new OrganicCat("Puffy", false, false, 10, 10, 10, 0);
            //action
            int happiness = Puffy.getHappiness();
            //assertion
            assertEquals(10, happiness);
        }
        @Test
        public void foodLevel() {
            //assignment
            OrganicCat Puffy = new OrganicCat("Puffy", false, false, 10, 10, 10, 0);
            //action
            int food = Puffy.getFood();
            //assertion
            assertEquals(10, food);
        }
        @Test
        public void waterLevel() {
            //assignment
            OrganicCat Puffy = new OrganicCat("Puffy", false, false, 10, 10, 10, 0);
            //action
            int water = Puffy.getWater();
            //assertion
            assertEquals(10, water);
        }

        @Test
        public void changeHappiness() {
            //assignment
            OrganicCat Puffy = new OrganicCat("Puffy", false, false, 10, 10, 10, 0);
            //action
            Puffy.addHappiness();
            int happiness = Puffy.getHappiness();
            //assertion
            assertEquals(15, happiness);
        }

        @Test
        public void addFood() {
            //assignment
            OrganicCat Puffy = new OrganicCat("Puffy", false, false, 10, 10, 10, 0);
            //action
            Puffy.addFood();
            int food = Puffy.getFood();
            //assertion
            assertEquals(15, food);

        }
        @Test
        public void addWater() {
            //assignment
            OrganicCat Puffy = new OrganicCat("Puffy", false, false, 10, 10, 10, 0);
            //action
            Puffy.addWater();
            int water = Puffy.getWater();
            //assertion
            assertEquals(15, water);
        }

        @Test
        public void canWalkDog() {
            OrganicDog chloe = new OrganicDog("Chloe", true,false, 10, 10, 10, 0);

            chloe.dogWalk();

            assertEquals(chloe.getHappiness(), 14);
        }

    }

