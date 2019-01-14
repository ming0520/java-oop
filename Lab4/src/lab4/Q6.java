package lab4;

import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		int value1, value2;
		
		Scanner input = new Scanner(System.in);
		
		do {
			System.out.print("Enter two integer values: ");
			value1 = input.nextInt();
			value2 = input.nextInt();
			
			if(value1 <= 0 || value2 <= 0) {
				System.out.println("Invalid value(s) entered!");
			}
		}while(value1 <= 0 || value2 <= 0);
		
		if(value1 > value2) {
			System.out.println(value1 + " is larger than " + value2);
			if(value1 % value2 == 0) {
				System.out.println(value1 + " is divisible by " + value2);
			}
			else {
				System.out.println(value1 + " is not divisible by " + value2);
			}
		}
		else if(value2 > value1) {
			System.out.println(value2 + " is larger than " + value1);
			if(value2 % value1 == 0) {
				System.out.println(value2 + " is divisible by " + value1);
			}
			else {
				System.out.println(value2 + " is not divisible by " + value1);
			}
		}
		else {
			System.out.println("The integers are equal.\n" + value1 + " is divisible by " + value2);
		}
		
		input.close();
	}

}
