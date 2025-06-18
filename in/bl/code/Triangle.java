package in.bl.code;
import java.util.Scanner;

public class Triangle {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the base of the triangle in inches: ");
        double base = scanner.nextDouble();

        System.out.print("Enter the height of the triangle in inches: ");
        double height = scanner.nextDouble();

        double areaInches = 0.5 * base * height;

        double areaCm = areaInches * 6.4516;

        System.out.println("The area of the triangle is " + areaInches + " square inches and " +
                           String.format("%.2f", areaCm) + " square centimeters.");

        scanner.close();
    }
}
