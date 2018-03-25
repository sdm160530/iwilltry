package iwilltry;

import java.util.*;


public class Calculator {

private static void p(String x) {

	System.out.println(x);
}
	
public static void main(String[] args)
{
	p(" Welcome to Area Calculator "); 
	Scanner sc = new Scanner(System.in);
	int choice;
	boolean n  = true;
	// Based on your args, find what operation you want
    choice = sc.nextInt();
	
	//Now apply in 
	switch(choice)
	{
	
		case 1:
			//square.
			Square s1 = new Square();
			s1.getdim(); // gets the side of the square and stores it in s1.side
			s1.getarea(); // calculates the area and prints it.
			break;
		case 2:
			//rectangle
			Rectangle r1 = new Rectangle();
			r1.getdim();
			r1.getarea();
			break;
		case 3: 
			//circle
			Circle c1 = new Circle();
			c1.getdim();
			c1.getarea();
			break;
		case 4:
			System.out.println(" Thank you for using Area Calculator!");
			n = false;
			break;
		default:
			System.out.println("Please select from given options!");
	}
	
}

}
