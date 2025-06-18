package in.bl.code;
import java.util.Scanner;

public class Average {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Sam's Maths mark: ");
        int maths = scanner.nextInt();

        System.out.print("Enter Sam's Physics mark: ");
        int physics = scanner.nextInt();

        System.out.print("Enter Sam's Chemistry mark: ");
        int chemistry = scanner.nextInt();

        int totalMarks = maths + physics + chemistry;
        double average = totalMarks / 3.0;

        System.out.println("Sam’s average mark in PCM is " + average);

        scanner.close();
    }
}
