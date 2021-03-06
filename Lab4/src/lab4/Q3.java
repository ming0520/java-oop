package lab4;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		char grade;
		int grade_points = 0;
		
		Scanner input = new Scanner(System.in);
		
		do {
			System.out.print("Letter grade: ");
			grade = input.next().toUpperCase().charAt(0);
			
			if(grade == 'A') {
				grade_points = 4;
			}
			else if(grade == 'B') {
				grade_points = 3;
			}
			else if(grade == 'C') {
				grade_points = 2;
			}
			else if(grade == 'D') {
				grade_points = 1;
			}
			else if(grade == 'F') {
				grade_points = 0;
			}
			else {
				System.out.println("Invalid value. Please enter again.");
			}
		}while(grade != 'A' && grade != 'B' && grade != 'C' && grade != 'D' && grade !='F');
		
		input.close();
		
		System.out.println("Grade point: " + grade_points);
	}

}
