package PolyMorphism;

public class Main {
    public static void main(String[] args) {
        Fish fish = new Fish();
        Cat cat = new Cat();
        Dog dog = new Dog();

        Animal animal = new Dog();
        animal.sound();
        System.out.println("poly-----");

        Animal[] animals = {fish, cat, dog};
        for(Animal x:animals) {
            x.sound();
        }

    }


}
