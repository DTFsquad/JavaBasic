public class SquareCalculator {
    //creating a new Java class
    public static void main(String[] args) {
        //declaring the variables
        double width = 13.5;
        double height = 25.3;
        double perimeter = (width + height)*2;
        double area = width*height;
        //printing the string
        System.out.println("The width is: " + width + " cm.");
        System.out.println("The height is: " + height + " cm.");
        System.out.println("The perimeter is: " + perimeter + " cm.");
        System.out.println("The area is: " + area + " cm2.");
    }
}
