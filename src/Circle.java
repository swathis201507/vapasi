public class Circle extends Shape{

    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {

        double pi = 3.142, area;
        // calculating the area of the circle
        area = pi * radius * radius;

        return area;
    }

    @Override
    double calculatePerimeter() {
        return 0;
    }
}
