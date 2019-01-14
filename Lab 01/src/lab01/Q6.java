package lab01;

import java.util.*;
import java.lang.Math;

public class Q6 {

	public static void main(String[] args) {
		final double PI = 3.142;
		double sliceArea = 14.125;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("What is the diameter of the pizza to be ordered (in inches): ");
		double diameter = input.nextDouble();
		System.out.print("How many people are at the party? ");
		int people = input.nextInt();
		
		input.close();
		
		double area = PI * (diameter / 2) * (diameter / 2);
		int pizza = (int)Math.ceil((people * sliceArea) / area);
		
		System.out.println("The number of required pizzas is: " + pizza);

	}

}