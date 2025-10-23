public class MainClass {
    public static void main(String[] args) {
        ShapesCalculator calculator = new ShapesCalculator();

        double circleArea = calculator.area(2.0);
        double rectangleArea = calculator.area(5.0, 7.0);
        System.out.println("Area of circle: " + circleArea);
        System.out.println("Area of rectangle: " + rectangleArea);
    }
}