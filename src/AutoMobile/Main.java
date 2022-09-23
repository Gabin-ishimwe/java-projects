package AutoMobile;

public class Main {
    public static void main(String[] args) {
        System.out.println("Object Encaspulation");
        Car car1 = new Car("toyota", 2002, "v1");
        System.out.println(car1.getName());
        System.out.println(car1.setName("volkswagen"));
        System.out.println(car1.getName());

        Dog dog = new Dog();
        dog.type("Carnival");
        Cow cow = new Cow();
        cow.type("Herbivore");
    }
}
