package lab4;

import java.util.*;
import java.math.*;

public class Q1 {

	public static void main(String[] args) {
		BigDecimal Number1, Number2;
		
		Scanner input = new Scanner(System.in);
		
		System.out.printf("Enter two numbers ");
		Number1 = input.nextBigDecimal();
		Number2 = input.nextBigDecimal();
		
		input.close();

		if(Number1.compareTo(Number2) > 0) {
			System.out.println(Number1.stripTrailingZeros() + " is larger than " + Number2.stripTrailingZeros());
		}
		else if(Number1.compareTo(Number2) == 0) {
			System.out.println("They are equal.");
		}
		else {
			System.out.println(Number2.stripTrailingZeros() + " is larger than " + Number1.stripTrailingZeros());
		}
	}

}
