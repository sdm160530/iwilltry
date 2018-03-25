package iwilltry;

import java.util.Scanner;

public class Rectangle {

float l;
float b;

//function for getting dimensions.
public void getdim()
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the length and breadth of the rectangle: ");
l = sc.nextFloat();
b = sc.nextFloat();
}

//function for calculating area of square and printing it.
public void getarea()
{
float a = l * b;
System.out.println("Area of given rectangle is: " + a);
}

}
