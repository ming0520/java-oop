package lab01;

import java.util.*;

public class Q2 {

	public static void main(String[] args) {
		String dletter, path, filename, extension;
		
		System.out.print("What is the drive letter? ");
		Scanner input = new Scanner(System.in);
		dletter = input.nextLine();
		
		System.out.print("\nWhat is the path? ");
		path = input.nextLine();
		
		System.out.print("\nWhat is the file name? ");
		filename = input.nextLine();
		
		System.out.print("\nWhat is the extension? ");
		extension = input.nextLine();
		
		input.close();
		
		System.out.println("\nThe complete file name is " + dletter + ":" + path + "\\" + filename + "." + extension);

	}

}
