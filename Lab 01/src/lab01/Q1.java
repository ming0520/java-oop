package lab01;

import java.util.*; 

public class Q1 {

	public static void main(String[] args) {
		int op = 1, a, b, trueans, studans;
		
		do {
			System.out.println("Please enter the operation you want to perform:-\n1. Addition\n2. Subtraction\n3. Multiplication\n4. Division");
			
			Scanner input = new Scanner(System.in);
			op = input.nextInt();
			
			Random rand = new Random();
			a = rand.nextInt((50 - 1) + 1) + 1;
			
			b = rand.nextInt((50 - 1) + 1) + 1;
			
			if(op == 1) {
				System.out.println(a + " + " + b + " = ?");
				System.out.print("Please enter your answer: ");
				studans = input.nextInt();
				
				trueans = a + b;
				
				if(studans == trueans) {
					System.out.println("Your answer is correct!");
				}
				else {
					System.out.println("Your answer is incorrect. The correct answer is " + trueans + ".");
				}
			}
			else if(op == 2) {
				System.out.println(a + " - " + b + " = ?");
				System.out.print("Please enter your answer: ");
				studans = input.nextInt();
				
				trueans = a - b;
				
				if(studans == trueans) {
					System.out.println("Your answer is correct!");
				}
				else {
					System.out.println("Your answer is incorrect. The correct answer is " + trueans);
				}
			}
			else if(op == 3) {
				System.out.println(a + " * " + b + " = ?");
				System.out.print("Please enter your answer: ");
				studans = input.nextInt();
				
				trueans = a * b;
				
				if(studans == trueans) {
					System.out.println("Your answer is correct!");
				}
				else {
					System.out.println("Your answer is incorrect. The correct answer is " + trueans);
				}
			}
			else if(op == 4) {
				System.out.println(a + " / " + b + " = ?");
				System.out.print("Please enter your answer: ");
				studans = input.nextInt();
				
				trueans = a / b;
				
				if(studans == trueans) {
					System.out.println("Your answer is correct!");
				}
				else {
					System.out.println("Your answer is incorrect. The correct answer is " + trueans);
				}
			}
			else {
				System.out.println("Invalid choice! Please choose again.");
			}
			
			input.close();
		}while(op < 1 || op > 4);

	}

}
