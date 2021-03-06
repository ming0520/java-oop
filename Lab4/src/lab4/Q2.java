package lab4;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		final double TAXA = 0.07;
		final double TAXB = 0.05;
		char country;
		double total;
		
		DecimalFormat df = new DecimalFormat("0.00");
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("AMOUNT OF PURCHASE? ");
		double amount = input.nextDouble();
		
		System.out.print("COUNTRY? ");
		country = input.next().toUpperCase().charAt(0);
		
		input.close();

		if(country == 'A') {
			total = amount + (amount * TAXA); 
		}
		else {
			total = amount + (amount * TAXB);
		}
		
		System.out.println("TOTAL BILL: " + df.format(total));
		
	}

}
