package in.bl.code;
import java.util.Scanner;

public class Distance {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter distance in kilometers: ");
        double kilometers = scanner.nextDouble();

        double miles = kilometers * 1.6;

        System.out.println("The distance " + kilometers + " km in miles is " + miles);

        scanner.close();
    }
}
