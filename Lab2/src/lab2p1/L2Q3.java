package lab2p1;

import java.util.*;
import java.text.*;

public class L2Q3 {

	public static void main(String[] args) {
		Date today;
		SimpleDateFormat simpleDF1, simpleDF2;
		
		today = new Date();
		simpleDF1 = new SimpleDateFormat("dd/MM/yy hh:mm a");
		simpleDF2 = new SimpleDateFormat("EEE, MMM d, ''yy");
		
		System.out.println("Today is " + simpleDF1.format(today));
		System.out.println("Today is " + simpleDF2.format(today));

	}

}
