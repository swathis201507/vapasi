import java.util.ArrayList;

public class ShapeCalculator {

    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Rectangle rectangle=new Rectangle(0,0);
        rectangle.setDimensions(5,6);

        Rectangle square=new Rectangle(0,0);
        rectangle.setDimensions(5);


        ArrayList<Shape> shapes=new ArrayList<Shape>();
        shapes.add(new Circle(3));
        shapes.add(rectangle);
        shapes.add(square);
        shapes.add(new Triangle(3.0,4.0,5.0));

        for(Shape shape:shapes)
        {
            System.out.println("Shape"+shape.getClass());
            System.out.println("Area"+shape.calculateArea());
            System.out.println("Perimeter"+shape.calculatePerimeter());
        }
    }
}
