package lab01;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {		
		System.out.print("Please enter an integer >= 1000: ");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		
		input.close();

		recurse(num);
		
	}
	
	public static void recurse(int number) {
		int rem;
		
		rem = number % 1000;
		number /= 1000;
		if(number > 0) {
			recurse(number);
		}
		
		if(rem >= 100) {
			System.out.print("," + rem);
		}
		else {
			System.out.print(rem);
		}
		return;
	}

}
