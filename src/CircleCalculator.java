public class CircleCalculator {
    public static void main(String[] args) {
        double circleRadius = 12.0;
        double circleDiameter = circleRadius * 2;
        double circleCircumference = circleRadius * 2 * Math.PI;
        double circleArea = circleRadius * circleRadius * Math.PI;

        System.out.println("Diameter is: " + circleDiameter + " cm.");
        System.out.println("Circumference is: " + circleCircumference + " cm.");
        System.out.println("Area is: " + circleArea + " cm2.");
    }
}
