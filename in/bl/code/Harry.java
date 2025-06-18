package in.bl.code;
import java.util.Scanner;
public class Harry {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Harry's birth year: ");
        int birthYear = scanner.nextInt();

        System.out.print("Enter the current year: ");
        int currentYear = scanner.nextInt();

        int age = 0;

        for (int year = birthYear; year < currentYear; year++) {
            age++;
        }

        System.out.println("Harry's age in " + currentYear + " is " + age);

        scanner.close();
    }
}
