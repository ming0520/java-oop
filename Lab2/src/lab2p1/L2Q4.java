package lab2p1;

import java.util.*;

public class L2Q4 {

	public static void main(String[] args) {
		String id, firstName, lastName, grade;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your student ID: ");
		id = scanner.next();
		System.out.print("Enter your first name: ");
		firstName = scanner.next();
		System.out.print("Enter your last name: ");
		lastName = scanner.next();
		System.out.print("Enter your target grade for CISB254: ");
		grade = scanner.next();
		scanner.close();
		
		System.out.println("You have entered the followings");
		System.out.println("ID: " + id);
		System.out.println("First name: " + firstName);
		System.out.println("Last name: " + lastName);
		System.out.println("Targetted grade: " + grade);
		
	}

}
