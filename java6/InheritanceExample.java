// Parent class: Animal
class Animal {
    // Attributes (fields)
    private String name;
    private int age;

    // Constructor to initialize the Animal object
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display the animal's details
    public void displayInfo() {
        System.out.println("Animal Name: " + name);
        System.out.println("Animal Age: " + age);
    }

    // Method to make a generic sound (can be overridden by child classes)
    public void makeSound() {
        System.out.println("The animal makes a sound.");
    }
}

// Child class: Dog (inherits from Animal)
class Dog extends Animal {
    // Additional attribute specific to Dog
    private String breed;

    // Constructor to initialize Dog object, using the parent constructor
    public Dog(String name, int age, String breed) {
        super(name, age);  // Calling the constructor of the parent class (Animal)
        this.breed = breed;
    }

    // Overriding the makeSound method specific to Dog
    @Override
    public void makeSound() {
        System.out.println("The dog barks.");
    }

    // Method to display additional info specific to Dog
    public void displayDogInfo() {
        displayInfo();  // Calling the parent class method
        System.out.println("Dog Breed: " + breed);
    }
}

// Main class to test the parent-child relationship
public class InheritanceExample {
    public static void main(String[] args) {
        // Creating an Animal object
        Animal animal = new Animal("Generic Animal", 5);
        animal.displayInfo();  // Displaying info of a generic animal
        animal.makeSound();    // Calling the makeSound method of the Animal class

        // Creating a Dog object
        Dog dog = new Dog("Buddy", 3, "Golden Retriever");
        dog.displayDogInfo();  // Displaying info of a Dog
        dog.makeSound();       // Calling the overridden makeSound method of the Dog class
    }
}
