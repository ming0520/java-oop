package practice1;

import java.util.*;

/*public class ReverseNumber {

	public static void main(String[] args) {
		int num = 0;
		int reversenum = 0;
		
		System.out.println("Input a  number: ");
		
		Scanner input = new Scanner(System.in);
		num = input.nextInt();
		input.close();
		
		while(num != 0) {
			reversenum = reversenum * 10;
			reversenum = reversenum + num%10;
			num = num/10;
		}
		
		System.out.println("Reverse of specified number is: " + reversenum);

	}

}*/

//OR 

public class ReverseNumber{
	public static void reverseMethod(int number) {
		if(number < 10) {
			System.out.println(number);
			return;
		}
		else {
			System.out.print(number % 10);
			reverseMethod(number / 10);
		}
	}

	public static void main(String args[])
	{
		int num = 0;
		System.out.println("Input your number and press enter: ");
		Scanner in = new Scanner(System.in);
		num = in.nextInt();
		in.close();
		System.out.print("Reverse of the input number is: ");
		reverseMethod(num);
		System.out.println();
	}
}