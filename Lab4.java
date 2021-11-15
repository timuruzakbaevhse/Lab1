package zadanie;

import java.util.Scanner;

public class Lab1_4 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in) ;
		System.out.print ("Enter a number of month: ");
		int a = in.nextInt();
		
		if (a>=3 && a<= 5)
			System.out.print( "This is the month of spring");
		else if (a>=6 && a<= 8)
			System.out.print("This is the month of summer");
		else if (a>=9 && a<= 11)
			System.out.print("This is the month of autumn");
		else if ( a>=1 && a<=2)
			System.out.print("This is the month of winter");
		else if ( a==12)
			System.out.print("This is the month of winter");

	}

}
