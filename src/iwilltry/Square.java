package iwilltry;

import java.util.Scanner;

public class Square {

	float l;
	
	public void getdim()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of each side:");
		l = sc.nextFloat();
	}
	
	public void getarea()
	{
		float a = l * l;
		System.out.println("Area of the square is" + a);
	}
	
}
