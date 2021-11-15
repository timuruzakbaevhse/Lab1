package HW;

import java.util.Scanner;

public class Lab1 {

	public static void main(String[] args) {

		
		
		
        Scanner sc = new Scanner(System.in);
		System.out.print("Введите 4 числа через пробел:");
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		
		if (a<=b && a<=d && a<=d )
			System.out.println("Наименьшее число" + " = " + a);
		else if (b<=a && b<=c && b<=d )
			System.out.println("Наименьшее число" + " = " + b);
		else if (c<=a && c<=b && c<=d )
			System.out.println("Наименьшее число" + " = " + c);
		else if (d<=a && d<=b && d<=c )
			System.out.println("Наименьшее число" + " = " + d);
		
		
		
		
		
		
			

	}

}
