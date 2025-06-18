package in.bl.code;
import java.util.Scanner;

public class Yard {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the distance in feet: ");
        double distanceInFeet = scanner.nextDouble();

        double distanceInYards = distanceInFeet / 3;
        double distanceInMiles = distanceInYards / 1760;

        System.out.println("The distance is " + distanceInFeet + " feet, which is " + 
                           String.format("%.2f", distanceInYards) + " yards and " + 
                           String.format("%.5f", distanceInMiles) + " miles.");

        scanner.close();
    }
}
