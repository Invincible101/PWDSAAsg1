
//Create a superclass called Animal with a method makeSound() that prints the sound
//made by the animal. Implement subclasses Dog, Cat, and Cow that inherit from the
//Animal class. Implement the makeSound() method in each subclass to print the sound 
//made by a dog, cat, and cow, respectively.

class Animal {
    public void makeSound() {
        System.out.println("Animal Makes Sound");
    }
}


class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog: Bhou bhou");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Cat: meow");
    }
}

class Cow extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Cow: mooes");
    }
}


public class demo {
    public static void main(String[] args) {

        Animal animal = new Animal();
        animal.makeSound();

        Dog myDog = new Dog();
        myDog.makeSound();

        Cat cat = new Cat();
        cat.makeSound();

        Cow cow = new Cow();
        cow.makeSound();
    }
}
