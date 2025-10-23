public class ShapeMain {

   /* public static void main (String[] args)
    {
        Shape square = new Square(10.2);
        square.area();

        Shape triangle = new Triangle(10,5);
        triangle.area();

    }*/

    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println("Shape area: " + shape.area()); // calls parent method

        Triangle triangle = new Triangle(10, 5);
        System.out.println("Triangle area: " + triangle.area()); // calls overridden method
    }
}
