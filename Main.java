// Superclass
class Animal {
    // Method to be overridden
    public void sound() {
        System.out.println("The animal makes a sound");
    }
}

// Subclass
class Dog extends Animal {
    // Overriding the sound method
    @Override
    public void sound() {
        System.out.println("The dog barks");
    }
}

// Subclass
class Cat extends Animal {
    // Overriding the sound method
    @Override
    public void sound() {
        System.out.println("The cat meows");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal myAnimal = new Animal(); // Creating an Animal object
        Animal myDog = new Dog();       // Creating a Dog object
        Animal myCat = new Cat();       // Creating a Cat object

        // Calling the sound method on each object
        myAnimal.sound();  // Output: The animal makes a sound
        myDog.sound();     // Output: The dog barks
        myCat.sound();     // Output: The cat meows
    }
}

