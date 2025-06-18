package in.bl.code;
import java.util.Scanner;

public class Profit {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the Cost Price (INR): ");
        double costPrice = scanner.nextDouble();

        System.out.print("Enter the Selling Price (INR): ");
        double sellingPrice = scanner.nextDouble();

        double profitOrLoss = sellingPrice - costPrice;
        double percent = (profitOrLoss / costPrice) * 100;

        String result = (profitOrLoss >= 0) ? "Profit" : "Loss";
        profitOrLoss = Math.abs(profitOrLoss);
        percent = Math.abs(percent);

        System.out.println(
            "The Cost Price is INR " + costPrice + " and Selling Price is INR " + sellingPrice + "\n" +
            "The " + result + " is INR " + profitOrLoss + " and the " + result + " Percentage is " + String.format("%.2f", percent)
        );

        scanner.close();
    }
}
