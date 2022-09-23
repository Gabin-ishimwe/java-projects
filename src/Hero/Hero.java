package Hero;

public class Hero extends Person {
    String power;

    Hero(String power, String name, int age) {
        super(name, age);
        this.power = power;
    }

    void indentity() {
        System.out.println("Name: " + this.name);
    }

    void secrets() {
        super.secretId();
    }
}
