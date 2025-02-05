//Nicholas
import java.util.Scanner;
public class Tip {

	public static void main(String[] args) {
		final String NAME = "Nicholas Barkero";
		System.out.print("TIP PROGRAM by " + NAME);
		double subTotal; 
		Scanner input = new Scanner(System.in);
		System.out.print("\n\nEnter the subtotal for your restaurant bill >> ");
		subTotal = input.nextDouble();
		int percent;
		System.out.print("Enter a whole number as the tip percentage you want calculated >> ");
		percent = input.nextInt();
		double totalTip = calcTip(subTotal, percent);
		double totalBill = calcTotal(subTotal, totalTip);
		display(subTotal, percent, totalTip, totalBill);
		input.close();
	}
	
	public static double calcTip(double subTotal, int percent) {
		double tipDecimal = (double)percent/100;
		double totalTip = tipDecimal * subTotal;
		return totalTip;
	}
	
	public static double calcTotal(double subTotal, double totalTip) {
		double totalBill = subTotal + totalTip;
		return totalBill;
	}
	
	public static void display(double subTotal, int percent, double totalTip, double totalBill) {
		System.out.printf("\nSubtotal of the restaurant bill is $%,.2f. With a(an) %,d%% tip, the tip amount would be $%,.2f and the total would be $%,.2f.", subTotal, percent, totalTip, totalBill);
	}
}
