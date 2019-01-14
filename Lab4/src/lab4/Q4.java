package lab4;

import java.util.*;
import java.text.*;

public class Q4 {

	public static void main(String[] args) {
		double weight = 0, charge = 0;
		
		DecimalFormat df = new DecimalFormat("0.00");
		Scanner input = new Scanner(System.in);
		
		do {
			System.out.print("WEIGHT: ");
			weight = input.nextDouble();
			
			if(weight <= 1) {
				charge = 10;
			}
			else if(weight > 1) {
				charge = (10 + ((weight-1) * 6));
			}
			else {
				System.out.println("Invalid value. Please enter again.");
			}
		}while(weight <= 0);
		
		input.close();
		
		System.out.println("CHARGE: " + df.format(charge));

	}

}
