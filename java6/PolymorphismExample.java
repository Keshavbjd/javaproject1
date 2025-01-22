// Parent class: Animal
class Animal {
    // Method to make a sound, can be overridden in child classes
    public void makeSound() {
        System.out.println("The animal makes a sound.");
    }
}

// Child class: Dog (inherits from Animal)
class Dog extends Animal {
    // Overriding the makeSound method specific to Dog
    @Override
    public void makeSound() {
        System.out.println("The dog barks.");
    }
}

// Child class: Cat (inherits from Animal)
class Cat extends Animal {
    // Overriding the makeSound method specific to Cat
    @Override
    public void makeSound() {
        System.out.println("The cat meows.");
    }
}

// Main class to test polymorphism
public class PolymorphismExample {
    public static void main(String[] args) {
        // Creating objects of Animal, Dog, and Cat
        Animal animal = new Animal();  // Animal object
        Animal dog = new Dog();        // Dog object, but referenced as Animal
        Animal cat = new Cat();        // Cat object, but referenced as Animal

        // Calling makeSound() method on different objects
        animal.makeSound();  // Output: The animal makes a sound.
        dog.makeSound();     // Output: The dog barks.
        cat.makeSound();     // Output: The cat meows.
    }
}
