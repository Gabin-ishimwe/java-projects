package AutoMobile;

public class Dog implements Animal{
    @Override
    public void type(String arg) {
        System.out.println("This animal is a " + arg);
    }
}
