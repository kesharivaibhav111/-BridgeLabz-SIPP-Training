package in.bl.code;
import java.util.Scanner;

public class Pi {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of Earth in kilometers: ");
        double radiusKm = scanner.nextDouble();

        double volumeKm3 = (4.0 / 3.0) * Math.PI * Math.pow(radiusKm, 3);

        double conversionFactor = Math.pow(0.621371, 3);
        double volumeMiles3 = volumeKm3 * conversionFactor;

        System.out.println("The volume of Earth in cubic kilometers is " + volumeKm3 + 
                           " and in cubic miles is " + volumeMiles3);

        scanner.close();
    }
}	
