package AutoMobile;

public class Car {
    private String name;
    private int year;
    private String version;
    Car(String name, int year, String version) {
        this.name = name;
        this.year = year;
        this.version = version;
    }

    String getName() {
        return this.name;
    }

    String setName(String name) {
        this.name = name;
        return this.name;
    }
}
