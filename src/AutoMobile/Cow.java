package AutoMobile;

public class Cow implements Animal{
    @Override
    public void type(String arg) {
        System.out.println("This animal is a " + arg);
    }
}
