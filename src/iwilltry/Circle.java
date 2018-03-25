package iwilltry;

import java.util.Scanner;

public class Circle {

	float r;

	//function for getting dimensions.
	public void getdim()
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the length and breadth of the rectangle: ");
	r = sc.nextFloat();
	}

	//function for calculating area of square and printing it.
	public void getarea()
	{
	float a = (float)3.14 * r * r;
	System.out.println("Area of given rectangle is: " + a);
	}

}
