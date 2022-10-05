package virtual_pet;

public class Dog extends VirtualPet{
    public Dog(String name, String dog, int happiness, int food, int water) {
        super(name, 10,10, 10);
        System.out.println("Hello, best friend!");
    }
}
