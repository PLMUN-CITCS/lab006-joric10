import java.util.Scanner;

public class CircleCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask the user for input
        System.out.print("Enter the radius of the circle: ");
        double radius = input.nextDouble();

        // Calculate area and circumference
        double area = Math.PI * Math.pow(radius, 2);   // A = πr²
        double circumference = 2 * Math.PI * radius;   // C = 2πr

        // Output results
        System.out.println("\n=== Circle Calculations ===");
        System.out.printf("Radius        : %.2f%n", radius);
        System.out.printf("Area          : %.2f square units%n", area);
        System.out.printf("Circumference : %.2f units%n", circumference);

        // Close scanner
        input.close();
    }
}
