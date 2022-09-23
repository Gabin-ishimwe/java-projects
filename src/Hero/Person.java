package Hero;

public class Person {
    protected String name;
    protected int age;
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void secretId() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.name);
    }

}
