package lab2p1;

import java.util.*;

public class Ch2RecordFiling {

	public static void main(String[] args) {
		String firstName, lastName;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Your full name: ");
		firstName = scanner.next();
		lastName = scanner.next();
		
		System.out.println("Your medical record is filed under " + lastName + ", " + firstName + ".");
		scanner.close();
				
	}

}
