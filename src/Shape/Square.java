package Shape;

public class Square extends Shape{
    @Override
    void perimeter(int side1, int side2) {
        int perimeter = side1 + side2;
        System.out.println(perimeter);
    }

    @Override
    void area(int side1, int side2) {
        int area = side1 * side2;
        System.out.println(area);
    }
}
