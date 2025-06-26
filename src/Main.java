//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Rectangle rectangle=new Rectangle(3,4);
        rectangle.setDimensions(5,6);
        rectangle.setDimensions(4);
       System.out.println(rectangle.calculateArea());
       System.out.println(rectangle.calculatePerimeter());
    }
    }
